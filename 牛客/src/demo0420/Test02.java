package demo0420;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author zal
 * @date 2022/4/20 23:09
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println(unique_string("hello"));
        System.out.println(unique_string("aaaa"));
        System.out.println(unique_string("hellowelcometoxiaomi"));
    }

    public static String unique_string(String s) {
        // write code here

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) chars[j] = 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 0) sb.append(chars[i]);
        }
        return sb.toString();
    }
}
