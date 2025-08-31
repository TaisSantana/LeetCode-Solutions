package Easy.Arrays;

/*
Problem 122 - Best Time to Buy and Sell Stock II
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

Description:
You are given an array prices where prices[i] is the price of a given stock on day i.
You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times),
but you can only hold at most one share of the stock at any time. You can buy and sell on the same day.

 Solution:
- Iterate through the array and sum all positive differences between consecutive days.
- This ensures you "collect" all profitable increases.
- Time complexity: O(n)
- Space complexity: O(1)

Example:
Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 3.
Total profit = 7.
        */

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();
        int profit = solution.maxProfit(prices);
        System.out.println("Profit: " + profit); // Deve imprimir 7
    }

}
