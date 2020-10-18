package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockIIITest {
    BestTimeToBuyAndSellStockIII bestTimeToBuyAndSellStockIII = new BestTimeToBuyAndSellStockIII();

    @Test
    public void test() {
        assertEquals(3, bestTimeToBuyAndSellStockIII.maxProfit(new int[]{1,2,3,0,2}));
    }
}