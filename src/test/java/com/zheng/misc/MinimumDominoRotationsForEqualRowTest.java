package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDominoRotationsForEqualRowTest {
    MinimumDominoRotationsForEqualRow minimumDominoRotationsForEqualRow = new MinimumDominoRotationsForEqualRow();

    @Test
    public void test() {
        assertEquals(2, minimumDominoRotationsForEqualRow.minDominoRotations(
                new int[]{2,1,2,4,2,2},
                new int[]{5,2,6,2,3,2})
        );
        assertEquals(-1, minimumDominoRotationsForEqualRow.minDominoRotations(
                new int[]{3,5,1,2,3},
                new int[]{3,6,3,3,4})
        );
        minimumDominoRotationsForEqualRow.minDominoRotationsWithSwapInstruction(
                new int[]{2,1,2,4,2,2},
                new int[]{5,2,6,2,3,2});
    }

}