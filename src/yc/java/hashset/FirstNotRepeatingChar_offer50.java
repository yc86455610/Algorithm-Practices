package yc.java.hashset;

/**
 * @program: Algorithm-Practices
 * @description: 第一次只出现一次的字符位置
 * @author: yc
 * @create: 2019-11-27 22:19
 **/

/**
 * 在一个字符串中找到第一个只出现一次的字符，并返回他的位置
 *
 * Input: abacc
 * Output: 1
 */

public class FirstNotRepeatingChar_offer50 {
    //使用hashmap对出现次数进行统计，但是考虑到要统计的字符范围有限，因此用整形数组代替hashmap，
    //从而将空间复杂度由o(n)降为o(1)
    public static int FirstNotRepeatingChar(String str) {
        int[] cnts = new int[256];
        for (int i = 0; i < str.length(); i++) {
            cnts[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (cnts[str.charAt(i)] == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("abacc"));
    }
}
