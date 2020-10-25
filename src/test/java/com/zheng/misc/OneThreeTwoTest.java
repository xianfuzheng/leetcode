package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneThreeTwoTest {
    OneThreeTwo oneThreeTwo = new OneThreeTwo();

    @Test
    public void test() {
        //assertFalse(oneThreeTwo.find132pattern(new int[]{1,2,3,4}));
        //assertTrue(oneThreeTwo.find132pattern(new int[]{3,1,4,2}));
        //assertTrue(oneThreeTwo.find132pattern(new int[]{-1,3,2,0}));
        //assertTrue(oneThreeTwo.find132pattern(new int[]{3,5,0,3,4}));
        assertTrue(oneThreeTwo.find132pattern(new int[]{3,6,18,19,20}));
    }
}