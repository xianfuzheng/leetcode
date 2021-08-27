package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubArrayLenTest {

    MaxSubArrayLen maxSubArrayLen  = new MaxSubArrayLen();
    @Test
    public void test() {
       assertEquals(2, maxSubArrayLen.maxSubArrayLen(new int[]{-2,-1,2,1}, 1));
        assertEquals(3, maxSubArrayLen.maxSubArrayLen(new int[]{1,2,3,4,5}, 9));
    }

}