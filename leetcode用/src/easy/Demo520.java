package easy;
//520. 检测大写字母

import java.util.Locale;

/**
 * @author zal
 * @date 2022/4/20 19:24
 */
public class Demo520 {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("USa"));
        System.out.println(detectCapitalUse("aaa"));
        System.out.println(detectCapitalUse("Leetcode"));
        System.out.println(detectCapitalUse("Flag"));
        System.out.println(detectCapitalUse("FlaG"));
    }

    public static boolean detectCapitalUse(String word) {
        return word.toUpperCase().equals(word) || word.toLowerCase().equals(word)
                ||(word.length()>1&&(word.substring(1).toLowerCase()).equals(word.substring(1)));
    }
}
