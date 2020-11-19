package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertANumberToHexadecimalTest {
    ConvertANumberToHexadecimal convertANumberToHexadecimal = new ConvertANumberToHexadecimal();

    @Test
    public void test() {
        assertEquals("ffffffff",convertANumberToHexadecimal.toHex(-1));
        assertEquals("104",convertANumberToHexadecimal.toHex(260));
    }

}