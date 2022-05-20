package easy;
//953. 验证外星语词典

/**
 * @author zal
 * @date 2022/5/17 8:36
 */
public class Demo953 {
    public static void main(String[] args) {
        System.out.println(isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
    }

    static int[] alphabet;

    public static boolean isAlienSorted(String[] words, String order) {
        alphabet = new int[26];
        for (int i = 0; i < 26; i++) {
            alphabet[order.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < words.length - 1; i++) {
            if (Compare(words[i], words[i + 1]) > 0) return false;
        }
        return true;
    }

    public static int Compare(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int min = Math.min(l1, l2);
        for (int i = 0; i < min; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2)
                return alphabet[c1 - 'a'] - alphabet[c2 - 'a'];
        }
        return l1 - l2;
    }
}
