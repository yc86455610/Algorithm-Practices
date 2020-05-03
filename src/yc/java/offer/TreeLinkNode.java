package yc.java.offer;

/**
 * @program: algorithm-practices
 * @description: 二叉树的下一个节点
 * @author: yc
 * @create: 2020-01-19 14:24
 **/

public class TreeLinkNode {
    //对于单个节点来说，不仅包含左右子节点，还包含指向父节点的指针
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null; //指向父节点的指针

    TreeLinkNode(int val) {
        this.val = val;
    }
}
