package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductSubarrayTest {

    MaximumProductSubarray instance = new MaximumProductSubarray();

    @Test
    public void test() {
        assertEquals(6, instance.maxProduct(new int[]{2,3,-2,4}));
        assertEquals(0, instance.maxProduct(new int[]{-2,0,-1}));
        assertEquals(-2, instance.maxProduct(new int[]{-2}));
    }

}