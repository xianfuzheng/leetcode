package com.zheng.misc;

import java.util.Stack;

public class MinRemoveToMakeValid {

    public String minRemoveToMakeValid(String s) {

        int len = s.length();
        if(len == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<len; i++) {

            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            }
            if(c == ')') {
                if(!stack.empty()) {
                    if(s.charAt(stack.peek()) == '(') {
                        stack.pop();
                    } else{
                        stack.push(i);
                    }
                } else {
                    stack.push(i);
                }
            }
            sb.append(c);
        }

        while(!stack.empty()) {
            int pos = stack.pop();
            sb.deleteCharAt(pos);
        }

        return sb.toString();
    }
}
