package yc.java.offer;

/**
 * @program: algorithm-practices
 * @description: 矩形覆盖
 * @author: yc
 * @create: 2020-01-19 22:24
 **/

public class RectCover {
    public int rectCover(int n) {
        if (n <= 2)
            return n;
        int pre2 = 1, pre1 = 2;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = pre2 + pre1;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }
}
