package com.zheng.misc;

public class StoneGameIV {
    public boolean winnerSquareGame(int n) {

        boolean [] dp = new boolean[n+1];
        dp[0] = false;

        for(int k = 1; k<=n; k++) {
            for(int i=1; i*i <= k ; i++) {
                if(!dp[k - i*i]) {
                    dp[k] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}
