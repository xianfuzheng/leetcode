package com.zheng.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> result = new ArrayList<>();

        int start = newInterval[0];
        int end = newInterval[1];

        for(int [] arr : intervals) {
            int max = Math.max(start, arr[0]);
            int min = Math.min(end, arr[1]);

            if(max<= min) {
                start = Math.min(start, arr[0]);
                end = Math.max(end, arr[1]);
            } else {
                result.add(new int[]{ Math.min(start, arr[0]), Math.min(end, arr[1])});
                start = Math.max(start, arr[0]);
                end = Math.max(end, arr[1]);
            }
        }
        result.add(new int[]{start, end});
        return result.toArray(new int[result.size()][]);
    }
}
