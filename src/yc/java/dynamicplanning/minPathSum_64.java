package yc.java.dynamicplanning;

/**
 * @program: Algorithm-Practices
 * @description: 矩阵的最小路径和
 * @author: yc
 * @create: 2019-11-29 19:29
 *
 * [[1,3,1],
 * [1,5,1],
 * [4,2,1]]
 * Given the above grid map, return 7.
 *
 * 题目描述：求从矩阵的左上角到右下角的最小路径和，每次只能向右和向下移动。
 **/


public class minPathSum_64 {
    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0)
            return 0;
        int m = grid.length, n = grid[0].length;
        int[] dp = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {   //在第一列
                    dp[j] = dp[j]; //只能从上边走到该位置
                } else if (i == 0) {  //在第一行
                    dp[j] = dp[j - 1]; //只能从左边走到该位置
                } else {
                    dp[j] = Math.min(dp[j - 1], dp[j]);
                }
                dp[j] += grid[i][j];
            }
        }
        return dp[n - 1];
    }
}
