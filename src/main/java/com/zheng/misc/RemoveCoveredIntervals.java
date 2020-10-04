package com.zheng.misc;

import java.util.Arrays;
import java.util.Collections;

public class RemoveCoveredIntervals {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->{return a[0] - b[0];});

        int min = intervals[0][0];
        int max = intervals[0][1];

        int result = 1;
        for(int i=1; i<intervals.length; i++) {
            int [] item = intervals[i];

            if( item[0]> min && item[1] > max) {
                result ++;
                max = item[1];
            }
            max = Math.max(max, item[1]);
        }

        return result;
    }
}
