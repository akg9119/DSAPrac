package Array;

public class Buy_Sell_Stock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // Example stock prices
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit); // Output the maximum profit
    }
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0; // No prices means no profit

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Update the minimum price
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice); // Calculate profit
            }
        }

        return maxProfit; // Return the maximum profit found
    }
}
