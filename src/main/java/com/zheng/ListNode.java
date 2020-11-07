package com.zheng;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode fromArray(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode p = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode t = new ListNode(arr[i]);
            p.next = t;
            p = p.next;
        }
        return head;
    }

    public int[] toArray() {
        int size = 0;
        ListNode p = this;
        while (p != null) {
            size++;
            p = p.next;
        }

        int[] arr = new int[size];
        p = this;
        int k = 0;
        while (p != null) {
            arr[k++] = p.val;
            p = p.next;
        }

        return arr;

    }
}