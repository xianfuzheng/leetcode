package com.zheng.misc;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        solve(n, k, 1, 0, list, result);

        return result;
    }

    private void solve(int max, int k, int start, int pos, List<Integer> list, List<List<Integer>> result) {

        System.out.println("start="+start + "  pos=" + pos);

        if(pos == k) {
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i= start ; i<=max; i++) {
            if(list.contains(i)) {
                continue;
            }

            list.add(i);
            solve(max, k, i + 1, pos+1, list, result);
            list.remove(list.size()-1);
        }
    }
}
