package com.zheng.combinatorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PermutationTest {

    private PermutationSWAP permutation = new PermutationSWAP();
    private PermutationPick permutationPick = new PermutationPick();

    @Test
    public void testSwap() {
        int [] arr = new int[]{1,2,3};
        List<String> stringList = permutation.solve(arr);
        for (String str : stringList) {
            System.out.println(str);
        }
        Assertions.assertEquals(6, stringList.size());
        Assertions.assertEquals("213", stringList.get(2));
    }

    @Test
    public void testPick() {
        int [] arr = new int[]{1,2,3};
        List<String> stringList = permutationPick.solve(arr);
        for (String str : stringList) {
            System.out.println(str);
        }
        Assertions.assertEquals(6, stringList.size());
        Assertions.assertEquals("213", stringList.get(2));
    }

}