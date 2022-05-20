package easy;
//942. 增减字符串匹配

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/5/9 8:17
 */
public class Demo942 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(diStringMatch("IDID")));
        System.out.println(Arrays.toString(diStringMatch("III")));
        System.out.println(Arrays.toString(diStringMatch("DDI")));
        System.out.println(Arrays.toString(diStringMatch("DDD")));
    }

    public static int[] diStringMatch(String s) {
        int l = 0, r = s.length();
        int[] res = new int[r + 1];
        int p = 0, sum = 0;
        while (l < r) {
            if (s.charAt(p) == 'I') {
                res[p++] = l;
                sum += l;
                l++;
            } else {
                res[p++] = r;
                sum += r;
                r--;
            }
        }
        res[s.length()] = ((s.length() * (s.length() + 1)) / 2 - sum);
        return res;
    }
}
