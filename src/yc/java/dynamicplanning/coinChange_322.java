package yc.java.dynamicplanning;

/**
 * Created by Vino on 2019/12/12.
 *
 * 零钱兑换问题:给定不同面额的硬币 coins 和一个总金额 amount。
 * 编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 *
 * 输入: coins = [1, 2, 5], amount = 11
 * 输出: 3
 * 解释: 11 = 5 + 5 + 1
 *
 * 输入: coins = [2], amount = 3
 * 输出: -1
 *
 * 有1,5,10,20,50,100的钞票，需要凑齐666元买水喝
 * 策略：能用100就用100的，否则就用50的，以此类推。在这种策略下，666=100*6+50+10+5+1，一共用了10张钞票
 * 这种策略就叫【贪心策略】。贪心策略只在当前情况下做出最好的选择，根据需要凑出的金额来进行贪心。但是，如果
 * 换一组钞票面值，比如 1,5,11 此时要凑出15元，贪心就会出错：
 *
 * 15=11*1+1*4  一共5张钞票
 *
 * 贪心策略制作当前情况下最好的选择
 *
 * 取11：cost=f(4)+1=4+1=5
 * 取5：cost=f(10)+1=2+1=3  最优....
 * 取1：cost=f(14)+1=4+1=5
 *
 * f(n)=min{f(n-11),f(n-5),f(n-1)}+1
 *
 * 本题提炼出的dp思想：将一个大问题分解成多个小问题，分别求解小问题，大问题的解可以由小问题的解推出（状态转移方程）
 */
public class coinChange_322 {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        System.out.println(coinChange(coins, 11));
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 && dp[i - coins[j]] < Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
