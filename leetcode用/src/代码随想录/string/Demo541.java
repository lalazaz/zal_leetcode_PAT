package 代码随想录.string;
//541. 反转字符串 II

/**
 * @author zal
 * @date 2022/5/14 9:14
 */
public class Demo541 {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }

    public static String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2 * k) {
            int start = i;
            int end = Math.min(start + k - 1, s.length() - 1);
            while (start < end) {
                ch[start] ^= ch[end];
                ch[end] ^= ch[start];
                ch[start] ^= ch[end];
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }
}
