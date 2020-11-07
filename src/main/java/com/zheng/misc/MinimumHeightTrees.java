package com.zheng.misc;

import java.util.*;

public class MinimumHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {

        if(n==1) return Arrays.asList(0);

        ArrayList<Integer>[] list = new ArrayList[n];
        for(int i=0; i<n; i++) {
            list[i] = new ArrayList<>();
        }

        int [] arr = new int[n];
        for(int i=0; i<edges.length; i++) {
            int start = edges[i][0];
            int end = edges[i][1];
            arr[start] ++;
            arr[end] ++;

            list[start].add(end);
            list[end].add(start);
        }


        int count = n;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<n; i++) {
            if(arr[i] == 1) {
                queue.add(i);
                count --;
            }
        }

        while(!queue.isEmpty()) {

            int size = queue.size();
            if(count == 0) {
                if(size ==1) {
                    return Arrays.asList(queue.remove());
                }

                if(size ==2) {
                    return Arrays.asList(queue.remove(), queue.remove());
                }
            }


            for(int i=0;i<size;i++) {

                int node = queue.remove();

                for(int k : list[node] ) {

                   // list[node].remove(Integer.valueOf(k));
                   // list[k].remove(Integer.valueOf(node));

                    arr[k] --;
                    arr[node] --;

                    if(arr[k] == 1) {
                        queue.add(k);
                        count --;
                    }
                    if(arr[node] == 1) {
                        queue.add(node);
                        count --;
                    }
                }
            }
        }

        return null;
    }
}
