package com.zheng.misc;

public class BestTimeToBuyAndSellStockIV {
    public int maxProfit(int k, int[] prices) {
        int len = prices.length;
        if( k +k >= len) {
            int maxProfit =0;
            for(int i=1; i<len; i++) {
                int profit = prices[i] - prices[i-1];
                if(profit >0) {
                    maxProfit += profit;
                }
            }
            return maxProfit;
        }

        int[][] transations = new int[k + 1][2];
        for (int i = 0; i < k + 1; i++) {
            transations[i][0] = Integer.MIN_VALUE;
        }
        printArray(transations);

        for (int i = 0; i < len; i++) {
            int price = prices[i];
            System.out.println(" price=" + price);
            for (int j = 1; j <= k; j++) {
                // buy: either skip and keep the old buy: transations[j][0]
                // or buy from previous sell transations[j - 1][1] - price
                transations[j][0] = Math.max(transations[j][0], transations[j - 1][1] - price);

                // sell: either skip and keep old sell transations[j][1]
                // or sell from previous buy transations[j][0] + price
                transations[j][1] = Math.max(transations[j][1], transations[j][0] + price);
            }
            printArray(transations);
        }

        return transations[k][1];
    }

    private void printArray(int[][]dp) {

        for(int i=0;i<dp.length; i++) {
            System.out.println(dp[i][0]+"\t" + dp[i][1]);
        }

    }
}
