package yc.java.Arrays;

/**
 * @program: interview
 * @description: 把数组中的 0 移到末尾
 * @author: yc
 * @create: 2019-11-23 18:20
 **/

import java.util.Arrays;
import java.util.Scanner;

/**
 * For example, given nums = [0, 1, 0, 3, 12],
 * after calling your function, nums should be [1, 3, 12, 0, 0].
 */


public class moveZeroes_283 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUMS_LENGTH = 10;
        int[] nums = new int[NUMS_LENGTH];
        for (int i = 0; i < NUMS_LENGTH; i++) {
            nums[i] = sc.nextInt();
        }
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        //cnt是数组中非0的个数
        int cnt = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[cnt++] = num;
            }
        }

        //数组中存在0元素
        while (cnt < nums.length) {
            nums[cnt++] = 0;
        }
    }
}
