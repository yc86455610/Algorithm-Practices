package yc.java.listnode;

/**
 * @program: Algorithm-Practices
 * @description: 找出两个链表的交点
 * @author: yc
 * @create: 2019-11-23 22:22
 *
 * A:          a1 → a2
 *                       ↘
 *                           c1 → c2 → c3
 *                       ↗
 * B:    b1 → b2 → b3
 *
 * 思路：当访问链表A的指针访问到链表的尾部时，走了a+c，让他从链表B的头部开始访问B，走了b，一共走了a+c+b
 * 同时，当访问链表B的指针访问到链表的尾部时，走了b+c，让他从链表A的头部开始访问A，走了a，一共走了b+c+a
 * 这样可以保证他们在交点相遇!
 *
 * 如果只是判断两个链表是否有交点，有两种方法：
 * 1、把第一个链表的结尾连接到第二个链表的开头，看第二个链表是否存在环；
 * 2、直接比较两个链表的最后一个节点是否相同。
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
