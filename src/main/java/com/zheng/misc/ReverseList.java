package com.zheng.misc;

import com.zheng.ListNode;

public class ReverseList {

    public ListNode reverseList(ListNode list) {
        ListNode p = null;
        ListNode q = list;
        while( q != null ) {
            ListNode t = q.next;
            q.next = p;
            p = q;
            q = t;
        }

        return p;
    }
}
