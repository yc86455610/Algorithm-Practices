package yc.java.tree;

/**
 * @program: Algorithm-Practices
 * @description: 二叉树中两节点的最长路径
 * @author: yc
 * @create: 2019-11-24 13:50
 * <p>
 * Input:
 * <p>
 * 1
 * / \
 * 2  3
 * / \
 * 4   5
 * <p>
 * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
 * 两节点之间的路径长度是以他们之间边的数目表示。所以返回3而不是4！
 **/


public class diameterOfBinaryTree_543 {
    public int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }

    private int depth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        //可以这么理解，返回答案是左子树深度+右字树深度。
        //左子树从最远的叶子节点到根节点的边数目正好等于左子树深度，右子树亦然
        max = Math.max(max, leftDepth + rightDepth);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
