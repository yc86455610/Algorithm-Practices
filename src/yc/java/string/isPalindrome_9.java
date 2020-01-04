package yc.java.string;

/**
 * @program: interview
 * @description: 判断一个整数是否是回文数
 * @author: yc
 * @create: 2019-11-23 18:06
 **/

/**
 * 要求不能使用额外空间，也就不能将整数转换为字符串进行判断。
 * <p>
 * 将整数分成左右两部分，右边那部分需要转置，然后判断这两部分是否相等。
 */

public class isPalindrome_9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(12322));
    }

    public static boolean isPalindrome(int x) {
        if (x <= 0 || x % 10 == 0)
            return false;
        //temp是整数右半边转置得到的整数
        int temp = 0;
        while (x > temp) {
            temp = temp * 10 + x % 10;
            x /= 10;
        }
        //位数为奇数的情况 ||  位数为偶数的情况
        return x == temp || x == temp / 10;
    }
}
