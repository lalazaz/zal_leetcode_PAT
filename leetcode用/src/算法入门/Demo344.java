package 算法入门;
//344. 反转字符串

/**
 * @author zal
 * @date 2022/4/24 9:15
 */
public class Demo344 {
    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        reverseString(chars);
        System.out.println(chars);
        System.out.println(new char[]{'H','a','n','n','a','h'});
        System.out.println(new char[]{'H'});
        System.out.println(new char[]{'H','h'});
    }

    public static void reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        char temp = 0;
        while (l < r) {
            temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
