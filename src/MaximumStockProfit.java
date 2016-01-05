public class MaximumStockProfit {

	/*
	 * Suppose we could access yesterday's stock prices as an array, where: The
	 * indices are the time in minutes past trade opening time, which was 9:30am
	 * local time. The values are the price in dollars of Apple stock at that
	 * time. So if the stock cost $500 at 10:30am, stockPricesYesterday[60] =
	 * 500.
	 * 
	 * Write an efficient function that takes stockPricesYesterday and returns
	 * the best profit I could have made from 1 purchase and 1 sale of 1 Apple
	 * stock yesterday
	 * 
	 * source: https://www.interviewcake.com/question/java/stock-price
	 */

	public static int maxProfit(int[] prices) {

		// We can always just not buy/sell if there is no profit to be had -
		// gaining nothing is better than losing money
		int maxProfit = 0;

		//We can't make any profit if there aren't at least 2 prices for us to iterate through.
		if(prices.length <2){
			return maxProfit;
		}
		// Hold the index of the current best time to buy (aka the min price
		// we've seen so far)
		int currentPurchasePrice = prices[0];

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] - currentPurchasePrice > maxProfit) {
				maxProfit = prices[i] -currentPurchasePrice;
			} else if (prices[i] < currentPurchasePrice) {
				currentPurchasePrice = prices[i];
			}
		}

		return maxProfit;

	}
}