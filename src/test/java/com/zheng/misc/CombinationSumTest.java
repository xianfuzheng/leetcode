package com.zheng.misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {
    CombinationSum combinationSum = new CombinationSum();

    @Test
    public void test() {
        // [2,2,3], [7]
        List<List<Integer>> lists = combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7);
        Assertions.assertEquals(2, lists.size());
        Assertions.assertArrayEquals(new Integer[]{2,2,3}, lists.get(0).toArray(new Integer[]{}));

        // [2,2,2,2],[2,3,3],[3,5]
        lists = combinationSum.combinationSum(new int[]{2, 3, 5}, 8);
        Assertions.assertEquals(3, lists.size());
        Assertions.assertArrayEquals(new Integer[]{2,3,3}, lists.get(1).toArray(new Integer[]{}));


    }

}