package yc.java.offer;

import yc.java.offer.TreeLinkNode;

/**
 * @program: algorithm-practices
 * @description: 二叉树的下一个节点--offer12
 * @author: yc
 * @create: 2020-01-19 14:21
 *
 *
 * 给定一棵二叉树和其中的一个节点，找出中序遍历的下一个节点并返回
 * 注意：树种的节点不仅包含左右子节点，同时包含指向父节点的指针
 **/

public class GetNext {
    // 中序遍历：左=）根=》右

    /**
     * 1、如果一个节点的右子树不为空，那么该节点的下一个节点是右子树的最左节点
     * 2、否则，向上找第一个左链接指向的树包含该节点的祖先节点
     */

    public TreeLinkNode getNext(TreeLinkNode pNode) {
        if (pNode.right != null) {   //该节点的右子树不为空
            TreeLinkNode node = pNode.right;
            while (node.left != null) {
                node = node.left;
            }
            return node;
        } else {  //该节点的右子树为空，那么下一个节点就是第一个左链接指向的树包含该节点的祖先节点
            while (pNode.next != null) {
                TreeLinkNode parent = pNode.next;   //当前节点的父节点
                if (parent.left == pNode) {
                    return parent;
                }
                pNode = pNode.next;
            }
        }
        return null;
    }
}
