package com.zheng.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateImageSolutionTest {
    RotateImageSolution rotateImageSolution = new RotateImageSolution();

    @Test
    public void test() {
        int [][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotateImageSolution.rotate(matrix);
        assertArrayEquals(new int[]{7,4,1}, matrix[0]);
        assertArrayEquals(new int[]{8,5,2}, matrix[1]);
        assertArrayEquals(new int[]{9,6,3}, matrix[2]);
    }
}