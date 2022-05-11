package 剑指offer_01;
//剑指 Offer 17. 打印从1到最大的n位数

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/4/21 17:31
 */
public class Demo17 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNumbers(1)));
        System.out.println(Arrays.toString(printNumbers(2)));
        System.out.println(Arrays.toString(printNumbers(3)));
    }

    public static int[] printNumbers(int n) {
        int[] res = new int[(int) Math.pow(10, n) - 1];
        for (int i = 0; i < (int) Math.pow(10, n) - 1; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
