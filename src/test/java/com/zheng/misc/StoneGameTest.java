package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoneGameTest {

    StoneGame stoneGame = new StoneGame();

    @Test
    public void test() {
        assertTrue(stoneGame.stoneGame(new int[]{5,3,4,5}));
    }

    @Test
    public void testDP() {
        assertTrue(stoneGame.stoneGameDP(new int[]{5,3,4,5}));
    }
}