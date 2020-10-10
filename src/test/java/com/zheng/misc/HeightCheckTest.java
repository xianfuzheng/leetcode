package com.zheng.misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeightCheckTest {
    HeightCheck heightCheck = new HeightCheck();

    @Test
    public void test() {
        Assertions.assertEquals(0,heightCheck.heightChecker(new int[]{1,2,3,4,5}));
        Assertions.assertEquals(2,heightCheck.heightChecker(new int[]{4,1,5}));
        Assertions.assertEquals(5,heightCheck.heightChecker(new int[]{5,1,2,3,4}));
        Assertions.assertEquals(3,heightCheck.heightChecker(new int[]{1,1,4,2,1,3}));
    }
    @Test
    public void testWithSorting() {
        Assertions.assertEquals(0,heightCheck.heightCheckerWithoutSorting(new int[]{1,2,3,4,5}));
        Assertions.assertEquals(2,heightCheck.heightCheckerWithoutSorting(new int[]{4,1,5}));
        Assertions.assertEquals(5,heightCheck.heightCheckerWithoutSorting(new int[]{5,1,2,3,4}));
        Assertions.assertEquals(3,heightCheck.heightCheckerWithoutSorting(new int[]{1,1,4,2,1,3}));
    }
}