package yc.java.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: Algorithm-Practices
 * @description: 之字形打印二叉树
 * @author: yc
 * @create: 2019-11-29 15:49
 *
 * 之字形打印二叉树：第一行从左到右，第二行从右到左，第三行从左到右，以此类推
 **/


public class PrintFromTopToBottom_offer323 {
    public ArrayList<ArrayList<Integer>> PrintFromTopToBottom3(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        queue.add(root);

        //每次变换reverse来达到变换方向的效果
        boolean reverse = false;

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

            if (reverse)
                Collections.reverse(list);  //颠倒list次序
            reverse = !reverse;

            if (list.size() != 0)
                ret.add(list);
        }
        return ret;
    }
}


