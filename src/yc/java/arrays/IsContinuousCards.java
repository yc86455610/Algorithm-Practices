package yc.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: Algorithm-Practices
 * @description: 五张牌看是否成顺子：五张牌，其中大小鬼为癞子，牌面为 0。判断这五张牌是否能组成顺子。
 * @author: yc
 * @create: 2019-12-14 17:12
 **/


public class IsContinuousCards {
    static final int N = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) nums[i] = sc.nextInt();
        System.out.println(isContinuous(nums));
    }

    private static boolean isContinuous(int[] nums) {
        if (nums.length != 5) return false;
        Arrays.sort(nums);

        //统计癞子数量
        int cnt = 0;
        for (int num : nums) {
            if (num == 0) cnt++;
        }

        //使用癞子补全不连续的顺子
        for (int i = cnt; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) return false;
            cnt -= nums[i + 1] - nums[i] - 1;
        }
        return cnt >= 0;
    }
}
