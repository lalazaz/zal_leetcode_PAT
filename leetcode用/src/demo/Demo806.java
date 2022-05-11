package demo;

import java.lang.reflect.Array;
import java.util.Arrays;

//@Date 2022/4/12 9:11
//806. 写字符串需要的行数
public class Demo806 {
    public static void main(String[] args) {
        int[] ints = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String s = "bbbcccdddaaa";
        System.out.println(Arrays.toString(numberOfLines(ints, s)));
    }

    public static int[] numberOfLines(int[] widths, String s) {
        int[] res = new int[2];
        char[] chars = s.toCharArray();
        char[] chars1 = new char[s.length() + 1];
        int t = 0;
        for (; t < chars.length; t++) {
            chars1[t] = chars[t];
        }
        chars1[t] = '{';

        int[] ints = new int[widths.length + 1];
        int k = 0;
        for (; k < widths.length; k++) {
            ints[k] = widths[k];
        }
        //ints[k] = 0;

        int len = 0;
        int hang = 1;
        int i = 0;
        while (i < chars.length) {
            len += ints[chars1[i] - 97];
            if (len + ints[chars1[i + 1] - 97] > 100) {
                len = 0;
                hang++;
            }
            i++;
        }
        res[0] = hang;
        res[1] = len;
        return res;
    }
}
