package 代码随想录.greedy;
//738. 单调递增的数字

/**
 * @author zal
 * @date 2022/5/12 21:20
 */
public class Demo738 {
    public static void main(String[] args) {

    }

    public static int monotoneIncreasingDigits(int n) {
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        int start = s.length();
        for (int i = s.length() - 2; i >= 0; i--) {
            if (chars[i] > chars[i + 1]) {
                chars[i]--;
                start = i + 1;
            }
        }
        for (int i = start; i < s.length(); i++) {
            chars[i] = '9';
        }
        return Integer.parseInt(String.valueOf(chars));
    }
}
