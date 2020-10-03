package com.zheng.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, 0, 0, target, new LinkedList<>(), result);

        return result;
    }

    private void solve(int[] candidates, int pos, int currentSum, int target, LinkedList<Integer> list, List<List<Integer>> result) {
        if ( pos >=candidates.length) {
            return;
        }

        if(currentSum == target) {
            result.add(new ArrayList<>(list));
            return;
        }

        if(currentSum > target) {
            return;
        }

        for (int i=pos; i< candidates.length; i++) {
            list.add(candidates[i]);
            solve(candidates, i, currentSum + candidates[i], target, list, result);
            list.removeLast();
            if(currentSum + candidates[i]>target) {
                break;
            }
        }
    }
}
