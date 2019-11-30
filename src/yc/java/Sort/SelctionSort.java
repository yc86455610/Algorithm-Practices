package yc.java.Sort;

import java.util.Arrays;

/**
 * @program: Algorithm-Practices
 * @description: 选择排序
 * @author: yc
 * @create: 2019-11-30 14:45
 *
 * 算法思想: 长度为 n 的无序数组
 * 第一次遍历 n-1 个数,找到最小的数值与第一个元素交换
 * 第二次遍历 n-2 个数,找到最小的数值与第二个元素交换
 * ...
 * 第 n-1 次遍历，找到最小的数值与第 n-1 个元素交换，排序完成
 *
 * 时间复杂度o(n2)  不稳定排序
 **/


public class SelctionSort {
    public static void main(String[] args) {
        int[] nums = {42, 20, 17, 13, 28, 14, 23, 15};
        selectionSort(nums);
    }

    public static void selectionSort(int[] nums) {
        //一共进行 n-1 次遍历

        long start = System.nanoTime();
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
            System.out.println("第" + (i + 1) + "轮后:" + Arrays.toString(nums));
        }
        long end = System.nanoTime();
        System.out.println((end - start) / 1000);
    }

}
