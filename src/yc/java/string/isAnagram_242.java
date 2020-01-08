package yc.java.string;

/**
 * @program: interview
 * @description: 两个字符串包含的字符是否完全相同
 * @author: yc
 * @create: 2019-11-23 17:39
 * <p>
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 */


import java.util.HashMap;
import java.util.Scanner;

/**
 * 可以用 HashMap 来映射字符与出现次数，然后比较两个字符串出现的字符数量是否相同。
 * <p>
 * 由于本题的字符串只包含 26 个小写字符，因此可以使用长度为 26 的整型数组对字符串出现的字符进行统计，不再使用 HashMap。
 */

public class isAnagram_242 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
//        System.out.println(isAnagram1(s, t));
        System.out.println(isAnagram2(s, t));
    }

    public static boolean isAnagram1(String s, String t) {
        //创建26个字母出现次数的的数组
        int[] cnts = new int[26];
        for (char c : s.toCharArray()) {
            cnts[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            cnts[c - 'a']--;
        }
        for (int cnt : cnts) {
            if (cnt != 0)
                return false;
        }
        return true;
    }

    public static boolean isAnagram2(String s, String t) {
        //HashMap
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c))
                return false;
            if (map.get(c) == 0)
                return false;
            map.put(c, map.get(c) - 1);
        }
        return true;
    }
}
