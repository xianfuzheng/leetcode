package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockIITest {
    BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();

    @Test
    public void test() {
        assertEquals(7,bestTimeToBuyAndSellStockII.maxProfit(new int[]{7,1,5,3,6,4}));
        assertEquals(4,bestTimeToBuyAndSellStockII.maxProfit(new int[]{1,2,3,4,5}));
        assertEquals(0,bestTimeToBuyAndSellStockII.maxProfit(new int[]{5,4,3}));
    }

}