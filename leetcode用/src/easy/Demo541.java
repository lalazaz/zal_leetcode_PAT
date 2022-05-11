package easy;
//541. 反转字符串 II

/**
 * @author zal
 * @date 2022/4/19 20:38
 */
public class Demo541 {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
        System.out.println(reverseStr("abcd", 2));
        System.out.println(reverseStr("abcd", 1));
        System.out.println(reverseStr("abcdef", 3));
        System.out.println(reverseStr("abcd", 3));
        System.out.println(reverseStr("abc", 3));
        System.out.println(reverseStr("a", 3));
        System.out.println(reverseStr("abcdefg", 1));
        System.out.println(reverseStr("abcdefg", 2));
        System.out.println(reverseStr("abcdefg", 3));
        System.out.println(reverseStr("abcdefg", 43819));
    }

    public static String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        int p = 0;
        for (; i < s.length(); i += k * 2) {
            if (i + k * 2 <= s.length()) {
                p++;
                res.append(new StringBuilder(s.substring(i, (i + k))).reverse())
                        .append(s.substring(i + k, i + k * 2));
            } else break;
        }
        if (s.length() - i > k) {
            res.append(new StringBuilder(s.substring(i, (i + k ))).reverse())
                    .append(s.substring(i + k));
        } else if (s.length() - i > 0 && s.length() - i <= k) {
            res.append(new StringBuilder(s.substring(p*k*2,s.length())).reverse());
        }
        return res.toString();
    }
}
