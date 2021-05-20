package com.zheng.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeetingScheduler {
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {

        List<Integer> list = new ArrayList<>();
        Arrays.sort(slots1, (a, b) ->(a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]));
        Arrays.sort(slots2, (a, b) ->(a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]));
        int i = 0;
        int j = 0;
        while(i < slots1.length && j < slots2.length){
            int[] first = slots1[i];
            int[] second = slots2[j];
            if(second[0] >= first[1]){
                i++;
                continue;
            }else if(first[0] >= second[1]){
                j++;
                continue;
            }else{
                int start = Math.max(first[0], second[0]);
                int end = Math.min(first[1], second[1]);
                if(end - start >= duration){
                    list.add(start);
                    list.add(start + duration);
                    return list;
                }

                if(end == first[1]){
                    i++;
                }else if(end == second[1]){
                    j++;
                }
            }
        }

        return new ArrayList<>();
    }
}
