package yc.java.arrays;

/**
 * @program: Algorithm-Practices
 * @description: 打印从1到最最大的n位数
 * @author: yc
 * @create: 2019-11-28 18:29
 **/

/**
 * n = 3 输出 999
 * 由于n可能会非常大，因此不能直接用int表示数字，而是用char数组进行存储
 * 使用回溯法得到所有的数
 */

public class print1ToMaxOfNDigits_offer17 {
    public static void main(String[] args) {
//        print1ToMaxOfNDigitsNormal(3);
//        print1ToMaxOfNDigitsWithString(3);
        print1ToMaxOfNDigitsWithRecursion(3);
    }

    //直接处理，会出现大数问题
    public static void print1ToMaxOfNDigitsNormal(int n) {
        int number = 1;
        int i = 0;
        while (i++ < n) {
            number *= 10;
        }
        for (i = 1; i < number; i++) {
            System.out.print(i + "\t");
        }
    }

    //通过 string 来模拟大数，实现加法操作
    public static void print1ToMaxOfNDigitsWithString(int n) {
        if (n <= 0)
            throw new RuntimeException("n最小值是1");
        // 字符串中最后一个是结束符号'\0', number[0]作为最大数字的进位标志位
        char[] number = new char[n + 1];
        for (int i = 0; i < n + 1; i++) {
            number[i] = '0';
        }

        //没到最大值，就不断循环打印
        while (!increment(number)) {
            printNumber(number);
        }
    }

    //increment执行+1的操作
    //o(1)时间判断是否已经到达了最大的n位数
    private static boolean increment(char[] number) {
        boolean flag = false;  //判断是否进位
        int nTakeOver = 0;   //进位值  0 或者 1
        int nLength = number.length;

        //个位开始判断
        for (int i = nLength - 1; i > 0; i--) {
            int nSum = number[i] - '0' + nTakeOver;
            if (i == nLength - 1) //个位
                nSum++;

            if (nSum >= 10) {
                if (i == 1) {   // 遍历到最高位
                    flag = true;
                } else {
                    nSum -= 10;
                    nTakeOver = 1;
                    number[i] = (char) ('0' + nSum);
                }
            } else {
                number[i] = (char) ('0' + nSum);
                break;
            }
        }
        return flag;
    }

    private static void printNumber(char[] number) {
        boolean isBeginning0 = true;
        int nLength = number.length;

        for (int i = 0; i < nLength - 1; i++) {
            if (isBeginning0 && number[i] != '0')
                isBeginning0 = false;

            if (!isBeginning0)
                System.out.print(number[i]);
        }
        System.out.println();
    }

    // n位所有十进制数是n个从0到9的全排列
    // 把数字的每一位都从0到9排列一遍，得到所有的十进制数，不打印排在前面的0
    public static void print1ToMaxOfNDigitsWithRecursion(int n) {
        if (n <= 0) return;
        char[] number = new char[n + 1];
        number[n] = '0';  //个位为0

        for (int i = 0; i < 10; i++) {
            number[0] = (char) (i + '0');
            print1ToMaxOfNDigitsRecursion(number, n, 0);
        }
    }

    private static void print1ToMaxOfNDigitsRecursion(char[] number, int length, int index) {
        if (index == length - 1) {
            printNumber(number);
            return;
        }
        for (int i = 0; i < 10; i++) {
            number[index + 1] = (char) (i + '0');
            print1ToMaxOfNDigitsRecursion(number, length, index + 1);
        }
    }
}
