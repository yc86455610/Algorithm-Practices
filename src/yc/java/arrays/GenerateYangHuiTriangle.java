package yc.java.arrays;

import java.util.*;

/**
 * @program: Algorithm-Practices
 * @description: 杨辉三角
 * @author: yc
 * @create: 2019-12-01 17:25
 **/


public class GenerateYangHuiTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        List<List<Integer>> res = generate(numRows);
        System.out.println(Arrays.toString(res.toArray()));
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> cur = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    cur.add(1);
                else
                    cur.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            res.add(cur);
        }
        return res;
    }
}
