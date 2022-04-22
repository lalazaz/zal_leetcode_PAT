package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * @Date 2022/3/25 10:45
 * 2022/03/25 11:01:57	 答案正确	 20	编程题	Java (javac)	113 ms
 * 测试点2是输入字符串中没有字母的情况，输出为0 0  而不是什么都不输出
 **/
public class Demo57 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toUpperCase(Locale.ROOT).toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                sum += chars[i] - 64;
            }
        }
        String s = Integer.toBinaryString(sum);
        int len = s.length();
        //System.out.println(s);
        int zero_nums = 0;
        if (!s.equals("0")){
            while (true) {
                if (s.contains("0")) {
                    s = s.replaceFirst("0", "");
                    zero_nums++;
                } else break;
            }
            System.out.println(zero_nums+" "+(len-zero_nums));
        }else {
            System.out.println("0 0");
        }

    }
}
