package yc.java.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: Algorithm-Practices
 * @description: 从上往下打印二叉树
 * @author: yc
 * @create: 2019-11-29 15:49
 *
 * 从上往下打印二叉树的每个节点，同层节点从左至右打印
 * 使用bfs进行层次遍历
 * 只需要一个队列，因为在开始遍历一层的节点时，当前队列中的节点数就是当前层的节点数，
 * 只要控制遍历这么多节点数，就能保证这次遍历的都是当前层的节点
 **/


public class PrintFromTopToBottom_offer321 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> ret = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int cnt = queue.size();
            while (cnt-- > 0) {
                TreeNode t = queue.poll();
                if (t == null)
                    continue;
                ret.add(t.val);
                queue.add(t.left);
                queue.add(t.right);
            }
        }
        return ret;
    }
}


