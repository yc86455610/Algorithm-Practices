package yc.java.arrays;

/**
 * @author ycFw
 * @ClassName HandleSqrt.java
 * @Description 头条面试题：数组中平方值不同的取值数
 * @createTime 2020年04月26日 13:24:00
 */


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 给你一个有序整数数组，数组中的数可以是正数、负数、零，请实现一个函数，
 * 这个函数返回一个整数：返回这个数组所有数的平方值中有多少种不同的取值。
 */
public class HandleSqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) nums[i] = sc.nextInt();
        System.out.println(handle2(nums));
    }

    //时间和空间复杂度都为O(n)
    private static int handle1(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(Math.abs(num)); //转化为绝对值
        }
        return set.size();
    }

    //O(1)空间复杂度
    private static int handle2(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int i = 0, j = nums.length - 1;
        int cnt = 0;
        while (i < j) {
            //去重
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) i++;
            if (j > 1 && nums[j] == nums[j - 1]) j--;
            int sum = nums[i] + nums[j];
            if (sum == 0) {
                j--;
                i++;
                cnt++;
            } else if (sum > 0) {
                j--;
                cnt++;
            } else {
                i++;
                cnt++;
            }
        }
        if (j == i) cnt++;
        return cnt;
    }
}
