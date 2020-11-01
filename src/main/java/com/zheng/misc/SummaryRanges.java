package com.zheng.misc;

import java.util.*;

public class SummaryRanges {

    Map<Integer, Integer> minMap = new HashMap<>();
    Map<Integer, Integer> maxMap = new HashMap<>();

    public SummaryRanges() {

    }

    public void addNum(int val) {
        int newMin = -1;
        int newMax = -1;

        int k = val -1;
        if(minMap.get(k) != null) {
            int min = minMap.get(k);
            minMap.remove(k);
            minMap.put(val, min);

            maxMap.remove(min);
            maxMap.put(min, val);

            newMax = val;
        } else {
            minMap.put(val, val);
            newMax = val;
        }

        int m = val + 1;
        if(minMap.get(m) != null) {
            int max = minMap.get(m);
            maxMap.remove(m);
            maxMap.put(val, max);

            minMap.remove(max);
            minMap.put(max, val);

            newMin = val;
        } else {
            maxMap.put(val, val);
            newMin = val;
        }

        if ( newMin == newMax) {
            int x = minMap.get(newMax);
            int y = maxMap.get(newMin);
            minMap.remove(newMax);
            minMap.remove(y);

            maxMap.remove(newMin);
            maxMap.remove(x);

            minMap.put(y, x);
            maxMap.put(x, y);
        }
    }


    public int[][] getIntervals() {
        List<Integer> integerList = new ArrayList<>(minMap.keySet());
        integerList.sort(Comparator.comparingInt(a -> a));

        int [][]result = new int[integerList.size()][2];
        int i = 0;
        for(int k : integerList) {
            result[i][0] = minMap.get(k);
            result[i][1] = k;
            i++;
        }
        return result;
    }
}
