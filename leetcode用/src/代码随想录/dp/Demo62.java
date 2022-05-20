package 代码随想录.dp;

/**
 * @author zal
 * @date 2022/5/14 22:49
 */
public class Demo62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
        System.out.println(uniquePaths(3, 3));
        System.out.println(uniquePaths(3, 2));
    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++)
            dp[0][i] = 1;
        for (int i = 0; i < m; i++)
            dp[i][0] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                //需要到达最右下角的那个点，而那之前必须经过其上方或者左边的点(因为他也只会这样走)，而这两个点又必须经过其上方或者左方
            }
        }
        return dp[m - 1][n - 1];
    }


    //深搜超时
/*    public static int uniquePaths(int m, int n) {
        return dfs(1, 1, m, n);
    }

    public static int dfs(int i, int j, int m, int n) {
        if (i > m || j > n) return 0;
        if (i == m || j == n) return 1;
        return dfs(i + 1, j, m, n) + dfs(i, j + 1, m, n);
    }*/
}
