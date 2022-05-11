package easy;
//824. 山羊拉丁文

import java.util.Locale;

/**
 * @author zal
 * @date 2022/4/21 8:48
 */
public class Demo824 {
    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
        System.out.println(toGoatLatin("The quick brown fox jumped over the lazy dog"));
        System.out.println(toGoatLatin("Each word consists of lowercase and uppercase letters only"));
    }

    public static String toGoatLatin(String sentence) {
        StringBuilder res = new StringBuilder();
        String yuanyin = "a#e#i#o#u";
        String[] split = sentence.split("\\s+");
        for (int i = 0; i < split.length; i++) {
            if (yuanyin.contains((split[i].charAt(0) + "").toLowerCase())) {
                res.append(split[i]).append("ma");
            } else {
                res.append(split[i].substring(1)).append(split[i].charAt(0)).append("ma");
            }
            for (int j = -1; j < i; j++) {
                res.append("a");
            }
            res.append(" ");
        }
        return res.toString().substring(0,res.length()-1);
    }
}
