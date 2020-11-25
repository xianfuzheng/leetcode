package com.zheng.misc;

import java.util.Stack;

public class BasicCalculatorII {
    public int calculate(String s) {

        Stack<Integer> stack = new Stack<>();
        char [] chars = s.toCharArray();

        char prevSign = '+';
        int n = 0;
        for(int i=0; i<chars.length; i++) {
            char c = chars[i];

            if(c>='0' && c<='9') {
                n = n* 10 + (c - '0');
            }

            if(isOperator(c) || i == chars.length -1) {
                if(prevSign == '+'){
                    stack.push(n);
                } else if(prevSign == '-'){
                    stack.push(n * -1);
                } else if(prevSign =='*'){
                    int top = stack.pop();
                    stack.push(top * n);
                } else if(prevSign =='/'){
                    int top = stack.pop();
                    stack.push(top / n);
                }

                prevSign =c;
                n = 0;
            }

        }

        int result = 0;
        while(!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
    private boolean isOperator(char c){
        return c=='+' || c=='-'|| c=='/' || c=='*';
    }
}
