package com.zheng.misc;


import java.util.Arrays;

public class NumbersAtMostNGivenDigitSet {

    int result = 0;
    public int atMostNGivenDigitSet(String[] digits, int n) {
        result = 0;
        int [] nums = new int[digits.length];
        int i = 0;
        for(String str: digits) {
            nums[i++] = Integer.parseInt(str);
        }
        Arrays.sort(nums);
        solve(nums, n, 0);

        return result;
    }

    private void solve(int[] digits, int max, long curValue) {
        if(curValue > max) {
            return;
        }
        for(int i=0; i<digits.length; i++) {
            long p = curValue * 10 + digits[i];
            if( p > max) {
                break;
            }
            curValue = p;
            if(curValue <= max) {
                result ++;
                solve(digits,  max, curValue);
            }
            curValue = curValue/10;
        }
    }

}
