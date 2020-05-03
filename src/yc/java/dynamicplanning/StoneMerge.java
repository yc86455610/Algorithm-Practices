package yc.java.dynamicplanning;

import java.util.Scanner;

/**
 * @author ycFw
 * @ClassName StoneMerge.java
 * @Description 石子合并
 * @createTime 2020年04月18日 14:27:00
 */
public class StoneMerge {


    static int N = 310;
    static int[] s = new int[N];
    static int[][] f = new int[N][N];

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) s[i] = sc.nextInt();
        for (int i = 1; i <= n; i++) s[i] += s[i - 1];

        //从2开始原因： 从1开始 -> 第一次代价都是0
        //这里的len 是能够分成 len 段 长度.
        for (int len = 2; len <= n; len++) {
            //i是左边能枚举的石子
            for (int i = 1; i + len - 1 <= n; i++) {

                // 小区间dp
                int j = i + len - 1;
                f[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    f[i][j] = Math.min(f[i][j], f[i][k] + f[k + 1][j] + s[j] - s[i - 1]);
                }
            }
        }
        System.out.println(f[1][n]);
    }
}
