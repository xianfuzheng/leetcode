package com.zheng.misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartitionLabelTest {

    PartitionLabel instance = new PartitionLabel();

    @Test
    public void test() {
        List<Integer> list = instance.partitionLabels("ababcbacadefegdehijhklij");
        Assertions.assertArrayEquals(new Integer[]{9,7,8}, list.toArray(new Integer[0]));

        list = instance.partitionLabels("abad");
        Assertions.assertArrayEquals(new Integer[]{3,1}, list.toArray(new Integer[0]));
    }

}