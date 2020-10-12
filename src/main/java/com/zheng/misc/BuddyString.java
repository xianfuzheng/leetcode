package com.zheng.misc;

import java.util.HashSet;
import java.util.Set;

public class BuddyString {
    public boolean buddyStrings(String A, String B) {
        int len1 = A.length();
        int len2 = B.length();
        if(len1 != len2) {
            return false;
        }

        int index1 = -1;
        int index2 = -1;
        int [] arr = new int[26];
        boolean hasTwoIdenticalChars = false;
        for(int i=0; i< len1; i++) {
            char c = A.charAt(i);
            if(arr[c-'a'] == 1) {
                hasTwoIdenticalChars = true;
            }
            arr[c-'a'] = 1;
            if( A.charAt(i) != B.charAt(i)) {
                if(index1 == -1) {
                    index1 = i;
                } else {
                    if(index2 == -1) {
                        index2 = i;
                    } else {
                        return false;
                    }
                }
            }
        }

        if(index1 ==-1 && index2 ==-1) {
            // do we have two identical chars in the string
            return hasTwoIdenticalChars;
        }

        if(index1 != -1 && index2 != -1) {
            return A.charAt(index1) == B.charAt(index2) && A.charAt(index2)==B.charAt(index1);
        } else {
            return false;
        }
    }
}
