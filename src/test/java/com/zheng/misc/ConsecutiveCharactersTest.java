package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutiveCharactersTest {
    ConsecutiveCharacters consecutiveCharacters = new ConsecutiveCharacters();

    @Test
    public void test() {
        assertEquals(1, consecutiveCharacters.maxPower("letcode"));
        assertEquals(11, consecutiveCharacters.maxPower("hooraaaaaaaaaaay"));
    }

}