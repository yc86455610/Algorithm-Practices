package yc.java.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ycFw
 * @ClassName copyRandomList.java
 * @Description 复杂链表的复制
 * @createTime 2020年04月20日 14:28:00
 */


//新链表的数据结构每个节点还包括一个random指针
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


/**
 * 1.忽略random，复制链表
 * 2.用哈希表给原链表和新链表做映射
 * 3.复制random
 */
public class CopyRandomList {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Map<Node, Node> map = new HashMap<>();

        Node cur = head;

        //哈希映射
        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        cur = head;

        while (cur != null) {
            //新节点的next 就是 原节点next对应的新节点
            map.get(cur).next = map.get(cur.next);
            //复制random指针
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}
