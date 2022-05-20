package contest.my_02;
//2273. 移除字母异位词后的结果数组

import java.util.*;

/**
 * @author zal
 * @date 2022/5/16 12:18
 */
public class Demo2273 {
    public static void main(String[] args) {
        System.out.println(removeAnagrams(new String[]{"abba", "baba", "bbaa", "cd", "cd"}));
        System.out.println(removeAnagrams(new String[]{"a", "b", "c", "d", "e"}));
    }

    public static List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        int last = 0;
        int[] power = {3, 5, 7, 9, 11, 13, 17, 19, 21, 23, 27, 29, 31, 33, 34, 37, 39, 41, 43, 47, 51, 53, 57, 59, 61, 63, 67};
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            int temp = 0;
            for (char c : chars) {
                temp += power[c - 'a'] * c;
            }
            if (temp!=last)
                res.add(words[i]);
            last = temp;
        }
        return res;
    }
}
