package com.zheng.misc;

public class ConsecutiveCharacters {
    public int maxPower(String s) {
        char [] chars = s.toCharArray();

        if(chars.length == 0) {
            return 0;
        }
        int max = 1;
        int current = 1;
        char currentChar = chars[0];
        for(int i=1; i<chars.length; i++) {

            if(currentChar == chars[i]) {
                current ++;
                max = Math.max(current, max);
            } else {
                currentChar = chars[i];
                current = 1;
            }

        }

        return max;
    }
}
