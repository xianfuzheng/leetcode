package com.zheng.misc;

import com.zheng.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {
    ReverseList reverseList = new ReverseList();

    @Test
    public void test() {
        assertArrayEquals(new int[]{3,4,2,7}, reverseList.reverseList(ListNode.fromArray(new int[]{7,2,4,3})).toArray());
    }

}