package yc.java.doublepointer;

import yc.java.listnode.ListNode;


/**
 * @program: interview
 * @description: 判断链表是否存在环: 使用双指针，一个指针每次移动一个节点，一个指针每次移动两个节点，如果存在环，那么这两个指针一定会相遇。
 * @author: yc
 * @create: 2019-11-23 17:01
 **/


public class hasCycle_141 {
    public static void main(String[] args) {
        System.out.println();
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head, fast = head.next;
        while (slow != null && fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
