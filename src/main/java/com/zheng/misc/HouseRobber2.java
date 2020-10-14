package com.zheng.misc;

public class HouseRobber2 {
    public int rob(int[] nums) {

        int len = nums.length;
        if(len ==0) {
            return 0;
        }

        if(len ==1) {
            return nums[0];
        }

        if(len ==2) {
            return Math.max(nums[0], nums[1]);
        }

        // 1 - n-1
        int [] arr = new int[len];
        arr[0] = 0;
        arr[1] = nums[0];

        for(int i=2; i< len; i++) {
            int v = arr[i-2] + nums[i-1];
            if(arr[i-1] > v) {
                arr[i] = arr[i-1];
            } else {
                arr[i] = v;
            }
        }

        int max1 = arr[len-1];

        arr = new int[len+1];
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = nums[1];

        //2 -n
        for(int i=3; i< len+1;i++) {
            arr[i] = Math.max(arr[i-1], arr[i-2] + nums[i-1]);
        }
        int max2 = arr[len];
        if(max1>max2) {
            System.out.println("rob 1-n-1");

        } else {
            System.out.println("rob 2 - n");
        }

        return Math.max(max1, max2);
    }

    public int robGreedy(int[] nums) {
        int len = nums.length;
        if(len ==0) {
            return 0;
        }

        if(len ==1) {
            return nums[0];
        }

        if(len ==2) {
            return Math.max(nums[0], nums[1]);
        }

        int maxOne = 0;
        int max1 = 0;
        int max2 = 0;

        // 1 - len-1
        for (int i=0; i< len-1; i++) {
            maxOne = Math.max( max2 + nums[i] , max1);
            max2 = max1;
            max1 = maxOne;
        }

        int maxTow = 0;
        max1 = max2 = 0;
        // 2 - len
        for (int i=1; i< len; i++) {
            maxTow = Math.max( max2 + nums[i] , max1);
            max2 = max1;
            max1 = maxTow;
        }
        return Math.max(maxOne, maxTow);
    }
}
