package yc.java.listnode;

/**
 * @program: Algorithm-Practices
 * @description: 合并两个排序的链表
 * @author: yc
 * @create: 2019-11-29 15:38
 *
 * 1-->3-->5
 * 2-->4-->6
 *
 * 1-->2-->3-->4-->5-->6
 **/


public class Merge {
    //递归
    public ListNode merge1(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.val <= list2.val) {
            list1.next = merge1(list1.next, list2);
            return list1;
        } else {
            list2.next = merge1(list1, list2.next);
            return list2;
        }
    }

    //迭代
    public ListNode merge2(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if (list1 != null) cur.next = list1;
        if (list2 != null) cur.next = list2;
        return head.next;
    }
}
