package yc.java.sort;

import java.util.Arrays;

/**
 * @program: Algorithm-Practices
 * @description: 测试快速排序
 * @author: yc
 * @create: 2019-12-14 15:46
 **/


public class quickSort02 {
    public static void main(String[] args) {
        int[] arr = {72, 6, 57, 88, 60, 42, 83, 73, 48, 85};
        System.out.println(Arrays.toString(arr));

        //进行快排
        quickSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr) {
        int low = 0, high = arr.length - 1;
        quickSort(arr, low, high);
    }

    private static void quickSort(int[] arr, int low, int high) {  //考虑递归结束的条件
        if (low < high) {
            // 分区操作，一个数组分成两个分区
            int index = partition(arr, low, high);

            // 左边分区进行快排
            quickSort(arr, low, index - 1);

            //右边分区进行快排
            quickSort(arr, index + 1, high);
        }
    }

    //分区返回基准值索引
    private static int partition(int[] arr, int low, int high) {
        int i = low, j = high;

        //确定基准数
        int x = arr[low];

        //循环实现分区
        while (i < j) {
            // 右边移动j，找到小于基准值的值，填坑到左边的坑位置；左边移动i，找到大于等于基准值的值，填坑到右边
            while (arr[j] >= x && i < j) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }
            while (arr[i] < x && i < j) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }

        // 使用基准值填坑，返回基准值索引
        arr[i] = x;
        return i;

    }

}
