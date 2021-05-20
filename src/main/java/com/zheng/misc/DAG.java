package com.zheng.misc;

import java.util.*;

public class DAG {

    static int total = 0;

    public Set<String> solve(List<String> packageList, List<String> dependencyList){
        Map<String, Integer> inDegreeMap = new HashMap<>();
        Map<String, List<String>> childMap = new HashMap<>();

        for (String packageName : packageList) {
            inDegreeMap.put(packageName, 0);
            childMap.put(packageName, new ArrayList<>());
        }
        for (String dependency : dependencyList) {
            String[] tmps = dependency.split("->");
            String p = tmps[0];

            String strs = tmps[1];
            int count = 0;
            for (String str : strs.split(",")) {
                count++;
                List<String> l = childMap.get(str);
                l.add(p);
                childMap.put(str, l);
            }
            inDegreeMap.put(p, inDegreeMap.get(p) + count);
        }


        Set<String> visitedNodeList = new HashSet<>();

        for (String packageName : inDegreeMap.keySet()) {
            int count = inDegreeMap.get(packageName);
            if (count == 0) {
                visitedNodeList.add(packageName);
            }
        }

        Set<String> result = new HashSet<>();
        dfs(visitedNodeList, new HashSet<String>(), inDegreeMap, childMap, "", result);

        return result;
    }

    public void dfs(Set<String> nodeSet, Set<String> visitedSet, Map<String, Integer> inDegreeMap, Map<String, List<String>> childMap, String path, Set<String> result) {

        int keyCount = inDegreeMap.keySet().size();
        if (path.length() > keyCount) {
            return;
        }

        if (path.length() == keyCount) {
            result.add(path);
            return;
        }

        System.out.println("options:" + nodeSet + "  visited:" + visitedSet);

        for( String node : nodeSet) {
            if (visitedSet.contains(node) ) {
                continue;
            }

            visitedSet.add(node);
            Set<String> set = new HashSet<>(nodeSet);
            set.remove(node);
            List<String> children = childMap.get(node);

            for (String childPackage : children) {
                int count = inDegreeMap.get(childPackage);
                count--;
                if (count == 0) {
                    set.add(childPackage);
                }
                inDegreeMap.put(childPackage, count);
            }

            dfs(set, visitedSet, inDegreeMap, childMap, path + node, result);

            visitedSet.remove(node);
            nodeSet.add(node);
            for (String childPackage : children) {
                int count = inDegreeMap.get(childPackage);
                count++;
                inDegreeMap.put(childPackage, count);
            }
        }
    }

}