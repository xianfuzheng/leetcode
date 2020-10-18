package com.zheng.misc;

public class BestTimeToBuyAndSellStockI {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int profit = 0;

        for(int i=1; i<prices.length; i++) {
            int p = prices[i] - prices[i-1];
            profit += p;
            if(profit<0) {
                profit = 0;
            }
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
