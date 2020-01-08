package yc.java.dynamicplanning;


/**
 * @program: Algorithm-Practices
 * @description: 礼物的最大价值
 * @author: yc
 * @create: 2019-11-29 15:56
 * 在一个 m*n 的棋盘的每一个格都放有一个礼物，每个礼物都有一定价值（大于 0）。
 * 从左上角开始拿礼物，每次向右或向下移动一格，直到右下角结束。
 * 给定一个棋盘，求拿到礼物的最大价值。例如，对于如下棋盘
 * 1    10   3    8
 * 12   2    9    6
 * 5    7    4    11
 * 3    7    16   5
 * 礼物的最大价值为 1+12+5+7+7+16+5=53。
 * 可以用dp也可以用dfs，但是dfs过于复杂，不是最优解
 **/


public class getMost_offer47 {
    public static int getMost(int[][] values) {
        if (values == null || values.length == 0 || values[0].length == 0)
            return 0;
        //列数
        int n = values[0].length;
        //dp数组中存放遍历到该列的最大价值
        int[] dp = new int[n];
        //按行查找
        for (int[] value : values) {
            dp[0] += value[0];
            for (int i = 1; i < n; i++) {
                dp[i] = Math.max(dp[i], dp[i - 1]) + value[i];
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[][] values = {{1, 10, 3, 8}, {12, 2, 9, 6}, {5, 7, 4, 11}, {3, 7, 16, 5}};
        System.out.println(getMost(values));
    }
}
