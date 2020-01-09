package yc.java.offer;

import yc.java.listnode.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @program: Algorithm-Practices
 * @description: 从尾到头打印链表，返回ArrayList--offer8
 * @author: yc
 * @create: 2019-11-24 17:41
 **/


public class PrintListFromTailToHead {
    //递归法
    public static ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode != null) {
//            addAll方法是传入一个list，将此list的所有元素加入到当前list中
            ret.addAll(printListFromTailToHead1(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }

    //头插法:将节点插入到头部，在遍历原始链表时，将当前节点插入到新链表的头部，使其成为第一个节点
    public static ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {

        //头插法构建逆序链表
        ListNode head = new ListNode(-1);
        while (listNode != null) {
            ListNode next = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = next;
        }
        //构建ArrayList
        ArrayList<Integer> ret = new ArrayList<>();
        head = head.next;
        while (head != null) {
            ret.add(head.val);
            head = head.next;
        }
        return ret;
    }

    //使用栈：后进先出，在遍历链表时将值按顺序放入栈中，最后出栈的顺序即为逆序
    public static ArrayList<Integer> printListFromTailToHead3(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        while (!stack.isEmpty()) {
            ret.add(stack.pop());
        }
        return ret;
    }
}
