package 剑指offer_01;
//剑指 Offer 10- I. 斐波那契数列

/**
 * @author zal
 * @date 2022/4/21 14:03
 */
public class Demo10 {
    public static void main(String[] args) {
        System.out.println(fib(2));
        System.out.println(fib(5));
        System.out.println(fib(6));
        System.out.println(fib(48));
    }

    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int x = 0, y = 1;
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = x + y;
            //求模比较耗时，使用减法也不会超过这个数字
            if (res >= 1000000007)
                res -= 1000000007;
            x = y;
            y = res;
        }
        return res;
    }
}
