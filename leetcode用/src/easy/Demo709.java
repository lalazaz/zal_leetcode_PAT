package easy;
//709. 转换成小写字母

import java.util.Locale;

/**
 * @author zal
 * @date 2022/5/12 12:12
 */
public class Demo709 {
    public static void main(String[] args) {
/*        System.out.println((int) 'a');
        System.out.println((int) 'A');
        System.out.println((int) 'Z');*/
        System.out.println(toLowerCase("HelLO"));
    }

    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

/*    public static String toLowerCase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 90 && s.charAt(i) >= 65) {
                s = s.substring(0, i) + (char) (s.charAt(i) + 32) + s.substring(i + 1);
            }
        }
        return s;
    }*/
}
