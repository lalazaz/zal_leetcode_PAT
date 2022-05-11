package 剑指offer_01;
//剑指 Offer 16. 数值的整数次方

/**
 * @author zal
 * @date 2022/4/21 17:15
 */
public class Demo16 {
    public static void main(String[] args) {
        System.out.println(myPow(2, 10));
        System.out.println(myPow(2.1, 3));
        System.out.println(myPow(2, -2));
    }

    /**
     * @  b扣💊
     * @param x
     * @param n
     * @return
     */
    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n == -1) return 1 / x;
        double half = myPow(x, n / 2);
        double mod = myPow(x, n % 2);
        return half * half * mod;
    }

    /**
     * 暴力超时
     */
/*    public static double myPow(double x, int n) {
        if (n == 0) return 0;
        if (n == 1) return x;
        double res = 1.0;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                res *= x;
            }
        } else {
            for (int i = 0; i < n; i++) {
                res /= x;
            }
        }
        return res;
    }*/
}
