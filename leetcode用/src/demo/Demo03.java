package demo;

/**
 * @Date 2022/4/1 20:42
 * 3. 无重复字符的最长子串
 **/
public class Demo03 {
    public static void main(String[] args) {
        String s = "bbbbb";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int max = 0;
        String res = "";
        int temp = 0;
        for (int i = 0; i < chars.length; i++) {
            res = "";
            temp = 0;
            for (int j = i; j < chars.length; j++) {
                if (!res.contains(chars[j] + "")) {
                    res += chars[j];
                    temp++;
                } else break;
                if (max < temp) max = temp;
            }
            System.out.println(res);
        }
        return max;
    }
}
