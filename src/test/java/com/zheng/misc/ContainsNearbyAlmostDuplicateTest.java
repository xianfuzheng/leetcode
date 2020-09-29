package com.zheng.misc;

import com.zheng.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContainsNearbyAlmostDuplicateTest {

    private ContainsNearbyAlmostDuplicate instance = new ContainsNearbyAlmostDuplicate();

    @Test
    public void test() {
        List<Integer> integers = Arrays.asList(-2147483648, 2147483647);
        integers.sort(Comparator.comparingInt(o -> o));

        Assertions.assertTrue(instance.solve(new int[]{1,2,3,1}, 3, 0));
        Assertions.assertTrue(instance.solve(new int[]{1,0,1,1}, 1, 2));
        Assertions.assertFalse(instance.solve(new int[]{1,5,9,1,5,9}, 2, 3));
        Assertions.assertFalse(instance.solve(new int[]{-2147483648,2147483647}, 1, 1));

        String loadString = TestUtils.loadString("big-int-array.txt");
        String[] strings = loadString.split(",");

        int [] nums = new int[strings.length];
        for(int i=0;i<strings.length;i ++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        Assertions.assertTrue(instance.solve(nums, 10000, 1));
    }


}