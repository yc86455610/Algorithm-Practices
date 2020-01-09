package yc.java.offer;

/**
 * @program: algorithm-practices
 * @description: 斐波那契数列--offer22
 * @author: yc
 * @create: 2020-01-09 19:39
 **/


public class Fibonacci {
    private static int[] fib = new int[40];

    public static int fibonacci(int n) {
        fib[1] = 1;
        fib[2] = 2;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(0));
    }
}
