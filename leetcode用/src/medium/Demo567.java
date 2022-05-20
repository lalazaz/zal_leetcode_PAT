package medium;
//567. 字符串的排列

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/4/26 22:12
 */
public class Demo567 {
    public static void main(String[] args) {
        System.out.println(checkInclusion("bd", "adba"));
        System.out.println(checkInclusion("ab", "eidbaooo"));
        System.out.println(checkInclusion("ab", "eidboaoo"));
        System.out.println(checkInclusion("adc", "dcda"));
        System.out.println(checkInclusion("a", "a"));
    }


    // @ Dale
    public static boolean checkInclusion(String s1, String s2) {
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            if (hash_Code(s2.substring(i, i + s1.length())) == hash_Code(s1)) return true;
        }
        return false;
    }

    public static long hash_Code(String s) {
        char[] chars = s.toCharArray();
        long sum = 0;
        for (char aChar : chars) {
            sum += (long) ((int) aChar) * ((int) aChar);
        }
        return sum;
    }


    //超时
/*    public static boolean checkInclusion(String s1, String s2) {
        String s = s1;
        for (int i = 0, j = 0; i < s2.length(); i++) {
            if (s1.equals("")) return true;
            if (s1.contains(s2.charAt(i) + "")) {
                s1 = s1.replaceFirst(s2.charAt(i) + "", "");
                j++;
            } else {
                s1 = s;
                //往回退   超时   囧😳
                i-=j;
                j = 0;
            }
        }
        if (s1.equals("")) return true;
        else return false;
    }*/
}
