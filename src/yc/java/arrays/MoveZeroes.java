package yc.java.arrays;

/**
 * @program: interview
 * @description: 把数组中的 0 移到末尾，保持相对顺序不变
 * @author: yc
 * @create: 2019-11-23 18:20
 **/

import java.util.Arrays;
import java.util.Scanner;

/**
 * For example, given nums = [0, 1, 0, 3, 12],
 * after calling your function, nums should be [1, 3, 12, 0, 0].
 */


public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) nums[i] = sc.nextInt();
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {
        //统计非0元素，填充到数组中
        int cnt = 0;
        for (int num : nums) {
            if (num != 0) nums[cnt++] = num;
        }

        //末尾补充0元素
        while (cnt < nums.length) {
            nums[cnt++] = 0;
        }
    }
}
