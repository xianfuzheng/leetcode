package com.zheng.misc;

import java.util.Arrays;
import java.util.Stack;

public class RemoveDuplicateLetters {

    public String removeDuplicateLetters(String s) {
        int [] arr = new int[26];
        char [] chars = s.toCharArray();
        for(char c: chars) {
            arr[c - 'a'] ++;
        }

        Stack<Character> stack = new Stack<>();
        boolean [] visited = new boolean[26];

        for(char c: chars) {
            arr[c-'a'] --;
            if( visited[c-'a']) {
                continue;
            }
            while(!stack.isEmpty()) {
                Character top = stack.peek();
                if( c > top ) {
                    break;
                } else {
                    if(arr[top - 'a']>0) {
                        stack.pop();
                        visited[top-'a'] = false;
                    } else {
                        break;
                    }
                }
            }

            stack.push(c);
            visited[c-'a'] = true;
        }

        StringBuffer stringBuffer = new StringBuffer();
        while (!stack.isEmpty()) {
            stringBuffer.append(stack.pop());
        }
        return stringBuffer.reverse().toString();
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
        int[] count = new int[26];
        StringBuilder result = new StringBuilder();

        while( s.length()>0 ){
            for( int i=0; i<s.length(); i++ )
                count[ s.charAt(i)-'a' ]++;

            int pos=0;
            for( int i=0; i<s.length(); i++ ){
                if( s.charAt(i) < s.charAt(pos) )  //always choose the left lexically smallest char
                    pos = i;

                //if a char will not appear in the following sequence, stop here, otherwise the chars of the result may not be in correct order,
                //e.g. "eeffga", 'a' will be selected first;  we must maintain the relative order of chars in the result according to the input
                if( --count[s.charAt(i)-'a'] == 0 )
                    break;
            }

            result.append( s.charAt(pos) );
            s = s.substring(pos + 1);
            Arrays.fill(count, 0);
        }

        return result.toString();
    }


}
