package 数据结构入门;

/**
 * @author zal
 * @date 2022/5/6 11:30
 */
public class Demo121 {
    public static void main(String[] args) {

    }

    //暴力加贪心
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            res = Math.max(prices[i] - min, res);
        }
        return res;
    }
}
