package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumWidthRampTest {
    MaximumWidthRamp maximumWidthRamp = new MaximumWidthRamp();
    @Test
    public void test() {
        // assertEquals(4, maximumWidthRamp.maxWidthRamp(new int[]{6,0,8,2,1,5}));
        assertEquals(7, maximumWidthRamp.maxWidthRamp(new int[]{9,8,1,0,1,9,4,0,4,1}));

    }


}