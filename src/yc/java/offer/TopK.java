package yc.java.offer;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author ycFw
 * @ClassName TopK.java
 * @Description 输出数组中最小的k个数
 * @createTime 2020年05月02日 17:08:00
 */
public class TopK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        int[] res = getLeastNumbers1(nums, k);
        System.out.println(Arrays.toString(res));
    }

    /**
     * 构造大顶堆
     * 时间复杂度O(nlogk)    空间复杂度O(k)
     */
    private static int[] getLeastNumbers1(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0)
            return new int[0];
        //java默认小顶堆，改造使其变为大顶堆
        Queue<Integer> heap = new PriorityQueue<>(k, (i1, i2) -> Integer.compare(i2, i1));
        for (int num : nums) {
            //入堆
            if (heap.isEmpty() || heap.size() < k || num < heap.peek()) {
                heap.offer(num);
            }
            //出堆
            if (heap.size() > k) {
                heap.poll();
            }
        }

        //堆中元素存入res数组
        int[] res = new int[heap.size()];
        int j = 0;
        for (int num : heap) {
            res[j++] = num;
        }
        return res;
    }
}
