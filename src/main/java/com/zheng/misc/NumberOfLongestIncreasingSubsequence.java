package com.zheng.misc;

public class NumberOfLongestIncreasingSubsequence {

    public int findNumberOfLIS(int[] nums) {
        int len = nums.length;
        if(len == 0) {
            return 0;
        }

        int maxLength = 0;
        int [] arr = new int[len];
        int [] countArray = new int[len];

        for(int i = 0; i<len; i++) {
            arr[i] = 1;
            countArray[i] = 1;

            for(int pos = 0; pos< i; pos++) {
                if(nums[i] > nums[pos]) {

                    if (arr[i] < arr[pos] +1) {
                        countArray[i] = countArray[pos];
                    }

                    if (arr[i] == arr[pos] +1) {
                        countArray[i] += countArray[pos];
                    }

                    arr[i] = Math.max(arr[i], arr[pos] + 1);
                }
            }

            maxLength = Math.max(maxLength, arr[i]);
        }

        int count = 0;
        for(int i = 0; i < len; i++)
            if(arr[i] == maxLength)
                count += countArray[i];


        return count;
    }
}
