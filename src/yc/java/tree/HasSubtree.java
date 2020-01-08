package yc.java.tree;

/**
 * @program: Algorithm-Practices
 * @description: 树的子结构
 * @author: yc
 * @create: 2019-11-29 17:37
 *
 * 查看是否为子树
 **/


public class HasSubtree {
    public boolean hasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        //两棵树的根节点相同，root1的左子树和右子树中是否有root2
        return isSubtreeWithRoot(root1, root2) || hasSubtree(root1.left, root2) || hasSubtree(root1.right, root2);
    }

    //从root节点开始查看是否存在子树
    private boolean isSubtreeWithRoot(TreeNode root1, TreeNode root2) {
        if (root1 == null) return false;
        if (root2 == null) return true;
        if (root1.val != root2.val)
            return false;
        return isSubtreeWithRoot(root1.left, root2.left) && isSubtreeWithRoot(root1.right, root2.right);
    }
}
