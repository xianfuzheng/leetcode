package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SummaryRangesTest {

    SummaryRanges summaryRanges = new SummaryRanges();

    @Test
    public void test() {
        // 1, 3, 7, 2, 6
        summaryRanges.addNum(1);
        summaryRanges.addNum(3);
        summaryRanges.addNum(7);
        summaryRanges.addNum(2);
        summaryRanges.addNum(6);


    }

}