package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {

    LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();

   @Test
   public void test() {
       assertEquals(4, lcs.longestConsecutive(new int[]{100,4,200,1,3,2}));
       assertEquals(0, lcs.longestConsecutive(new int[0]));
       assertEquals(9, lcs.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
   }

}