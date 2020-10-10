package com.zheng.misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HeightCheck {
    public int heightChecker(int[] heights) {
       int move = 0;
       int [] arr = Arrays.copyOf(heights, heights.length);

       Arrays.sort(arr);
       for(int i=0; i<arr.length; i++) {
           if(arr[i]!=heights[i]) {
               move ++;
           }
       }
       return move;
    }

    public int heightCheckerWithoutSorting(int[] heights) {
        int [] arr = new int[101];

        for(int num: heights) {
            arr[num] ++;
        }

        int move = 0;
        int c = 0;
        for(int i=0; i< heights.length; i++) {
            while(arr[c] ==0) {
                c ++;
            }
            int v = heights[i];
            if( v != c) {
                move ++;
            }
            arr[c] --;
        }
        return move;
    }
}
