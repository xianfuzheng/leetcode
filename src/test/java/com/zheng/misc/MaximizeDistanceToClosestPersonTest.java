package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximizeDistanceToClosestPersonTest {
    MaximizeDistanceToClosestPerson maximizeDistanceToClosestPerson = new MaximizeDistanceToClosestPerson();

    @Test
    public void test() {
        assertEquals(4, maximizeDistanceToClosestPerson.maxDistToClosest(new int[]{0,0,0,0,1,0,0,0,1,0,1}));
        assertEquals(6, maximizeDistanceToClosestPerson.maxDistToClosest(new int[]{0,0,1,0,0,0,0,0,0}));

    }

}