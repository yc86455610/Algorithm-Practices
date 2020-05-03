package yc.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: algorithm-practices
 * @description: offer：顺时针打印矩阵
 * @author: yc
 * @create: 2020-01-08 19:25
 *
 * 矩阵顺时针打印结果为：1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10
 **/


public class PrintMatrix {
    public static int[] printMatrix(int[][] matrix) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return null;

        int row1 = 0, row2 = matrix.length - 1;
        int col1 = 0, col2 = matrix[0].length - 1;

        while (row1 <= row2 && col1 <= col2) {
            for (int i = col1; i <= col2; i++)
                ret.add(matrix[row1][i]);
            for (int i = row1 + 1; i <= row2; i++)
                ret.add(matrix[i][col2]);
            if (row1 != row2) {
                for (int i = col2 - 1; i >= col1; i--) {
                    ret.add(matrix[row2][i]);
                }
            }
            if (col1 != col2) {
                for (int i = row2 - 1; i > row1; i--) {
                    ret.add(matrix[i][col1]);
                }
            }
            row1++;row2--;col1++;col2--;
        }

        int[] array = new int[ret.size()];
        for (int i = 0; i < ret.size(); i++)
            array[i] = ret.get(i);
        return array;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(Arrays.toString(printMatrix(matrix)));
    }
}
