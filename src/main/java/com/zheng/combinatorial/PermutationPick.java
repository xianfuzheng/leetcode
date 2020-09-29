package com.zheng.combinatorial;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PermutationPick {

    public List<String> solve(int[] arr) {
        List<String> list = new ArrayList<String>();
        permute(arr, new LinkedList<String>(), list);
        return list;
    }

    public void permute(int [] arr, LinkedList<String> currentList, List<String> resultList) {
        if(currentList.size() == arr.length) {
            resultList.add(String.join("", currentList));
            return;
        }

        for(int i=0; i<arr.length; i++) {
            String elem = ""+arr[i];
            if(currentList.contains(elem)) {
                continue;
            }
            currentList.add(elem);
            permute(arr,  currentList, resultList);
            currentList.removeLast();
        }
    }
}
