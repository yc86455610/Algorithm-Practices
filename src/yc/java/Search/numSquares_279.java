package yc.java.Search;

/**
 * @program: Algorithm-Practices
 * @description: 组成整数的最小平方数数量
 * @author: yc
 * @create: 2019-11-26 18:40
 **/

import java.util.*;

/**
 * For example, given n = 12, return 3 because 12 = 4 + 4 + 4;
 * given n = 13, return 2 because 13 = 4 + 9.
 *
 * 思路：可以把每个整数看成图中的一个节点，如果两个整数之差为一个平方数，那么这两个整数所在的节点就有一条边
 * 要求解最小的平方数数量，就是求解从节点n到节点0的最短路径
 * 同样可以采取dp求解
 */

public class numSquares_279 {
    public static void main(String[] args) {

//        System.out.println(Arrays.toString(generateSquares(13).toArray()));

        System.out.println(numSquares(5));
    }

    public static int numSquares(int n) {
        List<Integer> squares = generateSquares(n);   //生成小于n的平方数序列
        Queue<Integer> queue = new LinkedList<>();
        boolean[] marked = new boolean[n + 1];
        queue.add(n);
        marked[n] = true;  //标记已遍历
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            level++;
            while (size-- > 0) {
                int cur = queue.poll();
                for (int s : squares) {
                    int next = cur - s;
                    if (next < 0)
                        break;
                    if (next == 0) //遍历到了0节点，结束
                        return level;
                    if (marked[next])  //元素已查询，继续循环
                        continue;
                    marked[next] = true;
                    queue.add(next);
                }
            }
        }
        return n;
    }

    /**
     * 生成小于n的平方数序列
     *
     * @return 1, 4, 9, ...
     */
    static List<Integer> generateSquares(int n) {
        List<Integer> squares = new ArrayList<>();
        int square = 1;
        int diff = 3;
        while (square <= n) {
            squares.add(square);  //1，4，9，16  每次的差值是3，5，7，9成等差数列
            square += diff;
            diff += 2;
        }
        return squares;
    }
}
