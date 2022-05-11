package demo;
//819. 最常见的单词

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/**
 * @author zal
 * @date 2022/4/17 9:11
 */
public class Demo819 {
    public static void main(String[] args) {
        String[] strings = {"hit"};
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", strings));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        String s = Arrays.toString(banned);
//        String[] split = paragraph.toLowerCase(Locale.ROOT)
//                .replaceAll("\\.", "")
//                .replaceAll(",","")
//                .replaceAll("!","")
//                .replaceAll("\\?","")
//                .split("\\s+");
        String[] split = paragraph.toLowerCase(Locale.ROOT) .split("[ ,.!?:;']");

        //"a, a, a, a, b,b,b,c, c"
        int show = 0;

        String res = "";
        List<String> list = Arrays.asList(split);
        for (int i = 0; i < list.size(); i++) {
            if (!(s.contains(list.get(i)))) {
                int temp = 0;
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i).equals(list.get(j)))
                        temp++;
                }
                if (temp > show) {
                    res = list.get(i);
                    show = temp;
                }
            }
        }
        return res;
    }
}
