package com.zheng.misc;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabel {

    public List<Integer> partitionLabels(String s) {
        int [] arr = new int[26];
        char [] chars = s.toCharArray();
        for (int i=0; i<chars.length; i++) {
            arr[chars[i] - 'a'] = i;
        }

        int pos = 0;

        List<Integer> list =  new ArrayList<>();
        int prevLastPos = 0;
        while(pos< chars.length) {
            int lastPos = findMaxLastPos(pos, chars, arr);
            list.add(lastPos - prevLastPos +1);
            prevLastPos = lastPos +1;
            pos = lastPos + 1;
        }
        return list;
    }

    private int findMaxLastPos(int pos, char[] chars, int [] arr) {

        int lastPos = -1;
        int maxLast = -1;

        while (true) {
            char c = chars[pos];
            lastPos = arr[c - 'a'];

            for(int i = pos; i<= lastPos; i++) {
                c = chars[i];
                if (arr[ c - 'a'] > maxLast) {
                    maxLast = arr[ c - 'a'];
                }
            }

            if(maxLast == lastPos) {
                break;
            } else {
                pos = lastPos + 1;
            }
        }

        return lastPos;
    }
}
