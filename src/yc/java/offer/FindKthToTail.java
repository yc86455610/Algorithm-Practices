package yc.java.offer;

import yc.java.listnode.ListNode;

/**
 * @program: Algorithm-Practices
 * @description: 链表中倒数第k个节点--offer29
 * @author: yc
 * @create: 2019-11-29 14:59
 *
 * 1-->2-->3-->4-->5-->6-->null
 * 倒数第3个节点是4
 *
 * 设链表的长度为 N。设置两个指针 P1 和 P2，先让 P1 移动 K 个节点，
 * 则还有 N - K 个节点可以移动。此时让 P1 和 P2 同时移动，
 * 可以知道当 P1 移动到链表结尾时，P2 移动到第 N - K 个节点处，该位置就是倒数第 K 个节点。
 **/


public class FindKthToTail {
    public static ListNode findKthToTail(ListNode head, int k) {
        if (head == null) return null;
        ListNode p1 = head;
        //k=2
        while (p1 != null && k-- > 0)
            p1 = p1.next;
        if (k > 0)
            return null;
        ListNode p2 = head;
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;

    }

}

