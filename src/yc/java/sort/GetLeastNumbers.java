package yc.java.sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: Algorithm-Practices
 * @description: 找出数组中最小的k个数：
 *
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * @author: yc
 * @create: 2019-12-14 16:32
 *
 * 思路：
 * 作为面试常考题，主要考察两种方法：快速排序和大小为k的最小堆
 *
 * 快速排序的 partition() 方法，会返回一个整数 j 使得 a[l..j-1] 小于等于 a[j]，
 * 且 a[j+1..h] 大于等于 a[j]，此时 a[j] 就是数组的第 j 大元素。
 * 可以利用这个特性找出数组的第 K 个元素，这种找第 K 个元素的算法称为快速选择算法。
 *
 * 复杂度：O(N) + O(1)
 * 只有当允许修改数组元素时才可以使用
 **/


public class GetLeastNumbers {
    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 6, 2, 7, 3, 8};
        System.out.println(Arrays.toString(nums));
        ArrayList<Integer> ret = getLeastNumbers(nums, 5);
        System.out.println(Arrays.toString(ret.toArray()));
    }

    public static ArrayList<Integer> getLeastNumbers(int[] nums, int k) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (k > nums.length || k <= 0)
            return ret;
        findKthSmallest(nums, k - 1);
        /* findKthSmallest 会改变数组，使得前 k 个数都是最小的 k 个数 */
        for (int i = 0; i < k; i++)
            ret.add(nums[i]);
        return ret;
    }

    public static void findKthSmallest(int[] nums, int k) {
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int j = partition(nums, l, h);
            if (j == k)
                break;
            if (j > k)
                h = j - 1;
            else
                l = j + 1;
        }
    }

    private static int partition(int[] nums, int l, int h) {
        int p = nums[l];     /* 切分元素 */
        int i = l, j = h + 1;
        while (true) {
            while (i != h && nums[++i] < p) ;
            while (j != l && nums[--j] > p) ;
            if (i >= j)
                break;
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
