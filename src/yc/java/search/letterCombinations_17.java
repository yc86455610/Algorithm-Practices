package yc.java.search;

/**
 * @program: Algorithm-Practices
 * @description: 数字键盘组合
 * @author: yc
 * @create: 2019-11-28 19:56
 *
 * 数字2：abc   数字3：def
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 **/

import java.util.*;

/**
 * Backtracking（回溯）属于 DFS。
 * 1、普通 DFS 主要用在 可达性问题 ，这种问题只需要执行到特点的位置然后返回即可。
 * 2、而 Backtracking 主要用于求解 排列组合 问题，
 * 例如有 { 'a','b','c' } 三个字符，求解所有由这三个字符排列得到的字符串，
 * 这种问题在执行到特定的位置返回之后还会继续执行求解过程。
 *
 * 因为 Backtracking 不是立即返回，而要继续求解，因此在程序实现时，需要注意对元素的标记问题：
 * 1、在访问一个新元素进入新的递归调用时，需要将新元素标记为已经访问，这样才能在继续递归调用时不用重复访问该元素；
 * 2、但是在递归返回时，需要将元素标记为未访问，因为只需要保证在一个递归链中不同时访问一个元素，可以访问已经访问过但是不在当前递归链中的元素。
 */


public class letterCombinations_17 {
    public static Map<String, String> phone = new HashMap<>() {
        {
            put("2", "abc");
            put("3", "def");
            put("4", "ghi");
            put("5", "jkl");
            put("6", "mno");
            put("7", "pqrs");
            put("8", "tuv");
            put("9", "wxyz");
        }
    };

    public static List<String> output = new ArrayList<>();

    public static void backtrack(String combination, String next_digits) {
        //如果没有数字要输入
        if (next_digits.length() == 0)
            output.add(combination);
            //如果还有数字要输入
        else {
            String digit = next_digits.substring(0, 1);
            String letters = phone.get(digit);
            for (int i = 0; i < letters.length(); i++) {
                String letter = phone.get(digit).substring(i, i + 1);
                backtrack(combination + letter, next_digits.substring(1));
            }
        }
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            backtrack("", digits);
        return output;
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> output = letterCombinations(digits);
        System.out.println(Arrays.toString(output.toArray()));
    }
}