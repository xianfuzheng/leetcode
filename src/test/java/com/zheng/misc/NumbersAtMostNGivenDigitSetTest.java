package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersAtMostNGivenDigitSetTest {

    NumbersAtMostNGivenDigitSet numbersAtMostNGivenDigitSet = new NumbersAtMostNGivenDigitSet();

    @Test
    public void test() {
        //assertEquals(20, numbersAtMostNGivenDigitSet.atMostNGivenDigitSet(new String[]{"1","3","5","7"}, 100));
        //assertEquals(29523, numbersAtMostNGivenDigitSet.atMostNGivenDigitSet(new String[]{"1","4","9"}, 1000000000));
        assertEquals(392738517, numbersAtMostNGivenDigitSet.atMostNGivenDigitSet(new String[]{"1","2","3","4","5","6","7","8","9"}, 899894860));
    }
}