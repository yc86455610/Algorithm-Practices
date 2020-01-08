package yc.java.bitoperation;

/**
 * @program: interview
 * @description: 数组元素在 0-n 之间，但是有一个数是缺失的，要求找到这个缺失的数。
 * @author: yc
 * @create: 2019-11-23 17:33
 **/

/**
 * Input: [3,0,1]
 * Output: 2
 */

public class missingNumber_268 {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            ret = ret ^ i ^ nums[i];
        }
        return ret ^ nums.length;
    }
}
