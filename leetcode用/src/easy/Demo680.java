package easy;
//680. 验证回文字符串 Ⅱ

/**
 * @author zal
 * @date 2022/5/13 12:20
 */
public class Demo680 {
    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));
        System.out.println(validPalindrome("acbca"));
        System.out.println(validPalindrome("a"));
        System.out.println(validPalindrome("abca"));
    }

    public static boolean validPalindrome(String s) {
        int len = s.length();
        for (int i = 0, j = len - 1; i < len / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;//删掉一个字符的操作? —— 即i,j如何变换
        }
        return true;
    }
}
