package yc.java.string;

import java.util.HashMap;

/**
 * @program: Algorithm-Practices
 * @description: 无重复字符的最长子串
 * @author: yc
 * @create: 2019-11-29 18:26
 *
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 * 示例：
 * 给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
 * 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
 * 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列 而不是子串
 *
 * 思路：使用hashmap记录字符上次出现的位置，用pre记录最近重复字符出现的位置，
 * 则i(当前位置)-pre就是当前字符最长无重复字符的长度，
 * 取最大的就是字符串的最长无重复字符的长度
 **/


public class lengthOfLongestSubstring_907 {
    public static int lengthOfLongestSubstring(String str) {
        if (str == null || str.length() < 1)
            return 0;

        //记录字符上次出现的位置
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;

        //最近一次字符重复出现的位置
        //i=3  ch='a'  pre=0  表示字符'a'最近一次在0位置出现过
        int pre = -1;

        for (int i = 0, strLen = str.length(); i < strLen; i++) {
            Character ch = str.charAt(i);
            //index是当前字符在hashmap中存在的位置
            Integer index = map.get(ch);
            if (index != null)
                pre = Math.max(pre, index);
            //i-pre 是当前字符最长无重复字符的长度
            max = Math.max(max, i - pre);
            map.put(ch, i);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));  //3
        System.out.println(lengthOfLongestSubstring("pwwkew")); //3
        System.out.println(lengthOfLongestSubstring("arabcacfr")); //4
    }
}
