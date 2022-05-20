package 代码随想录.dp;
//70. 爬楼梯

/**
 * @author zal
 * @date 2022/5/14 22:11
 */
public class Demo70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(1));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(8));
    }

    /*    public static int climbStairs(int n) {
            if (n <= 2)
                return n;
            return climbStairs(n - 1) + climbStairs(n - 2);
        }*/
    public static int climbStairs(int n) {
        if (n <= 2)
            return n;
        int[] res = new int[n + 1];
        res[1] = 1;
        res[2] = 2;
        for (int i = 3; i <= n; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[n];
    }
}
