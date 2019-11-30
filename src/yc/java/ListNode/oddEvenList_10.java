package yc.java.ListNode;

/**
 * @program: Algorithm-Practices
 * @description: 链表元素按奇偶聚集
 * @author: yc
 * @create: 2019-11-30 19:08
 *
 * Example:
 * Given 1->2->3->4->5->NULL,
 * return 1->3->5->2->4->NULL.
 **/


public class oddEvenList_10 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return head;
        ListNode odd = head, even = head.next, evenHead = even;
        odd.next = odd.next.next;


        return head;
    }
}
