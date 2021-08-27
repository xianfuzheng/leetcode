package com.zheng.misc;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        if(nums.length ==0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();

        for (int num: nums) {
            set.add(num);
        }

        int max = 1;
        for (int num: nums) {
            int left = 0;
            int right = 0;

            int temp = num-1;
            while(set.contains(temp)) {
                left ++;
                temp --;
            }

            temp = num+1;
            while(set.contains(temp)) {
                right ++;
                temp ++;
            }

            max = Math.max(max, left+ right +1);
        }

        return max;
    }
}
