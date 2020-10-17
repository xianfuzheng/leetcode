package com.zheng.misc;

public class MaximumWidthRamp {

    public int maxWidthRamp(int[] A) {
        int max = -1;
        for(int num : A) {
            max = Math.max(num, max);
        }

        int [] arr = new int[max+1];
        for(int i=0; i<= max; i++) {
            arr[i] = -1;
        }
        for(int i=0; i< A.length; i++) {
            arr[A[i]] = i;
        }

        int maxRamp = 0;

        for(int i= max-1; i>=0; i--) {
            arr[i] = Math.max(arr[i], arr[i+1]);
        }

        for(int i=0; i<A.length; i++) {
            maxRamp = Math.max( arr[A[i]] - i, maxRamp);
        }

        return maxRamp;
    }

}
