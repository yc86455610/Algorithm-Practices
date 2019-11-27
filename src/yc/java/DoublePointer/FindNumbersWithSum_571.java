package yc.java.DoublePointer;

/**
 * @program: Algorithm-Practices
 * @description: 和为s的两个数字
 * @author: yc
 * @create: 2019-11-27 21:51
 **/

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 输入一个递增排序的数组和一个数字 S，在数组中查找两个数，使得他们的和正好是 S。
 * 如果有多对数字的和等于 S，输出两个数的乘积最小的。
 *
 * 数学证明：用双指针先找到的两个数字的乘积在有序数组中一定是乘积最小的！
 */

public class FindNumbersWithSum_571 {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6};
        int sum = 8;
        ArrayList<Integer> list = FindNumbersWithSum(array, sum);
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            int cur = array[i] + array[j];
            if (cur == sum)
                return new ArrayList<>(Arrays.asList(array[i], array[j]));
            else if (cur < sum)
                i++;
            else
                j--;
        }
        return new ArrayList<>();
    }
}
