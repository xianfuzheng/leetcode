package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobber2Test {
    HouseRobber2 houseRobber2 = new HouseRobber2();

    @Test
    public void test() {
        assertEquals(0, houseRobber2.rob(new int[]{}));
        assertEquals(5, houseRobber2.rob(new int[]{5}));
        assertEquals(5, houseRobber2.rob(new int[]{5,3}));
        assertEquals(3, houseRobber2.rob(new int[]{2,3,2}));
        assertEquals(4, houseRobber2.rob(new int[]{1,2,3,1}));
    }

    @Test
    public void testGreedy() {
        assertEquals(0, houseRobber2.robGreedy(new int[]{}));
        assertEquals(5, houseRobber2.robGreedy(new int[]{5}));
        assertEquals(5, houseRobber2.robGreedy(new int[]{5,3}));
        assertEquals(3, houseRobber2.robGreedy(new int[]{2,3,2}));
        assertEquals(4, houseRobber2.robGreedy(new int[]{1,2,3,1}));
    }
}