package com.zheng.misc;

public class LongestIncreasingPath {
    int[][] memo;
    public int longestIncreasingPath(int[][] matrix) {

        int m = matrix.length;
        if(m == 0) {
            return 0;
        }
        int n = matrix[0].length;

        memo = new int[m][n];

        int maxLength = 0;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                int len = solve(i,j, matrix);
                maxLength = Math.max(maxLength, len);
            }
        }
        return maxLength;

    }

    private int solve(int i, int j, int[][] matrix) {

        if(i<0 || j<0 || i>matrix.length || j> matrix[0].length) {
            return 0;
        }

        if(memo[i][j]!=0) {
            return memo[i][j];
        }

        int value = matrix[i][j];
        int len = 0;

        if (j>0 && matrix[i][j-1] > value) {
            len = Math.max(len, solve(i, j-1, matrix));
        }

        if (j < matrix[0].length-1 && matrix[i][j+1] > value) {
            len = Math.max(len, solve(i, j+1, matrix));
        }

        if (i>0 && matrix[i-1][j] > value) {
            len = Math.max(len, solve(i-1, j, matrix));
        }

        if (i < matrix.length-1 && matrix[i+1][j] > value) {
            len = Math.max(len, solve(i+1, j, matrix));
        }

        memo[i][j] = 1 + len;
        return 1+ len;
    }
}
