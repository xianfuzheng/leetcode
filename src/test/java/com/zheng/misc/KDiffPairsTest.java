package com.zheng.misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KDiffPairsTest {
    KDiffPairs kDiffPairs = new KDiffPairs();

    @Test
    public void test() {
        Assertions.assertEquals(4, kDiffPairs.findPairs(new int[]{1,2,3,4,3,5}, 1));
        Assertions.assertEquals(2, kDiffPairs.findPairs(new int[]{1,2,4,4,3,3,0,9,2,3}, 3));
        Assertions.assertEquals(2, kDiffPairs.findPairs(new int[]{-1,-2,-3}, 1));
        Assertions.assertEquals(1, kDiffPairs.findPairs(new int[]{1,3,1,5,4}, 0));


    }

}