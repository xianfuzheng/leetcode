package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfLongestIncreasingSubsequenceTest {
    NumberOfLongestIncreasingSubsequence numberOfLongestIncreasingSubsequence = new NumberOfLongestIncreasingSubsequence();

    @Test
    public void test() {
        assertEquals(0, numberOfLongestIncreasingSubsequence.findNumberOfLIS(new int[]{}));
        assertEquals(2, numberOfLongestIncreasingSubsequence.findNumberOfLIS(new int[]{1,3,5,4,7}));
        assertEquals(5, numberOfLongestIncreasingSubsequence.findNumberOfLIS(new int[]{2,2,2,2,2}));
    }

}