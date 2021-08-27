package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStickersTest {

    MinStickers minStickers = new MinStickers();

    @Test
    public void test() {
        assertEquals(3,minStickers.minStickers(new String[]{"with","example","science"}, "thehat"));
    }
}