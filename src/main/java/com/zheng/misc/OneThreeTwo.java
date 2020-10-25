package com.zheng.misc;

import java.util.Stack;

public class OneThreeTwo {

    public boolean find132pattern(int[] nums) {
        int len = nums.length;
        if(len < 3) {
            return false;
        }

        Stack<Integer> stack = new Stack<>();

        int second = Integer.MIN_VALUE;
        for(int i=len-1; i>=0 ; i--) {
            int value = nums[i];
            if(value<second) {
                return true;
            }

            while (!stack.isEmpty() && value > stack.peek()) {
                second = stack.pop();
            }
            stack.push(value);
        }
        return false;
    }
}
