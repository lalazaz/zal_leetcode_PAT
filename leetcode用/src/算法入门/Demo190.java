package 算法入门;
//190. 颠倒二进制位

/**
 * @author zal
 * @date 2022/5/4 8:36
 */
public class Demo190 {
    public static void main(String[] args) {
        System.out.println(reverseBits(3));
    }

    public static int reverseBits(int n) {
        int res = 0;
        for (int i = 1; i < 32 && n != 0; i++) {
            res |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return res;
    }
}
