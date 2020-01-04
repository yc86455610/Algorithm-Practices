package yc.java.binaryresearch;

/**
 * @program: algorithm-practices
 * @description: 旋转数组的最小数字
 * @author: yc
 * @create: 2020-01-04 22:34
 **/

import java.awt.font.NumericShaper;

/**
 * input:非递减数组的一个旋转  {3,4,5,1,2} 是{1,2,3,4,5}的一个旋转
 * output:旋转数组的最小值  1
 */
public class MinNumberInRotatedArray {
    /**
     * 1、从头到尾遍历数组，o(1)找出数组的最小值
     * */

    /**
     * 2、旋转数组本质上是两个排序数组，两有序数组的分割正好是最小值，排序数组用二分法o(logn)实现查找
     */
    public static int minNumberInRotatedArray(int[] array) {
        int length = array.length;
        if (array == null || length <= 0)
            throw new RuntimeException("invaild parameters");

        int low = 0, high = length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (array[low] == array[mid] && array[mid] == array[high])
                return minNumber(array, low, high);
            if (array[mid] <= array[high])   //[mid, high]区间的数组是非递减数组，[low, mid]区间的数组是旋转数组
                high = mid;
            else    //否则 [m + 1, h] 区间内的数组是旋转数组，令 l = m + 1。
                low = mid + 1;
        }
        return array[low];
    }

    /**
     * 3、如果数组元素重复，例如arr = {1,1,1,0,1},low,mid,high指向的都是1，无法知道数字0在哪个区间，切换到顺序查找
     */
    private static int minNumber(int[] array, int low, int high) {
        for (int i = low; i < high; i++) {
            if (array[i] > array[i + 1]) {
                return array[i + 1];
            }
        }
        return array[low];
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(minNumberInRotatedArray(arr));
    }
}
