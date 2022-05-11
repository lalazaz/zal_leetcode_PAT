package medium;
//49. 字母异位词分组

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zal
 * @date 2022/4/17 18:46
 */
public class Demo49 {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(groupAnagrams(new String[]{"cab", "tin", "pew", "duh", "may", "ill", "buy", "bar", "max", "doc"}));
        System.out.println(groupAnagrams(new String[]{"ray", "cod", "abe", "ned", "arc", "jar", "owl", "pop", "paw", "sky", "yup", "fed", "jul", "woo", "ado", "why", "ben", "mys", "den", "dem", "fat", "you", "eon", "sui", "oct", "asp", "ago", "lea", "sow", "hus", "fee", "yup", "eve", "red", "flo", "ids", "tic", "pup", "hag", "ito", "zoo"}));
        System.out.println(groupAnagrams(new String[]{"tho", "tin", "erg", "end", "pug", "ton", "alb", "mes", "job", "ads", "soy", "toe", "tap", "sen", "ape", "led", "rig", "rig", "con", "wac", "gog", "zen", "hay", "lie", "pay", "kid", "oaf", "arc", "hay", "vet", "sat", "gap", "hop", "ben", "gem", "dem", "pie", "eco", "cub", "coy", "pep", "wot", "wee"}));
        System.out.println(groupAnagrams(new String[]{"fig", "wag", "rio", "dew", "ivy", "key", "chi", "sis", "sea", "ups", "rex", "ode", "ala", "sop", "tab", "car", "bmw", "sop", "try", "ola", "yum", "zoe", "age", "pot", "arc", "spy", "try", "gig", "bah", "map", "pal", "kin", "two", "fin", "doe", "ali", "rye", "owl", "cal", "jew", "pan", "nil", "mel", "gem", "who", "son", "mys", "maj", "sip", "ken", "did", "why"}));
        System.out.println("");
        System.out.println(groupAnagrams(new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        //遍历这个strs，每个单词转为一个字符数组，定义每个字符的值为 (.hashCode()-80)*3,
        // 一个单词的字符值为下标存到对应数组，后面取出来放到list，然后一起加到list中
        List<List<String>> res = new ArrayList<>();

        int[] ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,103,107};

        int[] nums = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            int all_len = 1;
            for (char aChar : chars) {
                all_len = all_len * ints[aChar - 'a'+1] ;
            }
            nums[i] = all_len;
        }

        for (int i = 0; i < nums.length; i++) {
            ArrayList<String> list = new ArrayList<>();
            if (nums[i] != -1) {
                int temp = nums[i];
                for (int j = i; j < nums.length; j++) {
                    if (temp == nums[j]) {
                        list.add(strs[j]);
                        nums[j] = -1;
                    }
                }
            }
            if (list.size() != 0)
                res.add(list);
        }
        return res;
    }
}
