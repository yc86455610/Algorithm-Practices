package yc.java.sort;

import java.util.Arrays;

/**
 * @program: Algorithm-Practices
 * @description: 冒泡排序测试
 * @author: yc
 * @create: 2019-11-30 14:13
 *
 * 算法思想：两个数比较大小，较大的数下沉，较小的数冒起来，每一轮交换都能保证最大的数有序
 * i表示交换次数，j表示每次交换的比较次数，注意j的上标
 * 平均时间复杂度为o(n2),空间复杂度o(1)
 * 是稳定的排序
 **/


public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {12, 42, 20, 17, 13, 28, 14, 23, 15};
//        bubble1(nums);
        bubble2(nums);
    }

    public static void bubble1(int[] nums) {
        if (nums.length == 0 || nums == null) return;
        long start = System.nanoTime();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j + 1] < nums[j]) {
                    swap(nums, j, j + 1);
                }
            }
            System.out.println("第" + (i + 1) + "轮后:" + Arrays.toString(nums));
        }
        long end = System.nanoTime();

        //计算排序时间，方便比较算法效率
        System.out.println((end - start) / 1000);
    }

    /**
     * 改进：由打印结果可以看出，在第四轮就已经完全排好序了，所以第5轮到第9轮均是无用操作
     */
    public static void bubble2(int[] nums) {
        if (nums == null || nums.length == 0) return;
        long start = System.nanoTime();

        for (int i = 0; i < nums.length; i++) {
            //isSort 默认为true   每一轮遍历时，若为true  表示此轮没有交换  数组已经有序
            boolean isSorted = true;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    isSorted = false;  //本轮有交换
                }
            }
            if (isSorted) break;
            System.out.println("第" + (i + 1) + "轮后:" + Arrays.toString(nums));
        }

        long end = System.nanoTime();
        System.out.println((end - start) / 1000);
    }


    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
