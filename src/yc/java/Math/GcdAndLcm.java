package yc.java.Math;

/**
 * @program: Algorithm-Practices
 * @description: 最大公约数和最小公倍数
 * @author: yc
 * @create: 2019-11-23 19:46
 **/


public class GcdAndLcm {
    public static void main(String[] args) {
        System.out.println(gcd(4, 6));
        System.out.println(lcm(4, 6));
    }

    //最大公约数
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    //最小公倍数
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
