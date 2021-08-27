package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorIIITest {

    BasicCalculatorIII basicCalculatorIII = new BasicCalculatorIII();

    @Test
    public void test() {
        assertEquals(20, basicCalculatorIII.calculate("2*(5+5)"));
        assertEquals(2, basicCalculatorIII.calculate("(5+1)/3"));
        assertEquals(21, basicCalculatorIII.calculate("2*(5+5*2)/3+(6/2+8)"));
        assertEquals(-12, basicCalculatorIII.calculate("(2+6*3+5-(3*14/7+2)*5)+3"));
        assertEquals(0, basicCalculatorIII.calculate("0"));
    }
}