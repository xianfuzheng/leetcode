package com.zheng.misc;

import java.util.Arrays;
import java.util.Stack;

public class RemoveDuplicateLetters {

    public String removeDuplicateLetters(String s) {
        char [] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        boolean [] visited = new boolean[26];
        int [] arr = new int[26];

        for(char c: chars) {
            arr[c-'a'] ++;
        }

        for(char c: chars) {
            arr[c-'a'] --;
            if(visited[c-'a']) {
                continue;
            }

            if(stack.isEmpty()) {
                stack.push(c);
                visited[c-'a'] = true;
            } else {

                while( !stack.isEmpty() ) {
                    char peek = stack.peek();
                    if(arr[peek-'a'] == 0) {
                        break;
                    }
                    if( peek < c) {
                        break;
                    }
                    stack.pop();
                    visited[peek-'a'] = false;
                }
                stack.push(c);
                visited[c-'a'] = true;
            }
        }

        StringBuffer sb = new StringBuffer();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public String removeDuplicateLettersGreedy2(String s) {
        char [] chars = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        boolean[] visited = new boolean[26];
        for(int i=0; i<chars.length; i++) {
            char c = chars[i];
            if(visited[c-'a']) {
                continue;
            }

            int [] countArray = new int[26];
            for(int j = i; j<chars.length; j++) {
                countArray[ chars[j]-'a'] ++;
            }
            if(countArray[c-'a'] == 1) {
                stringBuffer.append(c);
                visited[c-'a'] = true;
            } else {
                int min = -1;
                for(int j = i+1; j<chars.length; j++) {
                    if(chars[j] > c && countArray[chars[j]-'a'] ==1) {
                        min = j;
                        break;
                    }
                }

                if( min>0) {
                    boolean isValid = true;
                    for(int j = i+1; j<min; j++) {
                        if(chars[j] < c ) {
                            isValid = false;
                        }
                    }

                    if(isValid) {
                        stringBuffer.append(c);
                        visited[c-'a'] = true;
                    }
                }
            }
        }

        return stringBuffer.toString();
    }

    public String removeDuplicateLettersGreedy(String s) {

        if( s.length()<2 )
            return s;

        char [] chars = s.toCharArray();
        int len = chars.length;

        int pos = 0;
        StringBuffer sb = new StringBuffer();
        boolean [] visited = new boolean[26];

        while( pos < len) {
            int [] arr = new int[26];

            for(int i=pos; i< len ; i++) {
                arr[chars[i] - 'a'] ++;
            }

            int min = pos;

            for(int i=pos; i< len ; i++) {
                if(visited[ chars[i] -'a']) {
                    continue;
                }

                if( chars[i] < chars[min]) {
                    min = i;
                }

                arr[chars[i] - 'a'] --;
                if(arr[chars[i] - 'a']  == 0 ) {
                    break;
                }
            }
            char c = chars[min];
            if(!visited[c-'a']) {
                sb.append(c);
            }
            visited[c-'a'] = true;
            pos = min +1;
        }

        return sb.toString();
    }

}
