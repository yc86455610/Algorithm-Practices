package yc.java.offer;

import yc.java.tree.TreeNode;

/**
 * @program: algorithm-practices
 * @description: 对称的二叉树--offer13
 * @author: yc
 * @create: 2020-01-08 19:09
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 **/


public class IsSymmetricalTree {
    public boolean isSymmetricalTree(TreeNode root) {
        if (root == null)
            return true;
        return isSymmetricalTree(root.left, root.right);
    }

    private boolean isSymmetricalTree(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        if (left.val != right.val)
            return false;
        return isSymmetricalTree(left.left, right.right) && isSymmetricalTree(left.right, right.left);
    }
}
