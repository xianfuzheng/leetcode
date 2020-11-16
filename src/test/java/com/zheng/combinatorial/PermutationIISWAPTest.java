package com.zheng.combinatorial;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermutationIISWAPTest {
    PermutationIISWAP instance = new PermutationIISWAP();

    @Test
    public void test() {
        List<List<Integer>> lists = instance.permuteUnique(new int[]{2, 2, 1, 1});
        assertEquals(6, lists.size());
        lists = instance.permuteUnique(new int[]{1, 0,0 , 9,0});
        assertEquals(20, lists.size());
    }

}