package com.zheng.misc;

import java.util.PriorityQueue;

public class IsNStraightHand {

    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0)
            return false;
        PriorityQueue<Integer> res = new PriorityQueue<>();
        for(int n : hand){
            res.add(n);
        }
        while(!res.isEmpty()) {
            int i = res.peek();
            for(int j=i;j<i+groupSize;j++) {
                if(!res.remove(j))
                    return false;
            }
        }
        return true;
    }
}
