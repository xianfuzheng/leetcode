package com.zheng.misc;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class DAGTest {

    DAG dag = new DAG();

    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        List<String> dependencyList = new ArrayList<>();
        dependencyList.add("A->B,C");
        dependencyList.add("B->C,D");
        dependencyList.add("E->D");

        Set<String> str = dag.solve(list, dependencyList);
        System.out.println(str);
    }
}