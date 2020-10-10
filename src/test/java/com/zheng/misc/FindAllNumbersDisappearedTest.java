package com.zheng.misc;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindAllNumbersDisappearedTest {
    FindAllNumbersDisappeared findAllNumbersDisappeared = new FindAllNumbersDisappeared();

    @Test
    public void test() {
        assertArrayEquals(
                new Integer[]{5,6},
                findAllNumbersDisappeared.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}).toArray(new Integer[0])
        );
    }

}