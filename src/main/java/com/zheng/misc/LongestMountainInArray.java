package com.zheng.misc;

public class LongestMountainInArray {

    public int longestMountain(int[] A) {
        int len = A.length;
        if(len == 0) {
            return 0;
        }

        int cur = A[0];
        int n1 = 0;
        int n2 = 0;
        int max = 0;
        for(int i=1; i<len; i++) {
            int value = A[i];

            if(value == cur) {
                n1 = 0;
                n2 = 0;
                continue;
            }

            if(value>cur) {
                if(n2==0){
                    n1 ++;
                } else {
                    n1 = 1;
                    n2 = 0;
                }
            } else {
                if(n1>0){
                    n2 ++;
                    max = Math.max(n1+n2+1, max);
                }
            }
            cur = value;
        }

        return max;
    }
}
