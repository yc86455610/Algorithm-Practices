package yc.java.listnode;

/**
 * @program: Algorithm-Practices
 * @description: 链表元素按奇偶聚集
 * @author: yc
 * @create: 2019-11-30 19:08
 *
 * Example:
 * Given 1->2->3->4->5->NULL,
 * return 1->3->5->2->4->NULL.
 *
 * 输入: 2->1->3->5->6->4->7->NULL
 * 输出: 2->3->6->7->1->5->4->NULL
 *
 * 注意： 是节点索引的奇偶性，不是节点值的奇偶性
 *
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 *
 * 思路：把奇节点放在一个链表里，偶节点放在另一个链表里。然后把偶链表接在奇链表的尾部。
 * 解决链表问题最好的办法是在脑中或者纸上把链表画出来。
 *
 * 分别形成奇链表和偶链表，最后将偶链表接在奇链表的尾部
 *
 * 时间复杂度o(n)  每个节点遍历一次
 * 空间复杂度o(1)
 **/


public class oddEvenList_10 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        //创建奇偶子链表
        ListNode oddHead = new ListNode(-1);
        ListNode evenHead = new ListNode(-1);

        ListNode odd = oddHead, even = evenHead, cur = head;

        //定义是否是奇节点
        boolean isOdd = true;

        //奇偶变换
        while (cur != null) {
            if (isOdd) {
                odd.next = cur;
                odd = cur;
            } else {
                even.next = cur;
                even = cur;
            }
            isOdd = !isOdd;  //每次取反实现奇偶交替
            cur = cur.next;
        }

        odd.next = evenHead.next;
        even.next = null;
        return oddHead.next;

    }

}
