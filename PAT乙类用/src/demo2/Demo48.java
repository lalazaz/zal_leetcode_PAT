package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/16 16:41
 *   上就业指导网课敲的，还有些问题（也敲的乱）
 *   2022/03/16 17:44:47 部分正确  15	编程题	Java (javac)	85 ms
 *
 **/
public class Demo48 {
    public static void main(String[] args) throws IOException {
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String[] split = line.split("\\s+");

        //num2超过num1的数字直接输出
        int more = 0;
        if (split[1].length() > split[0].length()) {
            more = split[1].substring(0, split[1].length() - split[0].length()).length();
            System.out.print(split[1].substring(0, split[1].length() - split[0].length()));
            //System.out.println(more);
        }else {
            split[0] = split[0].substring(split[0].length() - split[1].length());
        }
        //然后剩余的加密
        String num21 = split[1].substring(more);
        char[] chars = num21.toCharArray();
        char[] chars1 = split[0].toCharArray();
        String res = "";
        for (int i = chars.length - 1; i != -1; i--) {
            if (i % 2 == 0) {
                //奇运算
                //System.out.println("");
                //System.out.println(chars[i]+"chars[i]");
                //System.out.println(chars1[i]+"chars1[i]");

                String res1 = (Integer.parseInt(chars[i] + "") + Integer.parseInt(chars1[i] + "")) % 13 + "";
                if (res1.equals("10")) {
                    res += "J";
                } else if (res1.equals("11")) {
                    res += "Q";
                } else if (res1.equals("12")) {
                    res += "K";
                } else res += res1;
                //System.out.print(res);
            } else {
                int res2 = chars[i] - chars1[i];
                if (res2 < 0) {
                    res2 += 10;
                }
                res += res2;
                //System.out.print(res2);
            }
        }
        StringBuilder stringBuilder = new StringBuilder(res);
        System.out.println(stringBuilder.reverse());
    }
}
