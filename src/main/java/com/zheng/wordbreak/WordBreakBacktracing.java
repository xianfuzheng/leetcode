package com.zheng.wordbreak;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreakBacktracing {

    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> set = new HashSet<String>();
        for(String str : wordDict){
            set.add(str);
        }

        return search(s, 0, set);
    }

    private boolean search(String s, int pos, Set<String> wordDictSet) {
        System.out.println("pos="+pos);

        if(pos >= s.length()) {
            return true;
        }

        for(int i=pos+1; i<=s.length(); i++) {
            String subString = s.substring(pos, i);
            System.out.println("checking "+ subString);
            if(wordDictSet.contains(subString)) {
                if(search(s, i, wordDictSet)) {
                    return true;
                }
            }
        }

        return false;
    }
}
