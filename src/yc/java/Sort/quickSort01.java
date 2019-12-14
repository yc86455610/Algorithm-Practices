package yc.java.Sort;

import java.util.Arrays;

/**
 * @program: Algorithm-Practices
 * @description: 快速排序
 * @author: yc
 * @create: 2019-12-09 22:48
 *
 * 排序算法中的王牌排序
 *
 * 时间复杂度o(nlogn)，快排思想---分治法
 *
 * 基本思想：使用分治策略来把一个序列分为两个子序列
 * 1、先从序列中取出一个数作为基准数：在数组中找一个支点(任意)，经过一趟排序后，支点左边的数都比支点小，右边都比支点大
 * 2、分区过程：将比基准数大的数全部放到右边，小于等于基准数全放到左边
 * 3、递归地对左右子序列进行快排，直到各区间只有一个数
 *
 * 过程：
 * 1、先任意找基准数，第一遍快排之后，左边比基准数小，右边比基准数大
 * 2、左边进行快排，任选一个基准数，快排，右边同理
 * 3、递归出口：数组中只有一个元素，递归结束
 **/

// 几种快排的写法，思想都是一样的
public class quickSort01 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 67, 2, 7, 8, 6, 9, 44};

        long start = System.nanoTime();

        quickSort(arr, 0, 9);

        long end = System.nanoTime();

        System.out.println(Arrays.toString(arr));
        System.out.println("快速排序共运行了" + (end - start) / 1000 + "秒");

    }

    // first 指向数组第一个元素  last 指向数组最后一个元素
    public static void quickSort(int[] arr, int first, int last) {
        int i = first;
        int j = last;

        //支点
        int pivot = arr[(first + last) / 2];

        //左右两端进行扫描，只要两端还没有交替，就一直扫描
        while (i <= j) {

            //寻找直到比支点大的数
            while (pivot > arr[i])
                i++;

            //寻找直到比支点小的数
            while (pivot < arr[j])
                j--;

            //此时已经分别找到了比支点小的数(右边)、比支点大的数(左边)，它们进行交换
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        //上面一个while保证了第一趟排序支点的左边比支点小，支点的右边比支点大了。


        //“左边”再做排序，直到左边剩下一个数(递归出口)
        if (first < j)
            quickSort(arr, first, j);

        //“右边”再做排序，直到右边剩下一个数(递归出口)
        if (i < last)
            quickSort(arr, i, last);
    }

}
