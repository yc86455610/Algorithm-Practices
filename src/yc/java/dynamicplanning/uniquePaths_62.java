package yc.java.dynamicplanning;

import java.util.Arrays;

/**
 * @program: Algorithm-Practices
 * @description: 矩阵的总路径数
 * @author: yc
 * @create: 2019-11-29 19:42
 *
 * 题目描述：统计从矩阵左上角到右下角的路径总数，每次只能向右或者向下移动。
 **/


public class uniquePaths_62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 3));
    }

    public static int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[n - 1];
    }
}
