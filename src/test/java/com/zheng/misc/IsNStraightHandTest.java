package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsNStraightHandTest {
    IsNStraightHand isNStraightHand = new IsNStraightHand();

    @Test
    public void test() {
        assertTrue(isNStraightHand.isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8}, 3));
        assertFalse(isNStraightHand.isNStraightHand(new int[]{1,2,3,4,5}, 4));
    }

}