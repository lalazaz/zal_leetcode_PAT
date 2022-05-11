//1005 Spell It Right (20 分)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zal
 * @date 2022/4/20 11:05
 * 2022/04/20 11:10:28
 * 答案正确
 * 	20	编程题	Java (javac)	85 ms
 */
public class Demo05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        int all = 0;
        for (int i = 0; i < chars.length; i++) {
            all += chars[i] - 48;
        }
        char[] num = (all + "").toCharArray();
        String[] strings = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < num.length; i++) {
            if (i != num.length - 1) System.out.print(strings[num[i] - 48] + " ");
            else System.out.println(strings[num[i] - 48]);
        }
    }
}
