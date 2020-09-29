package com.zheng.misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedSubstringPatternTest {

    private RepeatedSubstringPattern repeatedSubstringPattern = new RepeatedSubstringPattern();

    @Test
    public void test() {
        Assertions.assertTrue(repeatedSubstringPattern.repeatedSubstringPattern("ababab"));
    }

}