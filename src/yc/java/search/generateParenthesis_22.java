package yc.java.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: Algorithm-Practices
 * @description: 生成括号
 * @author: yc
 * @create: 2019-11-30 20:52
 *
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 *
 * 例如，给出 n = 3，生成结果为：
 *
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 *
 * 可以采用回溯法：只有在知道序列仍然保持有效时按此添加左括号或者右括号。
 * 可以跟踪到目前为止放置的左括号和右括号的数目来做到这一点
 *
 * 如果还剩一个位置，可以开始放一个左括号。如果他不超过左括号的数量，可以放一个右括号
 **/


public class generateParenthesis_22 {
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }

    public static void backtrack(List<String> res, String cur, int left, int right, int n) {
        if (cur.length() == n * 2) {
            res.add(cur);
            return;
        }
        if (left < n)
            backtrack(res, cur + "(", left + 1, right, n);
        if (right < left)
            backtrack(res, cur + ")", left, right + 1, n);
    }

    public static void main(String[] args) {
        List<String> list = generateParenthesis(3);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
