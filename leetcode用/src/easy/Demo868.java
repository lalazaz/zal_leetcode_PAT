package easy;
//868. 二进制间距

/**
 * @author zal
 * @date 2022/4/24 9:03
 */
public class Demo868 {
    public static void main(String[] args) {
        System.out.println(binaryGap(22));
        System.out.println(binaryGap(8));
        System.out.println(binaryGap(5));
        System.out.println(binaryGap(15));
        System.out.println(binaryGap(2));
        System.out.println(binaryGap(3));
        System.out.println(binaryGap(7));
        System.out.println(binaryGap(17));
    }

    public static int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int l = 0, r = 1;
        int max = 0;
        for (; r < s.length(); r++) {
            int gap = 0;
            if (s.charAt(r) == '1') {
                gap = r - l;
                r = l + 1;
                l = r;
            }
            max = Math.max(gap, max);
        }
        return max;
    }
}
