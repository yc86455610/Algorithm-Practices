package yc.java.DoublePointer;

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

public class judgeSquareSum_633 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(judgeSquareSum((target)));
    }

    public static boolean judgeSquareSum(int target) {
        if (target < 0) return false;
        int i = 0, j = (int) Math.sqrt(target);
        while (i <= j) {
            int temp = i * i + j * j;
            if (temp == target) {
                return true;
            } else if (temp < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
