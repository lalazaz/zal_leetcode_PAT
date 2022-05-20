package 数据结构入门;
//242. 有效的字母异位词

/**
 * @author zal
 * @date 2022/5/9 8:53
 */
public class Demo242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
        System.out.println(isAnagram("a", "ab"));
        System.out.println(isAnagram("aa", "aa"));
        System.out.println(isAnagram("ba", "ab"));
        System.out.println(isAnagram("a", "a"));
        System.out.println(isAnagram("aa", "a"));
    }

    public static boolean isAnagram(String s, String t) {
        int[] power = {3, 5, 7, 9, 11, 13, 17, 19, 22, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 46, 47, 51, 53, 57, 59};
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < s.length(); i++) {
            sum1 += (s.charAt(i) - 'a' + 1) * power[s.charAt(i) - 'a'];
        }
        for (int i = 0; i < t.length(); i++) {
            sum2 += (t.charAt(i) - 'a' + 1) * power[t.charAt(i) - 'a'];
        }
        return sum1 == sum2;
    }
}
