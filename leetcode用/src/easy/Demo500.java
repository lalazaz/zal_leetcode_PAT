package easy;
//500. 键盘行

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

/**
 * @author zal
 * @date 2022/4/19 19:58
 */
public class Demo500 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
        System.out.println(Arrays.toString(findWords(new String[]{"omk"})));
        System.out.println(Arrays.toString(findWords(new String[]{"adsdf","sfd"})));
    }

    public static String[] findWords(String[] words) {
        String[] strings = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                String s = strings[j];
                char[] chars = words[i].toLowerCase(Locale.ROOT).toCharArray();
                if (s.contains(chars[0] + "")) {

                    //int count = (int) Stream.of(chars).filter(x -> s.contains(Arrays.toString(x))).count();
                    int count = 0;
                    for (int k = 0; k < chars.length; k++) {
                        if (s.contains(chars[k]+""))
                            count++;
                    }
                    if (count == words[i].length()) {
                        list.add(words[i]);
                        break;
                    }
                }
            }
        }
        String[] res = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
