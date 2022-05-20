package 剑指offer_01;
//剑指 Offer 50. 第一个只出现一次的字符

/**
 * @author zal
 * @date 2022/4/23 12:03
 */
public class Demo50 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("abaccdeff"));
        System.out.println(firstUniqChar(""));
        System.out.println(firstUniqChar("cc"));
    }

    /**
     * 字典法
     */
    public static char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        char[] nums = new char[26];
        for (char aChar : chars) {
            nums[aChar - 'a']++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (nums[chars[i] - 'a'] == 1) return chars[i];
        }
        return ' ';
    }

    /**
     * API
     */
/*    public static char firstUniqChar(String s) {
        //if (s.equals("")) return ' ';
        int i = 0;
        for (; i < s.length(); i++) {
            if (!s.replaceFirst(s.charAt(i) + "", "").contains(s.charAt(i) + ""))
                break;
        }
        if (i < s.length())
            return s.charAt(i);
        else return ' ';
    }*/
}
