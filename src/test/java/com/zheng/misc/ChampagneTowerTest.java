package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChampagneTowerTest {

    ChampagneTower champagneTower = new ChampagneTower();

    @Test
    public void test() {
        assertTrue(Math.abs(champagneTower.champagneTower(1000,9,6) - 1) < 1e-9);
        assertTrue(Math.abs(champagneTower.champagneTower(1,1,1) - 0) < 1e-9);
        assertTrue(Math.abs(champagneTower.champagneTower(2,1,1) - 0.5) < 1e-9);
        assertTrue(Math.abs(champagneTower.champagneTower(100000009,33,17) - 1) < 1e-9);
    }

}