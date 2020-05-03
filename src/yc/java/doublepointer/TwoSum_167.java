package yc.java.doublepointer;

/**
 * @program: interview
 * @description: 两数之和2-输入有序数组
 * @author: yc
 * @create: 2019-11-23 16:44
 **/

import java.util.Arrays;
import java.util.Scanner;

/**
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class TwoSum_167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) nums[i] = sc.nextInt();
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if (nums == null || nums.length == 0) return null;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int curSum = nums[i] + nums[j];
            if (curSum == target) return new int[]{i + 1, j + 1};
            else if (curSum < target) i++;
            else j--;
        }
        return res;
    }
}
