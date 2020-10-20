package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumInsertionPalindromeTest {

    MinimumInsertionPalindrome minimumInsertionPalindrome = new MinimumInsertionPalindrome();

    @Test
    public void test() {
        assertEquals(0, minimumInsertionPalindrome.minInsertions(""));
        assertEquals(0, minimumInsertionPalindrome.minInsertions("zzazz"));
        assertEquals(2, minimumInsertionPalindrome.minInsertions("mbadm"));
        assertEquals(5, minimumInsertionPalindrome.minInsertions("leetcode"));
        assertEquals(25, minimumInsertionPalindrome.minInsertions("tldjbqjdogipebqsohdypcxjqkrqltpgviqtqz"));
    }
}