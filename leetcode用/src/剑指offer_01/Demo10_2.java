package 剑指offer_01;
//剑指 Offer 10- II. 青蛙跳台阶问题

/**
 * @author zal
 * @date 2022/4/21 14:24
 */
public class Demo10_2 {
    public static void main(String[] args) {
        System.out.println(numWays(1));
        System.out.println(numWays(2));
        System.out.println(numWays(3));
        System.out.println(numWays(4));
        System.out.println(numWays(5));
        System.out.println(numWays(100));
    }

    public static int numWays(int n) {
        if (n == 0) return 1;
        int[] ints = new int[2];
        ints[0] = 1;
        ints[1] = 2;
        if (n <= 2) return ints[n - 1];
        int res = 0;
        for (int i = 2; i < n; i++) {
            res = ints[0] + ints[1];
            if (res > 1000000007) res -= 1000000007;
            ints[0] = ints[1];
            ints[1] = res;
        }
        return res;
    }
}
