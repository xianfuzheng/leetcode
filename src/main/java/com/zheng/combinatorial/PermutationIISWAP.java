package com.zheng.combinatorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationIISWAP {

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        solve(nums, 0,result);

        return result;
    }

    private void solve( int[] nums, int start, List<List<Integer>>result) {

        if(start == nums.length -1) {
            List<Integer> list = new ArrayList<Integer>();
            for(int num: nums) {
                list.add(num);
            }
            result.add(list);
            return;
        }

        for(int i=start; i< nums.length; i++ ) {

            boolean found = false;
            for(int j = i-1; j>=start; j --) {
                if(nums[j] == nums[i]) {
                    found = true;
                }
            }

            if(found) {
                continue;
            }

            swap(i, start, nums);
            solve(nums, start +1, result);
            swap(start, i, nums);
        }
    }

    private void swap(int i, int j, int [] nums) {
        if(i==j) {
            return;
        }
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
