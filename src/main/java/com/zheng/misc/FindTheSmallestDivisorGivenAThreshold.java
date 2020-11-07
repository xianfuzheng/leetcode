package com.zheng.misc;

public class FindTheSmallestDivisorGivenAThreshold {
    public int smallestDivisor(int[] nums, int threshold) {

        int max = Integer.MIN_VALUE;
        for(int num: nums) {
            max = Math.max(max, num);
        }

        int start = 1;
        int end = max;
        int lastMiddle = 0;
        int lastResult = 0;

        while(start<=end) {

            int middle = start + (end - start) /2;
            lastMiddle = middle;

            int result = calc(nums, middle);
            // System.out.println("start= " +start + " end=" + end + " m ="+ middle + " result =" + result);
            lastResult = result;

            if(result > threshold) {
                start = middle + 1;
            } else {
                end = middle -1;
            }
        }


        if( lastResult <= threshold) {
            return lastMiddle;
        } else {
            return lastMiddle + 1;
        }
    }

    private int calc(int [] nums, int divisor ) {
        int sum = 0;
        for(int num: nums) {
            int k = num/divisor;
            if(num%divisor ==0) {
                sum += k;
            } else {
                sum += k+1;
            }
            //sum += Math.ceil( (float)num /divisor);
        }

        return sum;
    }
}
