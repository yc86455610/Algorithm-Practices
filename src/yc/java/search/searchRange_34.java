package yc.java.search;

/**
 * @program: Algorithm-Practices
 * @description: logn时间复杂度求在排序数组中的第一个和最后一个元素
 * @author: yc
 * @create: 2019-12-10 23:20
 *
 * 1、排序数组
 * 2、logn时间复杂度
 * 想到二分查找
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: [-1,-1]
 *
 * 如果数组中不存在目标值，返回 [-1, -1]。
 *
 * 二分玄学查找。。。。
 **/


public class searchRange_34 {
    public static void main(String[] args) {
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int[] nums2 = {5, 7, 7, 8, 8, 10};
    }

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return res;
    }
}