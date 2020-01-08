package yc.java.listnode;

/**
 * @program: Algorithm-Practices
 * @description: 链表中环的入口节点
 * @author: yc
 * @create: 2019-11-29 14:45
 *
 * 一个链表中包含环，请找出该链表的环的入口结点。要求不能使用额外的空间。
 *
 * 双指针：一个slow指针每次移动一个节点，因为存在环，所以两个指针必定相遇在环中的某个节点上。
 *
 * slow移动：x+y
 * fast一定：x+y+z+y=x+2y+z
 * 得出x=z
 *
 * 在相遇点，slow要到环的入口点需要移动z个节点，fast从头移动1个节点，移动到环入口点需要移动x个节点
 * 因为x和z相等，所以他们会在环入口点相遇
 **/


public class EntryNodeOfLoop_offer23 {
    public ListNode EntryNodeOfLoop(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head, fast = head;
        do {
            fast = fast.next.next;
            slow = slow.next;
        } while (fast != slow);  //此时两个快慢指针相遇
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
