package 数据结构入门;
//387. 字符串中的第一个唯一字符

/**
 * @author zal
 * @date 2022/5/9 8:31
 */
public class Demo387 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
    }


    public static int firstUniqChar(String s) {
        int[] times = new int[26];
        for (int i = 0; i < s.length(); i++) {
            times[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (times[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }

/*    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                return i;
        }
        return -1;
    }*/

/*    public static int firstUniqChar(String s) {
        int res = -1;
        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            for (; j < s.length(); j++) {
                if (j != i && s.charAt(i) == s.charAt(j))
                    break;
            }
            if (j == s.length()) {
                res = i;
                break;
            }
        }
        return res;
    }*/
}
