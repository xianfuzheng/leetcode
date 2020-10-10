package com.zheng.misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinNumberToShootBalloonTest {

    MinNumberToShootBalloon minNumberToShootBalloon = new MinNumberToShootBalloon();

    @Test
    public void test() {
        Assertions.assertEquals(0, minNumberToShootBalloon.findMinArrowShots(new int[][]{}));
        Assertions.assertEquals(2, minNumberToShootBalloon.findMinArrowShots(new int[][]{
                {1,2},{2,3},{3,4},{4,5}
        }));
        Assertions.assertEquals(2, minNumberToShootBalloon.findMinArrowShots(new int[][]{
                {10,16},{2,8},{1,6},{7,12}
        }));
        Assertions.assertEquals(2, minNumberToShootBalloon.findMinArrowShots(new int[][]{
                {9,12},{1,10},{4,11},{8,12},{3,9},{6,9},{6,7}
        }));

        Assertions.assertEquals(2, minNumberToShootBalloon.findMinArrowShots(new int[][]{
                {3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}
        }));
    }
}