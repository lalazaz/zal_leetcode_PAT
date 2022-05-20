package 算法入门;
//3. 无重复字符的最长子串

/**
 * @author zal
 * @date 2022/4/26 9:34
 */
public class Demo3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    //评论区第一的。不太明白
    public static int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }
/*    public static int lengthOfLongestSubstring(String s) {
        //if (s.equals("")) return 0;
        int l = 0, r = 1;
        int max = 0;
        while (r < s.length()) {
            String sub = s.substring(l, r);
            if (!s.substring(l, r - 1).contains(s.substring(s.length() - 1))&&!s.substring(l,r-1).equals("")) {
                //如果窗口右边的字符不在原有的字符内
                max = s.length();
                r++;
            } else {
                l++;
            }
        }
        return max;
    }*/
}
