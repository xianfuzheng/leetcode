package com.zheng.misc;

import java.util.Arrays;

public class MinNumberToShootBalloon {
    public int findMinArrowShots(int[][] points) {

        if(points.length ==0 ) {
            return 0;
        }
        if(points.length ==1 ) {
            return 1;
        }

        Arrays.sort(points, (a, b)-> {
            int compare2 = Integer.compare(a[1], b[1]);
            return compare2;
        });

        int arrow = 1;
        int end = points[0][1];

        for(int i=1; i<points.length; i++) {
            int [] nums = points[i];
            int k = nums[0];

            if( k > end) {
                arrow ++;
                end = nums[1];
            } else {
                // keep end
            }
        }

        return arrow;

    }
}
