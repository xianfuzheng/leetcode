package com.zheng.misc;

import java.util.HashMap;
import java.util.Map;

public class KDiffPairs {

    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map  = new HashMap<>();
        for( int num: nums) {
            Integer current = map.get(num);
            if(current == null) {
                map.put(num, 1);
            } else {
                map.put(num, current +1);
            }
        }

        int count = 0;
        for (Integer integer : map.keySet()) {
            if( k==0) {
                if(map.get(integer) >1) {
                    System.out.println(integer+" - " + integer);
                    count ++;
                }
            } else {
                if(map.get(integer + k) != null) {
                    System.out.println(integer+" - " + (integer + k));
                    count ++;
                }
            }
        }
        return count;
    }
}
