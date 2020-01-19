package yc.java.offer;

/**
 * @program: algorithm-practices
 * @description: 跳台阶--offer23
 * @author: yc
 * @create: 2020-01-19 22:17
 **/

public class JumpFloor {
    public int jumpFloor(int n) {
        if (n <= 2) return n;
        int pre2 = 1, pre1 = 2;
        int result = 1;
        for (int i = 3; i <= n; i++) {
            result = pre2 + pre1;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }
}
