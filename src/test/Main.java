package test;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<NewspaperSubscription> subscriptions = Arrays.asList(
            new NewspaperSubscription("TOI", new double[]{3, 3, 3, 3, 3, 5, 6}),
            new NewspaperSubscription("Hindu", new double[]{2.5, 2.5, 2.5, 2.5, 2.5, 4, 4}),
            new NewspaperSubscription("ET", new double[]{4, 4, 4, 4, 4, 4, 10}),
            new NewspaperSubscription("BM", new double[]{1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5}),
            new NewspaperSubscription("HT", new double[]{2, 2, 2, 2, 2, 4, 4})
        );

        double weeklyBudget = 40;
        NewspaperCombinationCalculator calculator = new NewspaperCombinationCalculator(subscriptions);
        List<List<String>> combinations = calculator.calculateCombinations(weeklyBudget);

        for (List<String> combination : combinations) {
            System.out.println(combination);
        }
    }
}

