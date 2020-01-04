package yc.java.stackandqueue;

import java.util.Stack;

/**
 * @program: Algorithm-Practices
 * @description: 用栈实现括号匹配
 * @author: yc
 * @create: 2019-11-30 13:11
 *
 * "()[]{}"
 *
 * Output : true
 *
 * 思路：通过栈来记录最需要匹配的元素，栈顶元素反应了在嵌套的层次关系中，最近的需要匹配的元素
 **/


public class isValid_20 {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                //peek返回栈顶元素，但是不弹出该元素；pop返回栈顶元素，同时将钙元素出栈
                char topChar = stack.pop();
                if (c == '}' && topChar != '{') {
                    return false;
                }
                if (c == ']' && topChar != '[') {
                    return false;
                }
                if (c == ')' && topChar != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
