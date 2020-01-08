package yc.java.doublepointer;

/**
 * @program: interview
 * @description: 双指针：主要用于遍历数组，两个指针指向不同的元素，从而协同完成任务。
 * @author: yc
 * @create: 2019-11-23 16:44
 **/

import java.util.Arrays;
import java.util.Scanner;

/**
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class twoSum_167 {
    public static void main(String[] args) {
        final int NUMBERS_LENGTH = 4;
        int[] numbers = new int[NUMBERS_LENGTH];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < NUMBERS_LENGTH; i++) {
            numbers[i] = sc.nextInt();
        }
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        if (numbers == null) return null;
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int temp = numbers[i] + numbers[j];
            if (temp == target) {
                return new int[]{i + 1, j + 1};
            } else if (temp < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }
}
