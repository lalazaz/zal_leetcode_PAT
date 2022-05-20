package 代码随想录.dp;

import java.sql.PreparedStatement;

/**
 * @author zal
 * @date 2022/5/17 9:30
 */
public class Demo343 {
    public static void main(String[] args) {
        System.out.println(integerBreak(10));
    }

    //贪心写的，至于为什么是3,可以用数学的而某个不等式来证明
    public static int integerBreak(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        if (n == 4) return 4;
        int res = 1;
        while (n > 4) {
            res *= 3;
            n -= 3;
        }
        res *= n;
        return res;
    }
}
