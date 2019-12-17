package yc.java.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: Algorithm-Practices
 * @description: 把二叉树打印成多行
 * @author: yc
 * @create: 2019-11-29 15:49
 *
 * 几乎和上题一样
 * 区别在于每层遍历填满一个list
 **/


public class PrintFromTopToBottom_offer322 {
    public ArrayList<ArrayList<Integer>> PrintFromTopToBottom2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int cnt = queue.size();
            while (cnt-- > 0) {
                TreeNode node = queue.poll();
                if (node == null)
                    continue;
                list.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }

            if (list.size() != 0)
                ret.add(list);
        }
        return ret;
    }
}


