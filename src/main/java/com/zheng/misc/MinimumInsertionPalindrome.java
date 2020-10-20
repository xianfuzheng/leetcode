package com.zheng.misc;

public class MinimumInsertionPalindrome {
    public int minInsertions(String s) {
        if(s.length()<2) {
            return 0;
        }

        char [] chars = s.toCharArray();
        int len = chars.length;
        int[][] dp = new int[len][len];

        for(int i=0 ;i<len; i++) {
            dp[i][i] = 0;
        }

        for(int k = 2; k<=len; k++) {
            for(int i=0; i<=len-k; i++) {
                int left = i;
                int right = left + k -1;
                if(chars[left] == chars[right]) {
                    if(k == 2) {
                        dp[left][right] = 0;
                    }else {
                        dp[left][right] = dp[left + 1][right - 1];
                    }
                } else {
                    dp[left][right] = Math.min(dp[left+1][right], dp[left][right-1]) +1;
                }
            }

            System.out.println("len = " + k);
            printArray(dp);

        }
        return dp[0][len-1];
    }
    private void printArray(int[][]dp) {

        for(int i=0;i<dp.length; i++) {
            for(int j=0;j<dp[i].length; j++) {
                System.out.print(dp[i][j]+"\t" );
            }
            System.out.println();

        }

    }
    public int minInsertionsRecursion(String s) {
        if(s.length()<2) {
            return 0;
        }

        char [] chars = s.toCharArray();
        return solve(chars,0, chars.length-1);
    }

    private int solve(char[] chars, int start, int end) {

        while( start<=end && chars[start] == chars[end]) {
            start ++;
            end --;
        }

        if(start >= end) {
            return 0;
        }

        int m1 = solve(chars, start, end -1) +1;
        int m2 = solve(chars, start +1, end) +1;

        return Math.min(m1, m2);
    }
}
