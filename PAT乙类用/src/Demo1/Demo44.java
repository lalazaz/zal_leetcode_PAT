package Demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/14 19:43
 * 1044 火星数字 (20 分)
 * 2022/03/14 20:13:16	 答案正确  20	编程题	Java (javac)	94 ms
 *     用try catch代替的分支，感觉思路不错
 **/
public class Demo44 {
    public static void main(String[] args) throws IOException {
        String[] low_mean = {"tret", "jan", "feb", "mar", "apr", "may", "jun", "jly", "aug", "sep", "oct", "nov", "dec"};
        String[] high_mean = {"tam", "hel", "maa", "huh", "tou", "kes", "hei", "elo", "syy", "lok", "mer", "jou"};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(br.readLine());
        String[] strings = new String[N];
        for (int i = 0; i < N; i++) {
            strings[i] = br.readLine();
        }
        for (int i = 0; i < N; i++) {
            try {
                //数字变火星文
                int i1 = Integer.parseInt(strings[i]);
                int high = i1 / 13;
                int low = i1 % 13;
                if (low == 0 && high == 0) {
                    System.out.println("tret");
                } else if (low == 0) {
                    System.out.println(high_mean[high - 1]);
                } else if (high != 0) {
                    System.out.println(high_mean[high - 1] + " " + low_mean[low]);
                } else {
                    System.out.println(low_mean[low]);
                }

            } catch (NumberFormatException e) {
                //处理火星文变数字
                int p = 0;
                int m = 0;
                int res = 0;
                if (strings[i].contains(" ")) {

                    String[] split = strings[i].split("\\s+");


                    for (String s : high_mean) {
                        p++;
                        if (split[0].equals(s)) res += p * 13;
                    }
                    for (String s : low_mean) {
                        m++;
                        if (split[1].equals(s)) res += m - 1;
                    }


                    System.out.println(res);

                } else {
                    for (String s : high_mean) {
                        p++;
                        if (strings[i].equals(s)) System.out.println(p * 13);
                    }
                    for (String s : low_mean) {
                        m++;
                        if (strings[i].equals(s)) System.out.println(m - 1);
                    }
                }
            }
        }
    }
}
