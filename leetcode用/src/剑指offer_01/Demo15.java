package 剑指offer_01;
//剑指 Offer 15. 二进制中1的个数
/**
 * @author zal
 * @date 2022/4/21 17:00
 */
public class Demo15 {
    public static void main(String[] args) {
/*        System.out.println(Integer.bitCount(10));
        System.out.println(Integer.toBinaryString(4));
        System.out.println(Integer.parseInt("100", 2));*/

        System.out.println(hammingWeight(11));
        System.out.println(hammingWeight(128));
        System.out.println(hammingWeight(1000000));
    }
    public static int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        return s.length() - s.replaceAll("1","").length();
    }
}
