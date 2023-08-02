package test;

import java.util.ArrayList;
import java.util.List;

public class NewspaperCombinationCalculator {
    private List<NewspaperSubscription> subscriptions;

    public NewspaperCombinationCalculator(List<NewspaperSubscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public List<List<String>> calculateCombinations(double budget) {
        List<List<String>> combinations = new ArrayList<>();
        calculateCombinationsHelper(combinations, new ArrayList<>(), 0, budget);
        return combinations;
    }

    private void calculateCombinationsHelper(List<List<String>> combinations, List<String> currentCombination,
                                             int index, double remainingBudget) {
        if (remainingBudget < 0) {
            return;
        }

        if (index == subscriptions.size()) {
            if (remainingBudget == 0) {
                combinations.add(new ArrayList<>(currentCombination));
            }
            return;
        }

        NewspaperSubscription currentSubscription = subscriptions.get(index);
        double[] dailyPrices = currentSubscription.getDailyPrices();

        for (int i = 0; i < dailyPrices.length; i++) {
            currentCombination.add(currentSubscription.getNewspaperName());
            calculateCombinationsHelper(combinations, currentCombination, index + 1, remainingBudget - dailyPrices[i]);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
