package com.zheng.combinatorial;

import java.util.ArrayList;
import java.util.List;

public class PermutationSWAP {

    public List<String> solve(int[] arr) {
        List<String> list = new ArrayList<String>();
        permute(arr, 0, arr.length -1, list);
        return list;
    }

    public void permute(int[] arr, int l, int r, List<String> list) {
        if (l == r) {
            // compare and reset
            String str = "";
            for (int num : arr) {
                str += num;
            }
            list.add(str);
        } else {
            for( int i =l; i<=r; i++) {
                swap(arr, l, i);
                permute(arr, l+1, r, list);
                swap(arr, l, i);
            }
        }
    }

    private void swap(int[] arr, int l, int i) {
        int k = arr[l];
        arr[l] = arr[i];
        arr[i] = k;
    }
}
