package yc.java.greedy;

/**
 * @program: Algorithm-Practices
 * @description: 求股票的最大利润
 * @author: yc
 * @create: 2019-11-24 18:35
 **/

//可以有一次买入和一次卖出，买入必须在前，求最大收益
//{7, 1(buy) , 5, 3, 6(sell), 4}

public class maxProfit {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        int soFarMin = prices[0];
        int maxProfit = 0;
        //策略：假设第i轮进行卖出操作，买入操作价格应该在i之前并且价格最低
        for (int i = 0; i < prices.length; i++) {
            soFarMin = Math.min(soFarMin, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - soFarMin);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
