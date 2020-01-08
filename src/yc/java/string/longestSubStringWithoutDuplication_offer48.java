package yc.java.string;

import java.util.HashMap;

/**
 * @program: Algorithm-Practices
 * @description: 最长不含重复字符的子字符串
 * @author: yc
 * @create: 2019-11-29 18:11
 *
 * 输入一个字符串（只包含 a~z 的字符），求其最长不含重复字符的子字符串的长度。
 * 例如对于 arabcacfr，最长不含重复字符的子字符串为 acfr，长度为 4。
 **/


public class longestSubStringWithoutDuplication_offer48 {
    public static void main(String[] args) {
        String str = "arabcacfr";
        System.out.println(longestSubStringWithoutDuplication(str));
        System.out.println(longestSubStringWithoutDuplication("abcab"));
    }

    public static int longestSubStringWithoutDuplication(String str) {
        //hashmap存储字符和对应索引
        HashMap<Character, Integer> map = new HashMap<>();
        //最长不含重复字符的子串长度
        int max = 0;
        //最近出现重复字符的位置,初始值为-1
        int pre = -1;


        for (int i = 0; i < str.length(); i++) {
            //遍历到的当前的重复字符最后一次出现的位置
            Character ch = str.charAt(i);
            Integer index = map.get(ch);

            //遍历的当前字符为重复字符
            if (index != null)
                pre = Math.max(pre, index);
            max = Math.max(max, i - pre);


            map.put(ch, i);
        }

        return max;
    }
}
