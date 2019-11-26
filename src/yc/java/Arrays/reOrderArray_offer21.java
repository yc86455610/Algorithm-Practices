package yc.java.Arrays;

import java.security.PrivilegedAction;
import java.util.Arrays;

/**
 * @program: Algorithm-Practices
 * @description: 调整书序顺序似奇数位于偶数前面，同时需要保证相对位置不变
 * @author: yc
 * @create: 2019-11-24 14:52
 * <p>
 * [1, 2, 3, 4, 5] --->  [1, 3, 5, 2, 4]
 **/


public class reOrderArray_offer21 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
//        reOrderArray1(nums);
//        System.out.println(Arrays.toString(nums));

        reOrderArray2(nums);
        System.out.println(Arrays.toString(nums));
    }

    //创建一个新数组，时间复杂度o(n)，空间复杂度o(n)
    public static void reOrderArray1(int[] nums) {
        //统计奇数个数
        int oddCnt = 0;
        for (int num : nums) {
            if (num % 2 == 1)
                oddCnt++;
        }
        int[] copy = nums.clone();
        int i = 0, j = oddCnt;
        for (int num : copy) {
            if (num % 2 == 1)
                nums[i++] = num;
            else
                nums[j++] = num;
        }
    }


    //冒泡思想，每次都当前偶数上浮到最右边。时间复杂度o(n2)，空间复杂度o(1),以时间换空间
    public static void reOrderArray2(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] % 2 == 0 && nums[j + 1] % 2 == 1) {
                    swap(nums, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


