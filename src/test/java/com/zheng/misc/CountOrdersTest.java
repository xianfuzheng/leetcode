package com.zheng.misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOrdersTest {
    CountOrders countOrders = new CountOrders();
    @Test
    public void test() {
        // Assertions.assertEquals(14159051, countOrders.countOrders(100));
        Assertions.assertEquals(4, countOrders.countOrders2(2));
    }

}