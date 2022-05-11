package easy;
//389. 找不同

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

/**
 * @author zal
 * @date 2022/4/20 19:02
 */
public class Demo389 {
    public static void main(String[] args) {
        System.out.println(findTheDifference("", "y"));
        System.out.println(findTheDifference("a", "aa"));
        System.out.println(findTheDifference("abcd", "abcde"));
    }

    public static char findTheDifference(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();

        int res = 0;
        for (int i = 0; i < Math.max(s.length(), t.length()); i++) {
            if (i < s.length()) res -= chars[i];
            if (i < t.length()) res += chars1[i];
        }
        return (char) res;

/*
        for (int i = 0; i < chars.length; i++) {
            res += chars[i];
        }
        for (int i = 0; i < chars1.length; i++) {
            res -= chars1[i];
        }
        return (char) -res;
*/


    }

/*    public static char findTheDifference(String s, String t) {
        char res = '1';
        char[] chars = t.toString().toCharArray();
        for (int i = 0; i < t.length(); i++) {
            if (s.contains(chars[i] + "")) {
                s = s.replaceFirst(chars[i] + "", "");
            } else {
                res = chars[i];
            }
        }
        return res;
    }*/
}
