package com.zheng.misc;

import java.util.HashMap;
import java.util.Map;

public class MaxSubArrayLen {
    public int maxSubArrayLen(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);
        int sum = 0;
        int max = 0;
        for (int i=0; i<nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum -k)) {
                max = Math.max(max, i - map.get(sum-k));
            }

            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return max;
    }
}
