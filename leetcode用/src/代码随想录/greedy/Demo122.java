package 代码随想录.greedy;
//122. 买卖股票的最佳时机 II

/**
 * @author zal
 * @date 2022/5/9 21:54
 */
public class Demo122 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 5}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 2, 1 }));
    }

    public static int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                res += (prices[i] - prices[i - 1]);
        }
        return res;
    }
}
