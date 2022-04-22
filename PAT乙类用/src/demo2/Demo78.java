package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/4/3 20:12
 * 1078 字符串压缩与解压 (20 分)
 * 2022/04/03 20:56:35
 * 答案正确
 * 	20	编程题	Java (javac)	392 ms  好险~
 **/
public class Demo78 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line.equals("C")) {
            //压缩        TTTTThhiiiis isssss a   tesssst CAaaa as
            String temp = br.readLine();
            char[] chars = (temp + "@").toCharArray();
            int dupl = 0;
            for (int i = 0; i < chars.length - 1; i++) {
                String x = chars[i] + "";
                if (x.equals(chars[i + 1] + "")) {
                    dupl++;
                } else {
                    if (dupl != 0) {
                        //res = (dupl+1)+chars[i]+"";
                        System.out.print(dupl + 1);
                        System.out.print(chars[i]);
                        dupl = 0;
                    } else {//res+=chars[i]+"";
                        System.out.print(chars[i]);
                    }
                }
            }
        } else {
            //解压
            String temp = br.readLine();
            char[] chars = temp.toCharArray();
            int num = 0;
            int flag = 1;
            for (int i = 0; i < chars.length; i++) {
                //先统计数字，注意会是多位
                if ((chars[i] + "").matches("\\d")) {
                    num = num * flag + (chars[i] - 48);
                    flag = 10;
                } else {
                    flag = 1;
                    if (num != 0) {
                        for (int j = 0; j < num - 1; j++) {
                            System.out.print(chars[i]);
                        }
                    }
                    System.out.print(chars[i]);
                    num = 0;
                }
            }
        }
    }
}
