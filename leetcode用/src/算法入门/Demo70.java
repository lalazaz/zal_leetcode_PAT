package 算法入门;
//70. 爬楼梯

/**
 * @author zal
 * @date 2022/5/2 9:04
 */
public class Demo70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(1));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(4));
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        int[] ints = new int[n + 1];
        ints[0] = 1;
        ints[1] = 2;
        for (int i = 2; i <= n; i++) {
            ints[i] = ints[i - 1] + ints[i - 2];
        }
        return ints[n -1];
    }
}
