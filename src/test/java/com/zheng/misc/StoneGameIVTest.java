package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoneGameIVTest {
    StoneGameIV stoneGameIV = new StoneGameIV();

    @Test
    public void test() {
        assertTrue(stoneGameIV.winnerSquareGame(1));
        assertFalse(stoneGameIV.winnerSquareGame(2));
        assertTrue(stoneGameIV.winnerSquareGame(4));
        assertFalse(stoneGameIV.winnerSquareGame(7));
        assertFalse(stoneGameIV.winnerSquareGame(17));
    }
}