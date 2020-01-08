package yc.java.bitoperation;

/**
 * @program: interview
 * @description: 数组中唯一一个不重复的元素
 * @author: yc
 * @create: 2019-11-23 17:29
 **/

/**
 * Input: [4,1,2,1,2]
 * Output: 4
 */

//异或：相同为0.不同为1
//两个相同的数异或的结果为 0，对所有数进行异或操作，最后的结果就是单独出现的那个数。
public class singleNumber_136 {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int ret = 0;
        for (int num : nums)
            ret = ret ^ num;
        return ret;
    }
}
