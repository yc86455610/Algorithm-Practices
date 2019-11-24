package yc.java.ListNode;

/**
 * @program: Algorithm-Practices
 * @description: 找出两个链表的交点
 * @author: yc
 * @create: 2019-11-23 22:22
 **/


public class getIntersectionNode_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA, l2 = headB;
        while (l1 != l2) {
            l1 = (l1 == null) ? headB : l1.next;
            l2 = (l2 == null) ? headA : l2.next;
        }
        return l1;
    }
}
