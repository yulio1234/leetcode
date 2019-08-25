package com.yuli;

public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode pre = result;
        while(pre.next != null && pre.next.next != null){
            //获取链表第一个节点
            ListNode node1 = pre.next;
            //获取链表第二个节点
            ListNode node2 = node1.next;
            //将结果链表第一个节点交换为第二个节点
            pre.next = node2;
            //将结果链表
            node1.next = node2.next;
            node2.next = node1;
            pre = node1;
        }
        return result.next;
    }

    public static void main(String[] args) {
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        swapNodesInPairs.swapPairs(listNode);
    }

}
