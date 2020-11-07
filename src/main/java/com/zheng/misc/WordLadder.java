package com.zheng.misc;

import java.util.*;

public class WordLadder {
    private int minSteps = Integer.MAX_VALUE;

    public int ladderLength2(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>();
        Set<String> seen = new HashSet<>();
        for(String i : wordList){
            set.add(i);
        }
        if(!set.contains(endWord)){
            return 0;
        }
        LinkedList<String> q = new LinkedList<>();
        q.add(beginWord);
        seen.add(beginWord);
        int level = 1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int k = 0; k<size; k++){
                String word = q.poll();
                char[] w=word.toCharArray();
                for(int i = 0; i<w.length; i++){
                    char c = w[i];
                    for(char replace = 'a'; replace<='z'; replace++){
                        if(replace==c)
                            continue;
                        w[i] = replace;
                        String newWord = String.valueOf(w);
                        if(newWord.equals(endWord)){
                            return level+1;
                        }
                        if(!seen.contains(newWord) && set.contains(newWord)){
                            q.add(newWord);
                        }
                        seen.add(newWord);
                    }
                    w[i] = c;
                }
            }
            level++;
        }
        return 0;
    }
    public int ladderLengthBFS(String beginWord, String endWord, List<String> wordList) {

        int level = 0;
        Set<String> dictSet = new HashSet<>();
        Set<String> visitedSet = new HashSet<>();

        for(String i : wordList){
            dictSet.add(i);
        }

        if( !dictSet.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        visitedSet.add(beginWord);


        while(!queue.isEmpty()) {
            int size = queue.size();

            level ++;

            while(size>0) {
                size --;
                String str = queue.remove();
                char [] chars = str.toCharArray();

                for(int i=0; i<chars.length; i++) {
                    char c = chars[i];
                    for(char k = 'a'; k<='z'; k++) {
                        chars[i] = k;
                        String tmp = new String(chars);

                        if(tmp.equals(endWord)) {
                            return level + 1;
                        }

                        if(dictSet.contains(tmp) && !visitedSet.contains(tmp)) {
                            System.out.println("level = " + level +" word = " + tmp);
                            queue.add(tmp);
                            visitedSet.add(tmp);
                        }
                    }
                    chars[i] = c;
                }

            }
        }

        return 0;

    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Map<String, Integer> map = new HashMap<>();
        for(String str: wordList) {
            map.put(str, 0);
        }

        List<String> path = new ArrayList<>();
        path.add(beginWord);
        map.put(beginWord,1);
        solve(beginWord.toCharArray(), endWord, map, path);

        return minSteps == Integer.MAX_VALUE? 0 : minSteps;
    }

    private void solve(char [] chars, String end, Map<String, Integer> map, List<String> path) {

        if(path.size() > minSteps) {
            return;
        }
        if(new String(chars).equals(end)) {
            minSteps = Math.min(minSteps, path.size());
            return;
        }

        for(int i=0; i<chars.length; i++) {
            char k = chars[i];

            for(char c = 'a'; c<='z'; c++) {
                if(c == k) {
                    continue;
                }
                chars[i] = c;
                String newString = new String(chars);

                if(map.containsKey(newString)) {
                    if(map.get(newString) == 1) {
                        continue;
                    }
                    map.put(newString,1);
                    path.add(newString);
                    solve(chars, end, map, path);
                    path.remove(path.size() -1);
                    map.put(newString,0);
                }
            }

            chars[i] = k;
        }

    }
}
