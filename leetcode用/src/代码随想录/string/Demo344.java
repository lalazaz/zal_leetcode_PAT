package 代码随想录.string;
//344. 反转字符串

/**
 * @author zal
 * @date 2022/5/14 9:09
 */
public class Demo344 {
    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        reverseString(chars);
        System.out.println(chars);
    }

    public static void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
/*            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;*/
            s[l] ^= s[r];
            s[r] ^= s[l];
            s[l] ^= s[r];
            l++;
            r--;
        }
    }
}
