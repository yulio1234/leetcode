package com.yuli;

/**
 *206 反转链表
 *解题思路： 采用头插法，创建新的链表pre，循环每次将cur的第二个节点指向pre。
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null){
            //先保存当前节点的下一个节点，意思是将头节点去掉
            ListNode temp = cur.next;
            //将头节点的下一个节点只想pre
            cur.next = pre;
            //每次循环pre等于cur头节点+pre链表
            pre = cur;
            //cur等于去掉头节点剩下的链表
            cur = temp;
        }
        return pre;
    }
}