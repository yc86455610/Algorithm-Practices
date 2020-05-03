package yc.java.offer;

/**
 * @program: Algorithm-Practices
 * @description: 求按从小到大的顺序的第 N 个丑数--offer48
 * @author: yc
 * @create: 2019-11-23 19:21
 **/

/**
 * 把只包含因子 2、3 和 5 的数称作丑数（Ugly Number）。
 * 例如 6、8 都是丑数，但 14 不是，因为它包含因子 7。习惯上我们把 1 当做是第一个丑数。求按从小到大的顺序的第 N 个丑数。
 *
 * 1.循环判断每个数是否为丑数
 * 每个整数都需要判断，即使不是丑数，也要进行余数和出发运算，低效
 *
 * 2.dp实现
 */
public class GetUglyNumber {
    public static void main(String[] args) {
        System.out.println(getUglyNumberDp(50));
//        System.out.println(getUglyNumber(50));
    }

    //循环判断每一个数是否为丑数
    public static int getUglyNumber(int n) {
        if (n <= 0)
            return 0;
        int number = 0;   // 遍历每一个数
        int uglyNumberFound = 0;  //找到的丑数数量

        while (uglyNumberFound < n) {
            number++;
            if (isUglyNumber(number))
                uglyNumberFound++;
        }
        return number;
    }

    //判断一个数是否为丑数
    private static boolean isUglyNumber(int number) {
        while (number % 2 == 0)
            number /= 2;
        while (number % 3 == 0)
            number /= 3;
        while (number % 5 == 0)
            number /= 5;
        return number == 1 ? true : false;
    }

    /**
     * dp：以空间换时间，创建一个能容纳1500个丑数的数组
     * 全是丑数的dp数组，关键在于怎么确保数组里的丑数是排好序的
     */
    public static int getUglyNumberDp(int n) {
        if (n <= 6)
            return n;
        //i2，i3，i5分别是2，3，5因子出现的次数
        int i2 = 0, i3 = 0, i5 = 0;
        int[] dp = new int[n];

        //第一个丑数是1
        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            int next2 = dp[i2] * 2, next3 = dp[i3] * 3, next5 = dp[i5] * 5;
            dp[i] = Math.min(Math.min(next2, next3), next5);
            if (dp[i] == next2)
                i2++;
            if (dp[i] == next3)
                i3++;
            if (dp[i] == next5)
                i5++;
        }
        return dp[n - 1];
    }
}
