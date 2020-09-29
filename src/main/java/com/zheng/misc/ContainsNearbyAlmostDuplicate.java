package com.zheng.misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ContainsNearbyAlmostDuplicate {

    public boolean solve(int[] nums, int k, int t) {
        boolean hasValid = false;
        List<Node> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            list.add(new Node(i, nums[i]));
        }
        list.sort(Comparator.comparingLong(o -> o.value));

        for(int i=0; i< list.size(); i++) {
            int idx = list.get(i).idx;
            long value = list.get(i).value;

            for(int j=i+1;j<list.size();j++) {
                long value2 = list.get(j).value;
                long diff = value2 - value;
                if(diff > t) {
                    break;
                }
                int idx2 = list.get(j).idx;
                if (Math.abs(idx - idx2) <= k) {
                    System.out.println((idx + " " + value ));
                    System.out.println((idx2+ " " + value2 ));
                    return true;
                }
            }
        }
        return hasValid;
    }
}

class Node {
    int idx;
    long value;
    public Node(int i, long j) {
        idx = i;
        value = j;
    }
}
