package yc.java.doublepointer;

/**
 * @program: Algorithm-Practices
 * @description: 删除排序数组中的重复项
 * @author: yc
 * @create: 2019-12-11 16:45
 * <p>
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * <p>
 * 给定数组 nums = [1,1,2],
 * <p>
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * <p>
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * <p>
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 思路：
 * 考虑双指针   慢指针 i 和 快指针 j， 只要 nums[i] = nums[j]，我们就增加 j 以跳过重复项。
 **/


public class removeDuplicates_26 {
    public static void main(String[] args) {
        int[] num1 = {1, 1, 2};
        int[] num2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];   //i移动一个位置，此时指针指向相等
            }
        }
        return i + 1;
    }
}