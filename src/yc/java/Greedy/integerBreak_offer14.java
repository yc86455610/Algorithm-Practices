package yc.java.Greedy;

/**
 * @program: Algorithm-Practices
 * @description: 剪绳子:把一根绳子剪成多段，并且使得每段的长度乘积最大。
 * @author: yc
 * @create: 2019-11-24 14:27
 * <p>
 * n = 2
 * return 1 (2 = 1 + 1)
 * <p>
 * n = 10
 * return 36 (10 = 3 + 3 + 4)
 **/


public class integerBreak_offer14 {
    /**
     * 贪心：尽可能的剪出长度为3的绳子，并且不允许有长度为1的绳子出现。
     * 如果出现了，就从已经切好的绳子中拿出一段与长度为1的绳子重新组合，把他们切成
     * 两段长度为2的绳子
     */
    public static int integerBreak1(int n) {
        if (n < 2) return 0;
        if (n == 2) return 1;
        if (n == 3) return 2;
        int timesOf3 = n / 3;
        if (n - timesOf3 * 3 == 1)
            timesOf3--;
        int timesOf2 = (n - timesOf3 * 3) / 2;  //考虑10 =3*3+1，timesOf3变为2，拿出一个3和1分为两个2
        return (int) (Math.pow(3, timesOf3)) * (int) (Math.pow(2, timesOf2));
    }

    //dp
    public static int integerBreak2(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                //比较i-j下标差分别和j dp[j]的大小
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), dp[j] * (i - j)));
            }
        }
        return dp[n];
    }


    public static void main(String[] args) {
        System.out.println(integerBreak1(20));
        System.out.println(integerBreak2(20));
    }

}
