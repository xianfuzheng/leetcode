package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumHeightTreesTest {
    MinimumHeightTrees minimumHeightTrees = new MinimumHeightTrees();

    @Test
    public void test() {
        assertArrayEquals(new Integer[]{3,4}, minimumHeightTrees.findMinHeightTrees(6, new int[][]{
                {3,0}, {3,1}, {3,2}, {3,4}, {5,4}
        }).toArray(new Integer[0]));

        assertArrayEquals(new Integer[]{1}, minimumHeightTrees.findMinHeightTrees(4, new int[][]{
                {1,0}, {1,2}, {1,3}
        }).toArray(new Integer[0]));

        assertArrayEquals(new Integer[]{0}, minimumHeightTrees.findMinHeightTrees(3, new int[][]{
                {1,0}, {0,2}
        }).toArray(new Integer[0]));

    }
}