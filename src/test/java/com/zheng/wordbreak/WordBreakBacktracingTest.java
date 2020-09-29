package com.zheng.wordbreak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class WordBreakBacktracingTest {

    WordBreakBacktracing instance = new WordBreakBacktracing();
    
    @Test
    void test() {
        Assertions.assertTrue(instance.wordBreak( "leetcode", Arrays.asList("leet", "code")));
        Assertions.assertFalse(instance.wordBreak( "catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));


    }
}