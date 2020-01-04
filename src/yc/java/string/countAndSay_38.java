package yc.java.string;

/**
 * @program: Algorithm-Practices
 * @description: 报数问题
 * @author: yc
 * @create: 2019-12-10 23:00
 * <p>
 * 1   1
 * 2   11
 * 3   21
 * 4   1211
 * 5   111221
 * 6   312211
 * 7   13112221
 * 8   1113213211
 * <p>
 * 思路：对前一个数进行描述 几(cnt)个几(pre)
 **/


public class countAndSay_38 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println("n=" + i + "的报数为：" + countAndSay(i));
        }
    }

    public static String countAndSay(int n) {
        String ans = "1";

        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            char pre = ans.charAt(0);
            int cnt = 1;   //pre出现次数

            //从第二位开始遍历，比较和pre的值
            for (int j = 1; j < ans.length(); j++) {
                char c = ans.charAt(j);
                if (c == pre) {
                    cnt++;
                } else {
                    sb.append(cnt).append(pre);
                    pre = c;
                    cnt = 1;  //cnt重新开始计数
                }
            }

            //遍历完一个整数的报数情况
            sb.append(cnt).append(pre);
            ans = sb.toString();
        }
        return ans;
    }
}