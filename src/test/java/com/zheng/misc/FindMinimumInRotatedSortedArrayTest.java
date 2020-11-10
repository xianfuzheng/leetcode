package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumInRotatedSortedArrayTest {

    FindMinimumInRotatedSortedArray instance = new FindMinimumInRotatedSortedArray();

    @Test
    public void test() {
        assertEquals(1, instance.findMin(new int[]{3,1,2}));
        assertEquals(1, instance.findMin(new int[]{3,4,5,1,2}));
        assertEquals(0, instance.findMin(new int[]{4,5,6,7,0,1,2}));
        assertEquals(1, instance.findMin(new int[]{1}));
        assertEquals(1, instance.findMin(new int[]{2,1}));
    }

}