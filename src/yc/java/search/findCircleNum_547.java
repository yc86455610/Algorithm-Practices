package yc.java.search;

/**
 * @program: Algorithm-Practices
 * @description: 好友关系的联通分量数目
 * @author: yc
 * @create: 2019-11-28 19:29
 **/

/**
 * Input:
 * [[1,1,0],
 * [1,1,0],
 * [0,0,1]]
 *
 * Output: 2
 *
 * 学生0 和学生1互为朋友，学生2在自己的朋友圈，所有返回2
 * Explanation:The 0th and 1st students are direct friends, so they are in a friend circle.
 * The 2nd student himself is in a friend circle. So return 2.
 *
 * 题目描述：好友关系可以看成是一个无向图，
 * 例如第 0 个人与第 1 个人是好友，那么 M[0][1] 和 M[1][0] 的值都为 1。
 */

public class findCircleNum_547 {
    public static void main(String[] args) {
        int[][] M = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(findCircleNum(M));

        int[][] N = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        System.out.println(findCircleNum(N));
    }

    private static int n;

    public static int findCircleNum(int[][] M) {
        n = M.length;
        int circleNum = 0;
        //方阵，总共有n个朋友
        boolean[] hasVisited = new boolean[n];
        for (int i = 0; i < n; i++) {
            //如果该学生未被访问，则对其进行dfs查找
            if (!hasVisited[i]) {
                dfs(M, i, hasVisited);
                circleNum++;
            }
        }
        return circleNum;
    }

    private static void dfs(int[][] M, int i, boolean[] hasVisited) {
        hasVisited[i] = true; //标记为查找过
        for (int j = 0; j < n; j++) {
            if (M[i][j] == 1 && !hasVisited[j]) {
                dfs(M, j, hasVisited);
            }
        }
    }
}

