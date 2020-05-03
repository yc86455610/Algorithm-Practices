package yc.java.offer;

import java.util.Scanner;

/**
 * @author ycFw
 * @ClassName HasPath.java
 * @Description 矩阵中的路径
 * @createTime 2020年04月30日 16:51:00
 */
public class HasPath {
    private final static int[][] next = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    private static int rows;
    private static int cols;
    private static boolean[][] marked;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        cols = sc.nextInt();
        String arrayStr = sc.next();
        char[] array = arrayStr.toCharArray();
        String s = sc.next();
        char[] str = s.toCharArray();
        System.out.println(hasPath(array, rows, cols, str));
    }

    private static boolean hasPath(char[] array, int rows, int cols, char[] str) {
        if (rows == 0 || cols == 0) return false;
        marked = new boolean[rows][cols];
        char[][] matrix = buildMatrix(array);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (backtracking(matrix, str, marked, 0, i, j)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean backtracking(char[][] matrix, char[] str, boolean[][] marked, int pathLen, int r, int c) {
        if (pathLen == str.length) return true;
        if (r < 0 || r >= rows || c < 0 || c >= cols || marked[r][c] || matrix[r][c] != str[pathLen]) {
            return false;
        }
        marked[r][c] = true;
        for (int[] n : next) {
            if (backtracking(matrix, str, marked, pathLen + 1, r + n[0], c + n[1])) {
                return true;
            }
        }
        marked[r][c] = false; //清除使用状态
        return false;
    }

    private static char[][] buildMatrix(char[] array) {
        char[][] matrix = new char[rows][cols];
        int idx = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = array[idx++];
            }
        }
        return matrix;
    }
}
