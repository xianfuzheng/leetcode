package com.zheng.misc;

import java.util.*;

public class DAG {

    static int total = 0;

    public List<String> solve(List<String> packageList, List<String> dependencyList) throws Exception {
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
            System.out.println(p + " " + strs + " " + count);

            inDegreeMap.put(p, inDegreeMap.get(p) + count);
        }


        List<String> visitedNodeList = new LinkedList<>();

        for (String packageName : inDegreeMap.keySet()) {
            int count = inDegreeMap.get(packageName);
            if (count == 0) {
                visitedNodeList.add(packageName);
            }
        }

        List<String> result = new ArrayList<>();
        dfs(visitedNodeList, new HashSet<String>(), inDegreeMap, childMap, new ArrayList<String>(), result);

        return result;
    }

    public void dfs(List<String> nodeList, Set<String> visitedSet, Map<String, Integer> inDegreeMap, Map<String, List<String>> childMap, List<String> tmpNodeList, List<String> result) {

        total++;
        if (total > 20) {
            return;
        }

        if (tmpNodeList.size() == inDegreeMap.keySet().size()) {
            System.out.println(result);
            result.add(tmpNodeList.toString());
            return;
        }

        System.out.println("options:" + nodeList + "  visited:" + visitedSet);

        for (int i = 0; i < nodeList.size(); i++) {

            String node = nodeList.get(i);

            if (visitedSet.contains(node)) {
                continue;
            }

            tmpNodeList.add(node);
            visitedSet.add(node);

            List<String> children = childMap.get(node);

            for (String childPackage : children) {
                int count = inDegreeMap.get(childPackage);
                count--;
                if (count == 0) {
                    nodeList.add(childPackage);
                }
                inDegreeMap.put(childPackage, count);
            }

            dfs(nodeList, visitedSet, inDegreeMap, childMap, tmpNodeList, result);

            System.out.println("before" + tmpNodeList);
            tmpNodeList.remove(tmpNodeList.size() - 1);
            System.out.println("afte5r" + tmpNodeList);

            visitedSet.remove(node);


            for (String childPackage : children) {
                int count = inDegreeMap.get(childPackage);
                count++;
                inDegreeMap.put(childPackage, count);
            }
        }
    }

}