package yc.java.offer;

import java.util.Arrays;

/**
 * @program: algorithm-practices
 * @description: 变态跳台阶--offer24
 * @author: yc
 * @create: 2020-01-19 22:20
 *
 * 一次可以上1, 2, 3, ..., n级
 */

public class JumpFloor2 {
    public int jumpFloor2(int target) {
        int[] dp = new int[target];
        Arrays.fill(dp, 1);
        for (int i = 1; i < target; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j];
            }
        }
        return dp[target - 1];
    }
}
