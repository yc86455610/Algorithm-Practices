package yc.java.offer;

/**
 * @program: algorithm-practices
 * @description: 数组中重复的数字--offer02
 * @author: yc
 * @create: 2020-01-09 18:31
 *
 * 长度为n，数字在0到n-1的范围内。数组中某些数字是重复的，但是不知道有几个数字是重复的。
 * 请找出数组中任意一个重复的数字。
 * 例如长度为7的数组{2,3,1,0,2,5,3}，输出是第一个重复的数字2
 *
 * 要求时间o(n)，空间o(1)
 * 不能使用排序，也不能使用额外的标记数组
 *
 * 对于这种数组元素在[0, n-1]范围内的问题，可以将值为i的元素调整到第i个位置上进行求解
 * (比如将0元素调整到第一个位置)
 *
 * {2,3,1,0,2,5,3}遍历到第四个位置时，该位置上的数是2.但是在第2个位置上已经有2的值了，因此重复
 *
 * 每循环一次，将索引对应的值放到等于其值的索引位置上。。。
 *
 **/


public class DuplicateNum {
    //duplication[] 用来存放重复的值
    public static int duplicate(int[] nums, int length, int[] duplication) {
        if (nums == null || length <= 0)
            return -1;
        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                // 遍历到index=4，值为2，而2位置上的值已经为2，存入输出
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return duplication[0];
                }
                swap(nums, i, nums[i]);
            }
        }
        return duplication[0];
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int[] duplication = new int[1];
        System.out.println(duplicate(nums, 7, duplication));
    }
}
