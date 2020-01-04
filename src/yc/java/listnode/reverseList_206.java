package yc.java.listnode;

/**
 * @program: Algorithm-Practices
 * @description: 链表反转
 * @author: yc
 * @create: 2019-11-23 22:25
 **/

/**
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */

public class reverseList_206 {
    //递归
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode next = head.next;
        ListNode newHead = reverseList(next);
        next.next = head;
        head.next = null;
        return newHead;
    }

    //迭代(头插法)
    public ListNode reverseList2(ListNode head) {
        ListNode newHead = new ListNode(-1);
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead.next;
            newHead.next = head;
            head = next;
        }
        return newHead.next;
    }
}
