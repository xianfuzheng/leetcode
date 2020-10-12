package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateLettersTest {

    RemoveDuplicateLetters removeDuplicateLetters = new RemoveDuplicateLetters();
    @Test
    public void test() {
        assertEquals("bac", removeDuplicateLetters.removeDuplicateLetters("bbcaac"));
        assertEquals("abc", removeDuplicateLetters.removeDuplicateLetters("bcabc"));
        assertEquals("acdb", removeDuplicateLetters.removeDuplicateLetters("cbacdcbc"));
        assertEquals("abdc", removeDuplicateLetters.removeDuplicateLetters("cbacbdcbc"));
        assertEquals("bca", removeDuplicateLetters.removeDuplicateLetters("bcab"));
    }

    @Test
    public void testGreedy() {
        //assertEquals("bac", removeDuplicateLetters.removeDuplicateLettersGreedy("bbcaac"));
        assertEquals("acdb", removeDuplicateLetters.removeDuplicateLettersGreedy("cbacdcbc"));
        assertEquals("abdc", removeDuplicateLetters.removeDuplicateLettersGreedy("cbacbdcbc"));
        assertEquals("bca", removeDuplicateLetters.removeDuplicateLettersGreedy("bcab"));
        assertEquals("eacb", removeDuplicateLetters.removeDuplicateLettersGreedy("ecbacba"));
        assertEquals("abc", removeDuplicateLetters.removeDuplicateLettersGreedy("abacb"));

        assertEquals("abc", removeDuplicateLetters.removeDuplicateLettersGreedy("cabac"));

    }

}