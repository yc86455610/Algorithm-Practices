package yc.java.greedy;

/**
 * @program: Algorithm-Practices
 * @description: 分配饼干
 * @author: yc
 * @create: 2019-11-23 19:38
 **/

import java.util.Arrays;

/**
 * 贪心思想：保证每次操作都是局部最优的，并且最后得到的结果是全局最优的。
 * <p>
 * 每个孩子都有一个满足度 grid，每个饼干都有一个大小 size，只有饼干的大小大于等于一个孩子的满足度，
 * 该孩子才会获得满足。求解最多可以获得满足的孩子数量。
 * <p>
 * Input: grid[1,3], size[1,2,4]
 * Output: 2
 */
public class findContentChildren {
    public static void main(String[] args) {
        int[] grid = {1, 3}, size = {1, 2, 4};
        System.out.println(findContentChildren(grid, size));
    }

    public static int findContentChildren(int[] grid, int[] size) {
        if (grid == null || size == null) return 0;
        Arrays.sort(grid);
        Arrays.sort(size);
        int gi = 0, si = 0;
        while (gi < grid.length && si < size.length) {
            if (grid[gi] <= size[si]) {
                gi++;
            }
            si++;
        }
        return gi;
    }
}
