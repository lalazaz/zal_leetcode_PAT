package Demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * @Date 2022/3/14 8:50
 * 1042 字符统计 (20 分)
 * 2022/03/14 09:15:32	 答案正确   20	编程题	Java (javac)	80 ms
 **/
public class Demo42 {
    public static void main(String[] args) throws IOException {
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
        char[] chars = line.toLowerCase(Locale.ROOT).toCharArray();
        Character[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'};
        int[] times = new int[26];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < times.length; j++) {
                if (chars[i] == characters[j]) {
                    times[j]++;
                }
            }
        }
/*        for (Object o : times) {
            System.out.print(o);
        }*/
        int max = times[0];
        int i =0 ,j=0;
        for (Object o : times) {
            if (max < times[i]) {
                max = times[i];
                j = i;
            }
            i++;
        }

        System.out.println(characters[j]+" "+max);
    }
}
