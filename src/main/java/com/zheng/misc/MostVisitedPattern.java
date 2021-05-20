package com.zheng.misc;

import java.util.*;

public class MostVisitedPattern {

    public List<String> mostVisitedPattern(String[] usernames, int[] timestamps, String[] websites) {

        Map<String, List<String>> userMap = new HashMap<>();

        for (int i = 0; i<usernames.length; i++) {
            String userName = usernames[i];
            int time = timestamps[i];
            String website = websites[i];

            List<String> list = userMap.getOrDefault(userName, new ArrayList<String>());
            list.add(website);
            userMap.put(userName, list);
        }

        int maxVisit = 0;

        Map<String, Integer> all3Sequence = new HashMap<>();
        for (String userName : userMap.keySet()) {
            List<String> websiteList = userMap.get(userName);
            Set<String> result = new HashSet<>();
            getAll3Sequence(websiteList, new ArrayList<String>(), 0, result);

            for (String seq: result) {
                int count = all3Sequence.getOrDefault(seq, 0 ) + 1;
                all3Sequence.put(seq, count);
                maxVisit = Math.max(count, maxVisit);
            }
        }

        PriorityQueue<String> heap = new PriorityQueue<>((l1, l2) -> {
            return l1.compareTo(l2);

        });

        for (String seq : all3Sequence.keySet()) {
            if (all3Sequence.get(seq) == maxVisit) heap.add(seq);
        }

        return Arrays.asList(heap.peek().split(","));

    }

    public void getAll3Sequence(List<String> list, List<String> seq, int start, Set<String> result) {

        if(seq.size() == 3) {
            result.add(seq.get(0) +"," + seq.get(1) + "," + seq.get(2));
            return;
        }

        for (int i=start; i<list.size(); i++) {
            seq.add(list.get(i));
            getAll3Sequence(list, seq, i+1, result);
            seq.remove(seq.size()-1);
        }
    }
}
