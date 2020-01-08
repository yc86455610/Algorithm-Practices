package yc.java.tree;

/**
 * @program: Algorithm-Practices
 * @description: 判别平衡二叉树：左右子树高度差不超过1
 * @author: yc
 * @create: 2019-11-30 19:23
 **/


public class IsBalancedTree {
    private boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        height(root);
        return isBalanced;
    }

    private int height(TreeNode root) {
        if (root == null || !isBalanced)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1)
            isBalanced = false;
        return 1 + Math.max(left, right);
    }
}
