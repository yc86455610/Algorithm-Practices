package yc.java.Tree;

/**
 * @program: Algorithm-Practices
 * @description: 翻转二叉树
 * @author: yc
 * @create: 2019-11-24 14:14
 * <p>
 * 输入：
 * <p>
 * 4
 * /   \
 * 2     7
 * / \   / \
 * 1   3 6   9
 * 输出：
 * <p>
 * 4
 * /   \
 * 7     2
 * / \   / \
 * 9   6 3   1
 **/


public class invertTree_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = root.left;  //后面的操作会改变left指针，因此先保存下来
        root.left = invertTree(root.right); //翻转后根节点的左节点变为之前根节点的右节点，返回该节点
        root.right = invertTree(left);
        return root;
    }
}
