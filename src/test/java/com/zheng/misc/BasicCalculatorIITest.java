package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorIITest {
    BasicCalculatorII basicCalculatorII = new BasicCalculatorII();

    @Test
    public void test() {
        assertEquals(7,basicCalculatorII.calculate("3+2*2"));
        assertEquals(1,basicCalculatorII.calculate("3/2"));
        assertEquals(5,basicCalculatorII.calculate(" 3+5 / 2 "));
    }

}