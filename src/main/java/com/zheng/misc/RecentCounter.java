package com.zheng.misc;

import java.util.LinkedList;

public class RecentCounter {

    LinkedList<Integer> linkedList = new LinkedList<>();
    public RecentCounter() {
    }

    public int ping(int t) {

        linkedList.addLast(t);
        int min = t - 3000;

        while(true) {
            Integer first = linkedList.peekFirst();
            if(first < min) {
                linkedList.pollFirst();
            } else {
                break;
            }
        }
        return linkedList.size();
    }
}
