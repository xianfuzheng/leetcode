package com.zheng.misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveCoveredIntervalsTest {
    RemoveCoveredIntervals instance = new RemoveCoveredIntervals();

    @Test
    public void test() {
        Assertions.assertEquals(1, instance.removeCoveredIntervals(new int[][]{{1,2},{1,4},{3,4}}));
        Assertions.assertEquals(2, instance.removeCoveredIntervals(new int[][]{{1,4},{3,6},{2,8}}));
        Assertions.assertEquals(1, instance.removeCoveredIntervals(new int[][]{{1,4},{2,3}}));
        Assertions.assertEquals(2, instance.removeCoveredIntervals(new int[][]{{0,10},{5,12}, {5,8}}));
        Assertions.assertEquals(2, instance.removeCoveredIntervals(new int[][]{{3,10},{4,10},{5,11}}));
    }

}