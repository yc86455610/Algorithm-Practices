package yc.java.DynamicPlanning;

/**
 * @program: Algorithm-Practices
 * @description: 连续子数组的最大和
 * @author: yc
 * @create: 2019-12-01 18:38
 *
 * 问题描述：给定一个数组a，数组中的元素有正数也有负数，数组中的一个或连续多个数组成一个子数组。求这些所有子数组的最大和。
 * 例如：a={-1, 2, 3, -4, 5}，它的最大和应该是：2+3+(-4)+5=6。
 *
 * 思路：
 * 1、贪心：每次判断当前最大值是否为非正数，如果是则换成当前值
 * 2、dp：直接通过动态方程来解答
 **/


public class maxSumSequence {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 3};
        System.out.println(maxSumSequence01(nums));
        System.out.println(maxSumSequence02(nums));
    }

    //贪心
    public static int maxSumSequence01(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int maxSum = 0;
        int curSum = 0;  //当前位置的最大和
        for (int i = 0; i < nums.length; i++) {
            if (curSum <= 0) {
                curSum = nums[i];
            } else {
                curSum += nums[i];
            }
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }

    //dp
    public static int maxSumSequence02(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int maxSum = 0;
        int curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            curSum = Math.max(curSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }
}



