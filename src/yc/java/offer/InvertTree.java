package yc.java.offer;


import yc.java.tree.TreeNode;

/**
 * @program: Algorithm-Practices
 * @description: 翻转二叉树，二叉树的镜像--offer33
 * @author: yc
 * @create: 2019-11-24 14:14
 *
 * 输入：
 *
 * 4
 * /   \
 * 2     7
 * / \   / \
 * 1   3 6   9
 * 输出：
 *
 * 4
 * /   \
 * 7     2
 * / \   / \
 * 9   6 3   1
 *
 * 思路：前序遍历二叉树的每个节点，如果遍历到的节点有子节点，交换他的两个子节点。
 * 当交换完所有非叶子节点的左右子节点时，得到了树的镜像，完成翻转
 **/


public class InvertTree {
    public void invertTree(TreeNode root) {
        if (root == null)
            return;
        // 先序遍历
        swap(root);
        invertTree(root.left);
        invertTree(root.right);
    }

    private void swap(TreeNode root) {
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
    }
}
