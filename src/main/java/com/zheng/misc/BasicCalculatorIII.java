package com.zheng.misc;

import java.util.Stack;

public class BasicCalculatorIII {

    int pos = 0;
    char [] chars = null;
    public int calculate(String s) {
        pos = 0;
        chars = s.toCharArray();
        return solve();
    }

    public int solve() {
        Stack<Integer> stack = new Stack<>();

        char prevSign = '+';
        int n = 0;

        while(pos <= chars.length) {
            char c = (pos == chars.length) ? '#': chars[pos];
            if(c == '(') {
                pos ++;
                n = solve();
            } else if(c == ')') {
                updateStack(stack, prevSign, n);
                return getResult(stack);
            } else {
                if(c>='0' && c<='9') {
                    n = n* 10 + (c - '0');
                } else {
                    updateStack(stack, prevSign, n);
                    prevSign =c;
                    n = 0;
                }
            }
            pos ++;
        }

       return getResult(stack);
    }


    private void updateStack(Stack<Integer> stack, char sign , int n) {

        if(sign == '+'){
            stack.push(n);
        } else if(sign == '-'){
            stack.push(n * -1);
        } else if(sign =='*'){
            int top = stack.pop();
            stack.push(top * n);
        } else if(sign =='/'){
            int top = stack.pop();
            stack.push(top / n);
        }
    }
    private int getResult(Stack<Integer> stack) {

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
