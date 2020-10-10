package com.zheng.misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplementOfBase10IntegerTest {
    ComplementOfBase10Integer complementOfBase10Integer = new ComplementOfBase10Integer();

    @Test
    public void test() {
        //Assertions.assertEquals(2,complementOfBase10Integer.bitwiseComplement(5));

        //Assertions.assertEquals(0,complementOfBase10Integer.bitwiseComplement(7));
        Assertions.assertEquals(5,complementOfBase10Integer.bitwiseComplement(10));
        /*Assertions.assertEquals(Integer.MAX_VALUE,complementOfBase10Integer.bitwiseComplement(0));
         */
    }

}