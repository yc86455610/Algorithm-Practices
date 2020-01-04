package yc.java.search;

/**
 * @program: Algorithm-Practices
 * @description: 计算在网格中从原点到特定点的最短路径长度
 * @author: yc
 * @create: 2019-11-26 18:04
 * /
 *
 * /**
 * 深度优先搜索dfs和广度优先搜索bfs广泛运用于树和图中
 *
 * BFS
 * 广度优先搜索一层一层的进行遍历，每层遍历都以上一层遍历的结果作为起点，
 * 遍历一个距离能访问到的所有节点。需要注意的是，遍历过的节点不能再次被遍历
 *
 * 结合images中给出的图片，访问层次如下：
 *
 * 第一层:
 * 0->{6,2,1,5}
 *
 * 第二层:
 * 6->{4}
 * 2->{}
 * 1->{}
 * 5->{3}
 *
 * 第三层:
 * 4->{}
 * 3->{}
 *
 * 每一层遍历的节点都与根节点的距离相同。设di表示第i个节点与根节点的距离，推导出一个结论：
 * 对于先遍历的节点i与后遍历的节点j,有di<=dj.
 * 利用这个结论，可以求解最短路径等最优解问题：第一次遍历到目的节点，其所经过的路径为最短路径。
 * 注意，使用bfs只能求解无权图的最短路径，无权图是指从一个节点到另一个节点的代价都为1
 *
 * 实现bfs需要考虑的问题：
 * 1、队列：用来存储每一轮遍历得到的节点
 * 2、标记：对于遍历过的节点，应该将它标记，防止重复遍历
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 题目描述：0 表示可以经过某个位置，求解从左上角到右下角的最短路径长度。
 *
 * [[1,1,0,1],
 * [1,0,1,0],
 * [1,1,1,1],
 * [1,0,1,1]]
 */
public class shortestPathBinaryMatrix_1091 {
    public static int shortestPathBinaryMatrix(int[][] grids) {
        //定义八个方向，有上下左右、左上、左下、右上、右下八个方向可以走
        int[][] directions = {{1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}, {0, -1}, {1, -1}};
        int m = grids.length, n = grids[0].length;
        Queue<HashMap<Integer, Integer>> queue = new LinkedList<>();
        queue.add(new HashMap<>(0,0));
        int pathLength=0;
        while (!queue.isEmpty()){
            int size = queue.size();
            pathLength++;
            while (size-->0){
                HashMap<Integer,Integer> cur = queue.poll();
//                int cr  = cur.get()
            }
        }


        return -1;
    }
}
