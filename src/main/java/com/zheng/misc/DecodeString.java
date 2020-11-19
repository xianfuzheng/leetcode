package com.zheng.misc;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {

        Stack<String> stack = new Stack<>();

        for(int i=0;i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == ']') {
                StringBuffer sb = new StringBuffer();
                String t = stack.pop();
                while( !t.equals("[")) {
                    sb.append(t);
                    t = stack.pop();
                }
                String num = "";
                while( stack.size()>0) {
                    t = stack.peek();
                    if(t.charAt(0)>='0' && t.charAt(0)<='9') {
                        num = t + num;
                        stack.pop();
                    } else {
                        break;
                    }
                }

                String str = sb.reverse().toString();

                sb = new StringBuffer();
                for(int k = 0; k< Integer.parseInt(num); k++) {
                    sb.append(str);
                }
                stack.push(sb.reverse().toString());
            } else {
                stack.push(c+"");
            }
        }

        StringBuffer result = new StringBuffer();
        while( !stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}
