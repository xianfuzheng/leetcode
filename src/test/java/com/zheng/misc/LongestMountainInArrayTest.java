package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestMountainInArrayTest {

    LongestMountainInArray longestMountainInArray = new LongestMountainInArray();

    @Test
    public void test() {
        assertEquals(4, longestMountainInArray.longestMountain(new int[]{40,51,29,19,50,25}));
        assertEquals(0, longestMountainInArray.longestMountain(new int[]{3,2}));
        assertEquals(5, longestMountainInArray.longestMountain(new int[]{2,1,4,7,3,2,5}));
        assertEquals(0, longestMountainInArray.longestMountain(new int[]{2,2,2}));
    }
}