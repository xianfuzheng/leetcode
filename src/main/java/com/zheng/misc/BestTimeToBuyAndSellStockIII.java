package com.zheng.misc;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * with cool down
 */
public class BestTimeToBuyAndSellStockIII {

    public int maxProfit(int[] prices) {
        int len = prices.length;
        if( len < 2) {
            return 0;
        }

        //0 for buy, 1 for sell
        int [][] arr = new int[len][2];
        arr[0][0] = - prices[0];
        arr[0][1] = 0;

        arr[1][0] = Math.max(arr[0][0], -prices[1]);
        arr[1][1] = Math.max(arr[1][1], arr[0][0] + prices[1]);
        for(int i=2; i<len; i++) {
            arr[i][0] = Math.max(arr[i-1][0], arr[i-2][1] - prices[i]);
            arr[i][1] = Math.max(arr[i-1][1], arr[i-1][0] + prices[i]);
        }
        printArray(arr);
        return Math.max(arr[len-1][0], arr[len-1][1]);
    }

    private void printArray(int[][]dp) {
        for(int i=0;i<dp.length; i++) {
            System.out.println(dp[i][0]+"\t" + dp[i][1]);
        }

    }
}
