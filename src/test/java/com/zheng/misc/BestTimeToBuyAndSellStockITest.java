package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockITest {
    BestTimeToBuyAndSellStockI bestTimeToBuyAndSellStockI = new BestTimeToBuyAndSellStockI();

    @Test
    public void test() {
        assertEquals(5, bestTimeToBuyAndSellStockI.maxProfit(new int[]{7,1,5,3,6,4}));
        assertEquals(0, bestTimeToBuyAndSellStockI.maxProfit(new int[]{7,6,4,3,1}));
    }

}