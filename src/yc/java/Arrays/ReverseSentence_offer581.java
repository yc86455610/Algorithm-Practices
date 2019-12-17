package yc.java.Arrays;

/**
 * Created by Vino on 2019/12/16.
 *
 * 翻转单词顺序列
 *
 * Input:
 * "I am a student."
 *
 * Output:
 * "student. a am I"
 *
 * 要求：不能使用额外的空间。
 * 创建一个字符数组，空间复杂度为o(n)。只能使用字符数组的空间，不能使用递归。
 *
 * 先翻转每个单词。在翻转整个字符串
 */
public class ReverseSentence_offer581 {
    public static void main(String[] args) {
        String str = "I am a student.";
        System.out.println(reverseSentence(str).toString());
    }

    public static String reverseSentence(String str) {
        int n = str.length();
        char[] chars = str.toCharArray();
        int i = 0, j = 0;

        //先翻转每个单词
        while (j <= n) {
            if (j == n || chars[j] == ' ') {
                reverse(chars, i, j - 1);
                i = j + 1;
            }
            j++;
        }

        //翻转整个字符串
        reverse(chars, 0, n - 1);
        return new String(chars);
    }

    private static void reverse(char[] c, int i, int j) {
        while (i < j)
            swap(c, i++, j--);
    }

    private static void swap(char[] c, int i, int j) {
        char t = c[i];
        c[i] = c[j];
        c[j] = t;
    }
}
