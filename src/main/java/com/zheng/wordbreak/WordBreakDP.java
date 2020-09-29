package com.zheng.wordbreak;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreakDP {
    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> set = new HashSet<String>();
        for(String str : wordDict){
            set.add(str);
        }

        int size = s.length() ;
        // arr[i] = true -> up to i ,it can be broken into small words
        // arr[size] -> result for the whole string
        int [] arr = new int[size + 1];
        for(int i=0; i<=size; i++) {
            arr[i] = -1;
        }
        arr[0] = 0;

        for(int n = 1; n<=size; n++) {
            for(int i=0; i<n; i++) {
                if(arr[i] >= 0) {
                    String subString = s.substring(i, n);
                    if(set.contains(subString)) {
                        arr[n] = i;
                        break;
                    }
                }
            }
        }

        for(int i= size; i>0; ) {
            int k = arr[i];
            if(k>=0) {
                System.out.println(s.substring(k, i));
            }
            i = k;
        }

        return arr[size]>=0;
    }
}
