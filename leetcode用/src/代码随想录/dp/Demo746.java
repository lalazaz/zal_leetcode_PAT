package 代码随想录.dp;
//746. 使用最小花费爬楼梯
/**
 * @author zal
 * @date 2022/5/14 22:29
 */
public class Demo746 {
    public static void main(String[] args) {

    }
    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] += Math.min(dp[i-1],dp[i-2]) + cost[i];//当前的最优情况取决于前面两步
        }
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
}
