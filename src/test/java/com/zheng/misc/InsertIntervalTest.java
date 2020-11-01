package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalTest {

    InsertInterval insertInterval = new InsertInterval();

    @Test
    public void test() {
        int[][] result = insertInterval.insert(
                new int[][]{new int[]{1, 3}, new int[]{6, 9}},
                new int[]{2, 5});
        assertArrayEquals(new int[]{1,5},result[0]);
        assertArrayEquals(new int[]{6,9},result[1]);

        result = insertInterval.insert(
                new int[][]{new int[]{1, 2}, new int[]{3, 5}, new int[]{6, 7}, new int[]{8, 10}, new int[]{12, 16}},
                new int[]{4,8});
        assertArrayEquals(new int[]{1,2},result[0]);
        assertArrayEquals(new int[]{3,10},result[1]);
        assertArrayEquals(new int[]{12,16},result[2]);
    }
}