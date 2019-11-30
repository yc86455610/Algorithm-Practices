package yc.java.Sort;

/**
 * @program: Algorithm-Practices
 * @description: 约定：待排序的元素需要实现Java的Comparable接口
 * @author: yc
 * @create: 2019-11-30 13:31
 *
 * 待排序的元素需要实现Java的Comparable接口，该接口有compareTo()方法，可以用他来判断两个
 * 元素的大小关系
 *
 * 使用辅助函数less()和swap()来进行比较和交换的操作，使得代码的可读性和可移植性更好
 *
 * 排序算法的成本模型是比较和交换的次数
 **/


public abstract class Sort<T extends Comparable<T>> {
    public abstract void sort(T[] nums);

    protected boolean less(T v, T w) {
        //v 比 w 小
        return v.compareTo(w) < 0;
    }

    protected void swap(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
