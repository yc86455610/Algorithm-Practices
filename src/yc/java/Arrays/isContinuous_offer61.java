package yc.java.Arrays;

import java.util.Arrays;

/**
 * @program: Algorithm-Practices
 * @description: 五张牌看是否成顺子：五张牌，其中大小鬼为癞子，牌面为 0。判断这五张牌是否能组成顺子。
 * @author: yc
 * @create: 2019-12-14 17:12
 **/


public class isContinuous_offer61 {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 5, 0};
        int[] nums2 = {1, 4, 0, 5, 0};
        System.out.println(isContinuous(nums1));
        System.out.println(isContinuous(nums2));
    }

    private static boolean isContinuous(int[] nums) {
        if (nums.length < 5) return false;
        Arrays.sort(nums);

        //统计癞子数量
        int cnt = 0;
        for (int num : nums) {
            if (num == 0)
                cnt++;
        }

        //使用癞子补全不连续的顺子
        for (int i = cnt; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i])
                return false;   //牌面中有一样的牌，直接返回false

            //例子中排序后卫 0，1，3，4，5， 用癞子去补2，消耗一张癞子
            cnt -= nums[i + 1] - nums[i] - 1;
        }

        return cnt >= 0;
    }

}
