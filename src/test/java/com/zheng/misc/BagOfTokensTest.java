package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagOfTokensTest {

    BagOfTokens bagOfTokens = new BagOfTokens();

    @Test
    public void test() {
        assertEquals(0, bagOfTokens.bagOfTokensScore(new int[]{200}, 50));
        assertEquals(1, bagOfTokens.bagOfTokensScore(new int[]{100,200}, 150));
        assertEquals(2, bagOfTokens.bagOfTokensScore(new int[]{100, 200, 300, 400}, 200));
        assertEquals(1, bagOfTokens.bagOfTokensScore(new int[]{81,91,31}, 73));

    }

}