package yc.java.arrays;

import java.util.Arrays;

/**
 * @program: Algorithm-Practices
 * @description: 除自身以外数组的乘积
 * @author: yc
 * @create: 2019-12-11 13:20
 *
 * 输入: [1,2,3,4]
 * 输出: [24,12,8,6]
 *
 * 时间复杂度要求o(n)
 *
 * 思路：
 * 1、第一次遍历：从左到右遍历，res每个位置保存它左侧所有元素的乘积。即res[i]=k,k*=nums[i]
 * 2、第二次遍历：从右到左遍历，res[i]∗=k，表示将当前位置的左积乘以右积。
 *                     更新右积k*=nums[i]  k∗=nums[i]
 **/


public class productExceptSelf_238 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int k = 1;

        //第一次遍历是左侧遍历，res每个位置不保存左侧所有元素的乘积
        for (int i = 0; i < res.length; i++) {
            res[i] = k;
            k *= nums[i];  //数组存储的是除去当前元素左边的元素乘积
        }

        //第二次遍历是右侧遍历
        k = 1;
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] *= k;  //k为该数右边的乘积
            k *= nums[i]; //此时数组等于左边的 * 该数右边的
        }

        return res;
    }
}
