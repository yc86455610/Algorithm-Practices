package yc.java.Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @program: Algorithm-Practices
 * @description: 重建二叉树：根据前序和中序输出后序
 * @author: yc
 * @create: 2019-12-01 14:42
 *
 * 思路：前序的第一个值是根节点的值，使用这个值将中序遍历结果分成两部分，
 * 左边部分是左子树中序遍历的结果，右边部分是右子树中序遍历的结果。
 * 然后分别对左右子树递归求解，求出后续的输出结果
 **/


public class reConstructBinaryTree_offer7 {
    public static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] pre = {3, 9, 20, 15, 7};
        int[] in = {9, 3, 15, 20, 7};  //根节点值是3，左子树节点值是9，右子树节点值分别是20，15，7
        ArrayList<Integer> list = postOrder(reConstructBinaryTree(pre, in));
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        //先判断数组是否为空
        if (startPre > endPre || startIn > endIn) return null;
        TreeNode root = new TreeNode(pre[startPre]);   //根节点的值是前序遍历的首个元素
        //遍历中序数组
        for (int i = startIn; i < endIn; i++) {
            if (pre[startPre] == in[i]) {   //中序数组遍历到根节点的值
                //注意边界的判断
                root.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
                root.right = reConstructBinaryTree(pre, startPre + i - startIn + 1, endPre, in, i + 1, endIn);
                break;
            }
        }
        return root;
    }

    //后序遍历
    public static ArrayList<Integer> postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            list.add(root.val);
        }
        return list;
    }
}