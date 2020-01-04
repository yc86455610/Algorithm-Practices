package yc.java.listnode;

/**
 * @program: Algorithm-Practices
 * @description: 两数相加，输出链表
 * @author: yc
 * @create: 2019-12-03 13:38
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 思路：
 * 1、当前的cur节点设置为哑结点
 * 2、设置进位carry=0，carry只等于0或者1
 * 3、p和q分别初始化为l1和l2的头部
 * 4、遍历两个链表直到尾部
 **/


public class addTwoNumbers_2 {
    public ListNode addTwoNumbers_2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode p = l1, q = l2, cur = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;  //当前遍历结合carry进位的sum
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);  //cur的下一个节点
            cur = cur.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            cur.next = new ListNode(carry);  //循环结束，最末尾可能要进1
        }
        return dummyHead.next;
    }
}