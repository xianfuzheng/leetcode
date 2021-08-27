package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinIncrementForUniqueTest {

    MinIncrementForUnique minIncrementForUnique = new MinIncrementForUnique();
    @Test
    public void test() {
        assertEquals(1, minIncrementForUnique.minIncrementForUnique(new int[]{1,2,2}));
        assertEquals(6, minIncrementForUnique.minIncrementForUnique(new int[]{3,2,1,2,1,7}));
    }
}