package easy;
//821. 字符的最短距离

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/4/19 9:08
 */
public class Demo821 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
        System.out.println(Arrays.toString(shortestToChar("aaab", 'b')));
        System.out.println(Arrays.toString(shortestToChar("aaab", 'a')));
        System.out.println(Arrays.toString(shortestToChar("aabcfda", 'b')));
        System.out.println(Arrays.toString(shortestToChar("aaaad", 'd')));
        System.out.println(Arrays.toString(shortestToChar("afdasd", 'a')));
        System.out.println(Arrays.toString(shortestToChar("a", 'a')));
        System.out.println(Arrays.toString(shortestToChar("abbbbbbbbbbbbbbbbbbbbbbbbbbbbb", 'a')));
        System.out.println(Arrays.toString(shortestToChar("ffffffffffffffffffffffffffffffffffffa", 'a')));
        System.out.println(Arrays.toString(shortestToChar("ffffffffffffffffdaffffffffffffffffffffa", 'a')));
    }

    public static int[] shortestToChar(String s, char c) {
        int temp = -1;
        int[] res = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int p = s.indexOf(c + "");
            if (p == -1) {
                //只有左边的
                res[i] = Math.abs(i - temp);
            } else if (i <= p) {
                if (temp != -1) {
                    //取两边最近
                    res[i] = Math.min(Math.abs(p - i), Math.abs(temp - i));
                } else res[i] = p - i;
            } else {
                s = s.replaceFirst(c + "", "#");
                temp = p;
                if (p != -1)
                    i--;
            }
        }
        return res;
    }
}
