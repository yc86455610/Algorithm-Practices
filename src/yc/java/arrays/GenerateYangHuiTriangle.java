package yc.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: Algorithm-Practices
 * @description: 杨辉三角
 * @author: yc
 * @create: 2019-12-01 17:25
 **/


public class GenerateYangHuiTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> tmp = new ArrayList<>();

        //i 遍历次数，输出行数
        for (int i = 0; i < numRows; i++) {
            tmp.add(0, 1); //每次在0索引位置加一个1
            for (int j = 1; j < tmp.size() - 1; j++) {
                tmp.set(j, tmp.get(j) + tmp.get(j + 1));
            }
            res.add(new ArrayList<>(tmp));
        }

        return res;
    }


    public static void main(String[] args) {
        List<List<Integer>> list = generate(5);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
