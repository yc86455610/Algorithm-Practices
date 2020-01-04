package yc.java.dynamicplanning;

/**
 * @program: Algorithm-Practices
 * @description: 分割整数的最大乘积
 * @author: yc
 * @create: 2019-11-29 19:55
 *
 * 题目描述：For example,
 * given n = 2, return 1 (2 = 1 + 1);
 * given n = 10, return 36 (10 = 3 + 3 + 4).
 *
 * 1、贪心
 * 2、dp
 **/


public class integerBreak_343 {
    public static void main(String[] args) {
        System.out.println(integerBreak(10));
    }

    public static int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), dp[i - j] * j));
            }
        }
        return dp[n];
    }
}
