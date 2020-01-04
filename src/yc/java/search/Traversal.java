package yc.java.search;

import yc.java.tree.TreeNode;

import java.util.*;

/**
 * @program: Algorithm-Practices
 * @description: 二叉树遍历的dfs/bfs的递归/非递归算法
 * @author: yc
 * @create: 2019-11-29 12:14
 *
 * bfs递归形式：二叉树的bfs就是以层序去遍历二叉树的节点，每当dfs遍历到了一个新的节点，就把他加入到
 * 所在层的list里。其实使用dfs的方法实现二叉树的 bfs。例子就是把每层的node放在子list里
 *
 * bfs非递归形式：用了队列的数据结构，维护当前层的node数量和下一层的node数量
 *
 * dfs递归形式：前序中序后序遍历
 * dfs非递归形式：栈模拟递归，利用栈的数据结构，将右子树压入栈再将左子树压入栈
 **/


public class Traversal {
    //dfs递归
    List<TreeNode> res = new ArrayList<>();

    public List<TreeNode> traversal1(TreeNode root) {
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root != null) {
            res.add(root);
            dfs(root.left);
            dfs(root.right);
        }
    }

    //dfs非递归：栈，利用栈，将右子树压入栈再将左子树压入栈
    private List<TreeNode> traversal2(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            res.add(node);
            stack.pop();
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return res;
    }


    //bfs递归:每当dfs遍历到一个新的节点时，就把他加入到所在层的list里
    public List<List<TreeNode>> traversal3(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<List<TreeNode>> list = new ArrayList<>();
        dfs(root, 0, list);
        return list;
    }

    private void dfs(TreeNode root, int level, List<List<TreeNode>> list) {
        if (root == null) {
            return;
        }
        if (level >= list.size()) {
            List<TreeNode> subList = new ArrayList<>();
            subList.add(root);
            list.add(subList);
        } else {
            list.get(level).add(root);
        }
        dfs(root.left, level + 1, list);
        dfs(root.right, level + 1, list);
    }

    //bfs非递归:最常用的一种方法，使用队列的数据结构，并且维护当前层的node数量和下一层的node数量
    public List<TreeNode> traversal4(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<TreeNode> res = new ArrayList<>();
        if (root == null) return null;
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                if (queue.peek().left != null)
                    queue.add(queue.peek().left);
                if (queue.peek().right != null)
                    queue.add(queue.peek().right);
                res.add(queue.poll());
            }
        }
        return res;
    }

}


