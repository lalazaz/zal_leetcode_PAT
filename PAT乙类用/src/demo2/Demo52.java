package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Date 2022/3/22 17:27
 * 2022/03/22 18:45:23	 答案错误  0	编程题	Java (javac)	88 ms
 *   貌似这题的java编译有问题，测试都过了的
 **/
public class Demo52 {
    public static void main(String[] args) throws IOException {
        /*String[] hands = new String[]{"╮", "╭", "o", "~", "/~", "<", ">"};
        String[] eyes = new String[]{"╯", "╰", "^", "-", "=", ">", "<", "@", "⊙"};
        String[] mouths = new String[]{"Д", "▽", "_", "ε", "^", "..."};*/


        //收集这里有些问题
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //接受三行可选符号集   且处理字符串中的空格
        String line1 = br.readLine().replaceAll(" ","");
        String line2 = br.readLine().replaceAll(" ","");
        String line3 = br.readLine().replaceAll(" ","").replaceAll("\\.\\.\\.", ""); /*| .  *  [] \  是特殊字符，在使用时要进行转义*/

        String[] hands = line1.substring(1, line1.length() - 1).split("\\]\\[");
        String[] eyes = line2.substring(1, line2.length() - 1).split("\\]\\[");
        String[] mouths = line3.substring(1, line3.length() - 1).split("\\]\\[");
        System.out.println(Arrays.toString(hands));
        System.out.println(Arrays.toString(eyes));
        System.out.println(Arrays.toString(mouths));

        int N = Integer.parseInt(br.readLine());
        while (N-- != 0) {
            String line = br.readLine();
            String[] split = line.split("\\s+");
            try {
                System.out.println(hands[Integer.parseInt(split[0]) - 1] + "(" +
                        eyes[Integer.parseInt(split[1]) - 1] + "" +
                        mouths[Integer.parseInt(split[2]) - 1] + "" +
                        eyes[Integer.parseInt(split[3]) - 1] + ")" +
                        hands[Integer.parseInt(split[4]) - 1]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Are you kidding me? @\\/@");
            }
        }
    }
}
