package com.zheng.misc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumDominoRotationsForEqualRow {
    public int minDominoRotations(int[] A, int[] B) {
        if(A.length != B.length) {
            return -1;
        }
        if(A.length == 0) {
            return 0;
        }

        int [] countA = new int[6];
        int [] countB = new int[6];
        int [] countSame = new int[6];
        for(int i=0; i<A.length; i++) {
            countA[A[i]-1] ++;
            countB[B[i]-1] ++;
            if(A[i] == B[i]) {
                countSame[A[i]-1] ++;
            }
        }
        int minSwap = Integer.MAX_VALUE;
        boolean hasSolution = false;
        for(int i=0; i<6; i++) {
            int a = countA[i];
            int b = countB[i];
            int s = countSame[i];

            if ( a+b - s == A.length) {
                // possible
                int swap = A.length - Math.max(a, b);
                if (swap < minSwap) {
                    minSwap = swap;
                    hasSolution = true;
                }
            }
        }
        return hasSolution? minSwap: -1;
    }
    public int minDominoRotationsWithSwapInstruction(int[] A, int[] B) {
        if(A.length != B.length) {
            return -1;
        }
        if(A.length == 0) {
            return 0;
        }

        Map<Integer, Set<Integer>> countA = new HashMap<>();
        Map<Integer, Set<Integer>> countB = new HashMap<>();
        Map<Integer, Set<Integer>> countSame = new HashMap<>();

        for(int i=0; i<6; i++) {
            countA.put(i, new HashSet<>());
            countB.put(i, new HashSet<>());
            countSame.put(i, new HashSet<>());
        }

        for(int i=0; i<A.length; i++) {
            countA.get(A[i]-1).add(i);
            countB.get(B[i]-1).add(i);

            if(A[i] == B[i]) {
                countSame.get(A[i]-1).add(i);
            }
        }

        int minSwap = Integer.MAX_VALUE;
        boolean hasSolution = false;
        for(int i=0; i<6; i++) {
            int a = countA.get(i).size();
            int b = countB.get(i).size();
            int s = countSame.get(i).size();

            if ( a+b - s == A.length) {
                // possible
                int swap = A.length - Math.max(a, b);
                if (swap < minSwap) {
                    minSwap = swap;
                    hasSolution = true;
                }
                if( a>b ) {
                    countB.get(i).removeAll(countA.get(i));
                    for (Integer integer : countB.get(i)) {
                        A[integer] = B[integer];
                    }
                    for(int k=0; k<A.length; k++) {
                        System.out.print(A[k]+",");
                    }
                }
            }
        }
        return hasSolution? minSwap: -1;
    }
}
