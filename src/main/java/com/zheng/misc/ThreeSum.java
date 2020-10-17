package com.zheng.misc;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length <3) {
            return new ArrayList<>();
        }
        Set<List<Integer>> result = new HashSet<>();

        Arrays.sort(nums);
        for(int i=0; i<nums.length && nums[i]<=0;i++) {
            search(nums, i, result);
        }

        return new ArrayList<>(result);
    }

    private void search(int [] nums, int pos, Set<List<Integer>> result) {
        int start = pos+1;
        int end = nums.length -1;
        int target = 0 - nums[pos];

        while(start<end) {
            int sum = nums[start] + nums[end];
            if(  sum == target) {
                List<Integer> list = new ArrayList<>();
                list.add(nums[pos]);
                list.add(nums[start]);
                list.add(nums[end]);
                result.add(list);
                start ++;
            } else if( sum < target){
                start ++;
            } else {
                end --;
            }
        }
    }
}
