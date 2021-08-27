package com.zheng.misc;

import java.util.*;

public class MinStickers {

    public int minStickers(String[] stickers, String target) {

        Map<Character, HashSet<String>> map = new HashMap<>();
        for (int i = 0; i < stickers.length; i++) {
            for (int j = 0; j < stickers[i].length(); j++) {
                HashSet<String> set = map.getOrDefault(stickers[i].charAt(j), new HashSet<>());
                set.add(stickers[i]);
                map.put(stickers[i].charAt(j), set);
            }
        }

        Queue<String> queue = new ArrayDeque<>();
        queue.add(target);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while(size >0) {
                String curstr = queue.poll();
                if (!map.containsKey(curstr.charAt(0)))
                    return -1;

                HashSet<String> neighbors = map.get(curstr.charAt(0));
                for (String nei : neighbors) {
                    String newstr = getString(curstr, nei);
                    if (newstr.length() == 0)
                        return level + 1;
                    queue.add(newstr);
                }
                size --;
            }
            level ++;
        }
        return -1;
    }

    private String getString(String curstr, String sticker) {

        int[] count = new int[26];
        for (Character c : sticker.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder newstr = new StringBuilder();
        for (Character c : curstr.toCharArray()) {
            if (count[c - 'a'] > 0) {
                count[c - 'a']--;
            } else {
                newstr.append(c);
            }
        }
        return newstr.toString();
    }
}
