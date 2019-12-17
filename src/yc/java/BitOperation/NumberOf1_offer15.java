package yc.java.BitOperation;

/**
 * @program: Algorithm-Practices
 * @description: 二进制中 1 的个数
 * @author: yc
 * @create: 2019-11-23 20:00
 **/

import java.awt.font.NumericShaper;

/**
 * 输入一个整数，输出该数二进制表示中 1 的个数。
 *
 * n&(n-1)
 * 该位运算去除 n 的位级表示中最低的那一位。
 *
 * n       : 10110100
 * n-1     : 10110011
 * n&(n-1) : 10110000
 * 时间复杂度：O(M)，其中 M 表示 1 的个数。
 */

public class NumberOf1_offer15 {
    public static void main(String[] args) {
        System.out.println(NumberOf1(8));
    }

    public static int NumberOf1(int n) {
        int cnt = 0;
        while (n != 0) {
            //每按位与一次消除一个1
            cnt++;
            n &= (n - 1);
        }
        return cnt;
    }
}
