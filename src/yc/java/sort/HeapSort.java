package yc.java.sort;

import java.util.Arrays;

/**
 * @program: Algorithm-Practices
 * @description: 堆排序
 * @author: yc
 * @create: 2019-11-30 14:58
 *
 * 算法思想：堆
 * 堆中某个节点的值总是大于等于其子节点的值，并且堆是一颗完全二叉树
 * 堆可以用数组来标识，因为堆是完全二叉树，而完全二叉树很容易就存储在数组中。
 * 位置k的节点的父节点的位置为k/2，而他的两个子节点的位置分别为2k和2k+1.
 * 这里不适用数组索引为0的位置，是为了更清晰的描述节点的位置关系
 *
 * 步骤：
 * 1、构建大顶堆，升序排序要维护小顶堆，从最后一个非叶子节点开始调整
 * 2、每次把堆尾元素与堆顶元素互换，保证堆尾元素最大
 *
 * int[] nums = {42, 20, 17, 13, 28, 14, 23, 15};
 **/


public class HeapSort {
    public static void main(String[] args) {
        int[] nums = {4, 9, 6, 5, 7, 3, 8};
        long start = System.nanoTime();
        heapSort(nums);
        long end = System.nanoTime();
        System.out.println(Arrays.toString(nums));
        System.out.println((end - start) / 1000);
    }

    public static void heapSort(int[] nums) {
        //构建初始堆，从第一个非叶子节点开始调整，左右孩子节点中较大的交换到父节点中
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            heapJust(nums, nums.length, i);
        }

        //排序，将最大的节点放在堆尾，然后从根节点重新调整
        for (int i = nums.length - 1; i >= 1; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            heapJust(nums, i, 0);
        }
    }

    private static void heapJust(int[] nums, int len, int i) {
        int k = i, temp = nums[i], index = 2 * k + 1;
        while (index < len) {
            if (index + 1 < len) {
                if (nums[index] < nums[index + 1])
                    index = index + 1;
            }
            if (nums[index] > temp) {
                nums[k] = nums[index];
                k = index;
                index = 2 * k + 1;
            } else {
                break;
            }
            nums[k] = temp;
        }
    }
}
