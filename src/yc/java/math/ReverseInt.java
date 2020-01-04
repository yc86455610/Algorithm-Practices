package yc.java.math;

/**
 * Created by Vino on 2019/12/12.
 * <p>
 * 整数翻转：
 * <p>
 * 输入: 123
 * 输出: 321
 * <p>
 * <p>
 * 输入: -123
 * 输出: -321
 * <p>
 * <p>
 * 输入: 120
 * 输出: 21
 * <p>
 * 则其数值范围为 [−231,  231 − 1]
 * <p>
 * 首先划定边界，明确什么时候输出0，其次对数据反转，最后判断是否溢出并输出结果
 */
public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
    }

    public static int reverse(int x) {

        long ans = 0;

        while (x != 0) {
            ans = ans * 10 + x % 10;
            x = x / 10;
        }

        //判断ans是否超过了边界
        return ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE ? 0 : (int) ans;

    }

}