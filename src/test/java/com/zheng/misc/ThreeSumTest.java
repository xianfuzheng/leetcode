package com.zheng.misc;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {
    ThreeSum threeSum = new ThreeSum();

    @Test
    public void test() {
        List<List<Integer>> lists = threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        assertEquals(2, lists.size());
        assertArrayEquals(new Integer[]{-1,-1,2}, lists.get(0).toArray(new Integer[0]));
    }
}