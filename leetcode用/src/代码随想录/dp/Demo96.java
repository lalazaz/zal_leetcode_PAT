package 代码随想录.dp;
//96. 不同的二叉搜索树

/**
 * @author zal
 * @date 2022/5/17 9:44
 */
public class Demo96 {
    public static void main(String[] args) {
        System.out.println(numTrees(3));
        System.out.println(numTrees(1));
    }

    public static int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}
