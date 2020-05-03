package yc.java.greedy;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author ycFw
 * @ClassName RemoveKdigitals.java
 * @Description 移掉k位数字使该数最大，LeetCode402
 * @createTime 2020年04月24日 13:51:00
 */
public class RemoveKdigitals {
    static String num;
    static int k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.next();
        k = sc.nextInt();
        LinkedList<Character> stack = new LinkedList<>();

        //遍历char，删除逆序数字
        for (char digit : num.toCharArray()) {
            while (stack.size() > 0 && k > 0 && stack.peekLast() > digit) {
                stack.removeLast();
                k--;
            }
            stack.addLast(digit);
        }

        //如果k大于0（没删完），删除栈顶（最后）的元素
        while (k-- > 0)
            stack.removeLast();

        //构建输出字符串
        StringBuilder ret = new StringBuilder();
        boolean leadingZero = true;
        for (char digit : stack) {
            if (leadingZero && digit == '0') continue;
            leadingZero = false;
            ret.append(digit);
        }

        if (ret.length() == 0) System.out.println("0");
        System.out.println(ret.toString());
    }
}
