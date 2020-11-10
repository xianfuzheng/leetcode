package com.zheng.misc;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {

        int l = 0;
        int r = nums.length-1;

        while(l<=r) {

            int m = l + (r-l)/2;

            int v1 = nums[l];
            int v2 = nums[m];
            int v3 = nums[r];

            if(v1 <= v3) {
                return v1;
            } else {
                if(v2>=v1) {
                    l = m +1;
                } else {
                    r = m;
                }
            }
        }

        return -1;
    }
}
