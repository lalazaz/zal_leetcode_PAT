package demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * @Date 2022/3/11 12:14
 **/
//2022/03/11 12:41:24	部分正确  17	编程题	Java (javac)	200 ms  最后一个超时   牛客过了315ms
public class Demo33 {
    //1033 旧键盘打字 (20 分)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String line1_xiaoxie = line1.toLowerCase(Locale.ROOT);
        boolean flag = false;
        //判断一下上档键 +
        if (line1.indexOf('+') != -1) {
            //坏了
            flag = true;
        }
        String line2 = br.readLine();
        br.close();
        char[] chars1 = line2.toCharArray();
        //String s = line2.toUpperCase(Locale.ROOT);
        //char[] chars = s.toCharArray();
        for (Character c : chars1) {
            //判断上档键
            boolean b = line1.indexOf(c) == -1 && line1_xiaoxie.indexOf(c) == -1;
            if (flag) {
                //如果坏了即flag   true  那么里面的所有大写不管，
                if (!(c >= 'A' && c <= 'Z')) {
                    if (b) {
                        System.out.print(c);
                    }
                }
            } else {
                //如果没坏  那么判断大写小写都判断是否在里面
                if (b){
                    System.out.print(c);
                }
            }
        }
    }
}
