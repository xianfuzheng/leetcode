package com.zheng.misc;

public class MaximizeDistanceToClosestPerson {
    public int maxDistToClosest(int[] seats) {
        int left = 0;
        int max = 0;
        int len = seats.length;

        int i = 0;
        while(i<len && seats[i] == 0) {
            left ++;
            i ++;
        }

        max = Math.max(max, left);

        for( ; i<len ;i ++) {
            if(seats[i] == 1) {
                int current = (i - left )/2;
                max = Math.max(max, current);
                left = i;
            }
        }

        if(seats[len-1] == 0) {
            max = Math.max(max, len -1 - left);
        }
        return max;
    }
}
