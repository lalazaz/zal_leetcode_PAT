package 代码随想录.greedy;
//714. 买卖股票的最佳时机含手续费

/**
 * @author zal
 * @date 2022/5/12 21:44
 */
public class Demo714 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
    }

    //完全不理解，照着代码随想录抄的！
    public static int maxProfit(int[] prices, int fee) {
        int buy = prices[0] + fee;
        int sum = 0;
        for (int p : prices) {
            if (p + fee < buy) {
                buy = p + fee;
            } else if (p > buy) {
                sum += p - buy;
                buy = p;
            }
        }
        return sum;
    }
}
