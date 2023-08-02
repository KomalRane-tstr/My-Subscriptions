package test;



class NewspaperSubscription {
	private String newspaperName;
    private double[] dailyPrices;

    public NewspaperSubscription(String newspaperName, double[] dailyPrices) {
        this.newspaperName = newspaperName;
        this.dailyPrices = dailyPrices;
    }

    public String getNewspaperName() {
        return newspaperName;
    }

    public double[] getDailyPrices() {
        return dailyPrices;
    }
}




