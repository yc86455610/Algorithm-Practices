package yc.java.doublepointer;

/**
 * @program: interview
 * @description: 判断一个非负整数是否为两个整数的平方和
 * @author: yc
 * @create: 2019-11-23 16:54
 **/

import java.util.Scanner;

/**
 * Input: 5
 * Output: True
 * Explanation: 1 * 1 + 2 * 2 = 5
 */

public class JudgeSquareSum_633 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(judgeSquareSum(n));
    }

    private static boolean judgeSquareSum(int n) {
        if (n < 0) return false;
        int i = 0, j = (int) Math.sqrt(n);
        while (i <= j) {
            int curSum = i * i + j * j;
            if (curSum == n) return true;
            else if (curSum > n) j--;
            else i++;
        }
        return false;
    }
}