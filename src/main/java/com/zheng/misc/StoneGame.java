package com.zheng.misc;

public class StoneGame {
    public boolean stoneGame(int[] piles) {
        int max = 0;
        int sum = 0;
        for(int num: piles) {
            sum += num;
        }

        int [][]dp = new int[piles.length][piles.length];

        max = solve(piles, 0, piles.length-1, dp);
        return max>sum-max;
    }

    private int solve(int[] piles, int start, int end, int[][]dp) {
        if(start>end) {
            return 0;
        }

        if(start == end) {
            return piles[start];
        }

        if(dp[start][end] >0) {
            return dp[start][end];
        }

        // option 1
        int max1 = piles[start] + Math.min(solve(piles, start+1, end-1, dp) , solve(piles, start+2, end, dp));
        int max2 = piles[end] + Math.min(solve(piles, start, end-2, dp) , solve(piles, start+1, end-1, dp));

        int max = Math.max(max1, max2);
        dp[start][end] = max;
        return max;
    }

    public boolean stoneGameDP(int [] piles) {

        int sum = 0;
        for(int num: piles) {
            sum += num;
        }

        int len = piles.length;

        int [][]dp = new int[len][len];

        for(int i=0;i<len;i++) {
            dp[i][i] = piles[i];
        }

        for(int i=0;i<len-1;i++) {
            dp[i][i+1] = Math.max(piles[i], piles[i+1]);
        }

        for(int k=2; k<len; k++) {
            for(int i=0; i< len-k; i++) {
                int start = i;
                int end = start + k;
                int max1 = piles[start] + Math.min(dp[start+2][end], dp[start+1][end-1]);
                int max2 = piles[end] + Math.min(dp[start+1][end-1], dp[start][end-2]);
                dp[start][end] = Math.max(max1, max2);
            }
        }

        int max = dp[0][len-1];
        return max>sum-max;
    }
}
