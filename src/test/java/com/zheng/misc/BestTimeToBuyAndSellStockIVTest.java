package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockIVTest {
    BestTimeToBuyAndSellStockIV bestTimeToBuyAndSellStockIV = new BestTimeToBuyAndSellStockIV();
    @Test
    public void test() {
        //assertEquals(2, bestTimeToBuyAndSellStockIV.maxProfit(2,new int[]{2,4,1}));
        assertEquals(7, bestTimeToBuyAndSellStockIV.maxProfit(2,new int[]{3,2,6,5,0,3}));
    }

}