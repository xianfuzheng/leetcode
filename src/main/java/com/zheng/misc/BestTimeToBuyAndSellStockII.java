package com.zheng.misc;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int profit = 0;
        for(int i=1; i<prices.length; i++) {
            profit = prices[i]- prices[i-1];
            if(profit>0) {
                maxProfit += profit;
            }
        }
        return maxProfit;
    }
}
