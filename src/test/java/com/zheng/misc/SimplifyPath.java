package com.zheng.misc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class SimplifyPath {

    public String simplifyPath(String path) {

        String[] strings = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String str: strings) {
            if(str.length() ==0) {
                continue;
            }

            if(str.equals(".")) {
                // do nothing
            } else if(str.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(str);
            }
        }

        StringBuffer stringBuffer = new StringBuffer();
        List<String> list = new LinkedList<>();
        while(!stack.isEmpty()) {
            String str = stack.pop();
            list.add(0, str);
        }

        if(list.size() == 0) {
            return "/";
        }

        for(String str: list) {
            stringBuffer.append("/").append(str);
        }

        return stringBuffer.toString();
    }
}
