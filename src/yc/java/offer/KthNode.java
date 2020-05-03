package yc.java.offer;

import yc.java.tree.TreeNode;

/**
 * @program: algorithm-practices
 * @description: 二叉搜索树的第K大节点--offer17
 * @author: yc
 * @create: 2020-01-19 21:35
 *
 * 给定一棵二叉搜索树{5, 3, 7, 2, 4, 6, 8}
 * k=3，第3大的节点值为6
 **/

public class KthNode {
    static int k, res;

    public int KthNode(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.right);
        if (k == 0) return;
        if (--k == 0) res = root.val;
        dfs(root.left);
    }
}

