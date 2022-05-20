package 算法入门;
//557. 反转字符串中的单词 III

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/4/24 9:19
 */
public class Demo557 {
    public static void main(String[] args) {
//        System.out.println(reverseString("hello"));
        System.out.println(reverseWords(" Let's take LeetCode contest"));
        System.out.println(reverseWords("God Ding"));
    }

    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] split = s.split("\\s+");
        for (String value : split) {
            res.append(reverseString(value)).append(" ");
        }
        return res.toString().trim();
    }

    public static String reverseString(String str) {
        char[] s = str.toCharArray();
        int l = 0, r = s.length - 1;
        char temp = 0;
        while (l < r) {
            temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
        return Arrays.toString(s)
                .replaceAll(", ", "")
                .replaceAll("\\[", "")
                .replaceAll("]", "");
    }
}
