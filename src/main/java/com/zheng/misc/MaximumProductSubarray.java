package com.zheng.misc;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {

        int curMax = nums[0];
        int curMin = nums[0];

        int max = nums[0];

        for(int i=1; i<nums.length; i++) {
            int num = nums[i];

            int t1 = curMax;
            int t2 = curMin;

            curMax = Math.max(t1 * num, t2 * num);
            curMax = Math.max(curMax, num);

            curMin = Math.min(t1*num, t2*num);
            curMin = Math.min(curMin, num);

            System.out.println(num+ " " + curMax+"  " + curMin);

            max = Math.max(curMax, max);
        }

        return max;
    }
}
