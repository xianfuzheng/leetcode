package com.zheng.misc;

import java.util.Arrays;

public class MinIncrementForUnique {

    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int result = 0;

        for(int i=1; i<A.length; i++) {
            if(A[i] <= A[i-1]) {
                result +=  A[i-1] - A[i] + 1;
                A[i] = A[i-1] + 1;
            }
        }

        return result;
    }
}
