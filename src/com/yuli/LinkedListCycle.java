package com.yuli;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && slow != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if( fast == slow){
                return true;
            }
        }
        return false;
    }
}
