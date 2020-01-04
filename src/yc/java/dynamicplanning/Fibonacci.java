package yc.java.dynamicplanning;


/**
 * @program: Algorithm-Practices
 * @description: 斐波那契数列集合
 * @author: yc
 * @create: 2019-11-29 19:22
 *
 * 斐波那契数列系列问题是最典型的dp问题
 **/


public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(new FibonacciExample().climbStairs(3));
    }
}

class FibonacciExample {
    /**
     * 70:爬楼梯问题
     * 题目描述：有 N 阶楼梯，每次可以上一阶或者两阶，求有多少种上楼梯的方法。
     */
    public int climbStairs(int n) {
        if (n <= 2)
            return n;
        // 从3阶楼梯开始，pre2表示上1阶有1种方法，pre1表示上2阶有2种方法
        int pre2 = 1, pre1 = 2;
        for (int i = 2; i < n; i++) {
            int cur = pre1 + pre2;
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }
}
