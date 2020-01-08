package yc.java.string;

/**
 * @program: Algorithm-Practices
 * @description: 替换空格
 * @author: yc
 * @create: 2019-11-30 19:17
 *
 * 将一个字符串中的空格替换成 "%20"。
 *
 * Input:
 * "A B"
 *
 * Output:
 * "A%20B"
 *
 * 思路：双指针，首先统计空格后，将字符串变长，再进行双指针操作
 **/


public class replaceSpace_offer5 {
    public String replaceSpace(StringBuffer str) {
        int p1 = str.length() - 1;
        for (int i = 0; i <= p1; i++) {
            if (str.charAt(i) == ' ')
                str.append("  ");  //每次遍历到一个空格，就在字符串的尾部加2个空格
        }

        //增长后的字符串的长度
        int p2 = str.length() - 1;
        while (p1 >= 0 && p2 > p1) {
            char c = str.charAt(p1--);
            if (c == ' ') {
                str.setCharAt(p2--, '0');
                str.setCharAt(p2--, '2');
                str.setCharAt(p2--, '%');
            } else
                str.setCharAt(p2--, c);
        }
        return str.toString();
    }
}
