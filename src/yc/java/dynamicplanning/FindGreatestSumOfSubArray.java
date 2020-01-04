package yc.java.dynamicplanning;

/**
 * @program: algorithm-practices
 * @description: 求连续子数组的最大和
 * @author: yc
 * @create: 2020-01-04 15:45
 *
 * 一个整形数组，有正有负。数组中一个或者连续多个整数组成一个子数组，求所有子数组的和的最大值。
 * 要求时间复杂度为o(n)
 *
 * input:num = {1,-2,3,10,-4,,7,2,-5}
 * output:subArray={3,10,-4,7,2}, max = 18
 **/


public class FindGreatestSumOfSubArray {
    /**
     *1、首先想到枚举出数组的所有子数组并求出他们的和。长度为n的数组共有n(n+1)/2个子数组，最快也需要
     o(n2)的时间复杂度
     * */

    /**
     * 2、寻找数字规律：当前几项子数组和<=0时，舍弃前面的子数组，从下一项数组开始寻找子数组。
     * 因为前面得到的子数组加当前项的和组成的新子数组，也比当前项自己要小
     */

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 10, -4, 7, 2, -5};
        int nlLength = 8;
//        System.out.println(FindGreatestSumOfSubArray(arr, nlLength));
        System.out.println(FindGreatestSumOfSubArrayDp(arr, nlLength));
    }

    //定义全局变量来标记输入是否无效
    static boolean g_isInvalidInput = false;

    public static int FindGreatestSumOfSubArray(int[] arr, int nLength) {
        if (arr == null || nLength <= 0) {
            g_isInvalidInput = true;  //输入无效
            return 0;
        }

        g_isInvalidInput = false;

        int curSum = 0, greatestSum = Integer.MIN_VALUE;
        for (int i = 0; i < nLength; i++) {
            if (curSum <= 0)
                curSum = arr[i];
            else
                curSum += arr[i];
            if (curSum > greatestSum)
                greatestSum = curSum;
        }
        return greatestSum;
    }

    public static int FindGreatestSumOfSubArrayDp(int[] arr, int nLength) {
        if (arr == null || nLength <= 0) {
            g_isInvalidInput = true;  //输入无效
            return 0;
        }

        // dp求解，dp[i]表示以第i个数字结尾的子数组的最大和，需要求出max[dp[i]]，dp[i]有动态转移方程
        int greatestSum = Integer.MIN_VALUE;
        int curSum = 0;

        for (int i = 0; i < nLength; i++) {
            curSum = Math.max(curSum + arr[i], arr[i]);
            greatestSum = Math.max(greatestSum, curSum);
        }
        return greatestSum;
    }
}
