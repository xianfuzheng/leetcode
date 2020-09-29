package com.zheng.wordbreak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WordBreakDPTest {

    WordBreakDP instance = new WordBreakDP();

    @Test
    public void test() {
        Assertions.assertTrue(instance.wordBreak( "leetcode", Arrays.asList("leet", "code")));
        Assertions.assertFalse(instance.wordBreak( "catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));

        Assertions.assertTrue(instance.wordBreak(
                "abaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                Arrays.asList("ab","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa")));
    }

}