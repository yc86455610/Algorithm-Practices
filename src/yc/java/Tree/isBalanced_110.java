package yc.java.Tree;


/**
 * @program: Algorithm-Practices
 * @description: 二叉树是否是平衡树：平衡树左右子树高度差都小于等于1
 * @author: yc
 * @create: 2019-11-24 13:46
 * <p>
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 **/


public class isBalanced_110 {
    private boolean result = true;

    public boolean isBanlanced(TreeNode root) {
        maxDepth(root);
        return result;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (Math.abs(l - r) > 1) result = false;
        return Math.max(l, r) + 1;
    }
}
