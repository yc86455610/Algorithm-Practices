package yc.java.tree;

/**
 * @program: Algorithm-Practices
 * @description: 求二叉树的高度
 * @author: yc
 * @create: 2019-11-24 13:36
 *
 * 二叉树算法题中，主要考察以下几种算法思想：
 * 1、递归
 * 2、层次遍历
 * 3、前中后序遍历
 * 4、BST二叉搜索树
 * 5、Trie字典树
 **/

/**
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 *
 * output : 3
 */
public class maxDepth_104 {
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right) + 1);
    }
}
