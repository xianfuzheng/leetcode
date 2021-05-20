package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KClosestTest {
    KClosest kClosest = new KClosest();

    @Test
    public void test() {
        int[][] points = kClosest.kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2);
        assertArrayEquals(points[0], new int[]{3, 3});
        assertArrayEquals(points[1], new int[]{-2, 4});
    }

    @Test
    public void test2() {
        int[][] points = kClosest.kClosest2(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2);
        assertArrayEquals(points[0], new int[]{-2, 4});
        assertArrayEquals(points[1], new int[]{3, 3});
    }

}