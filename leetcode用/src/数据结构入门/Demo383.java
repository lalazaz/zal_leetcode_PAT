package 数据结构入门;
//383. 赎金信

/**
 * @author zal
 * @date 2022/5/9 8:48
 */
public class Demo383 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] times = new int[26];
        int[] my = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            times[magazine.charAt(i)-'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            my[ransomNote.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (times[i] < my[i])
                return false;
        }
        return true;
    }
}
