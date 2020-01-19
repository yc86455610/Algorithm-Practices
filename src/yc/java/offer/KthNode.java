package yc.java.offer;

import yc.java.tree.TreeNode;

/**
 * @program: algorithm-practices
 * @description: 二叉搜索树的第K个节点--offer17
 * @author: yc
 * @create: 2020-01-19 21:35
 *
 * 给定一棵二叉搜索树{5, 3, 7, 2, 4, 6, 8}
 * 找到数值大小第三小的节点的值是4
 **/

public class KthNode {
    //    二叉搜索树中序遍历有序
    private int cnt;
    private TreeNode ret;

    // k = 3
    public TreeNode kthNode(TreeNode root, int k) {
        if (root != null) {
            TreeNode node = kthNode(root.left, k);
            if (node != null)
                ret = node;
            cnt++;
            if (cnt == k)
                ret = root;
            node = kthNode(root.right, k);
            if (node != null)
                ret = node;
        }
        return ret;
    }
}

