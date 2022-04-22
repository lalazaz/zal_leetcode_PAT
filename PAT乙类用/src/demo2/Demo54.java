package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.regex.Pattern;

/**
 * @Date 2022/3/23 13:28
 * 2022/03/23 14:26:52 答案正确  20	编程题	Java (javac)	131 ms
 * 后面两个测试点好坑
 **/
public class Demo54 {
    public static void main(String[] args) throws IOException {

        //下面这个正则会认为  ’-‘和'+'为数字
        Pattern pattern = Pattern.compile("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split("\\s+");
        double res = 0.0;
        int x = 0;
        for (int i = 0; i < split.length; i++) {
            //关于123.这样的数字pat认为合法
            if (split[i].contains(".")&&split[i].split("\\.").length==1){
                split[i] = split[i].split("\\.")[0];
            }
            if (!pattern.matcher(split[i]).matches() || split[i].equals("-") || split[i].equals("+")) {
                System.out.println("ERROR: " + split[i] + " is not a legal number");
            } else {
                if (Double.parseDouble(split[i]) > 1000.0 || Double.parseDouble(split[i]) < -1000.0) {
                    System.out.println("ERROR: " + split[i] + " is not a legal number");
                } else {

                    if (/*精度问题————有小数点则判断小数点后是否小于等于2*/ split[i].contains(".")) {
                        if (split[i].split("\\.")[1].length() > 2) {
                            System.out.println("ERROR: " + split[i] + " is not a legal number");
                        } else {
                            x++;
                            res += Double.parseDouble(split[i]);
                        }
                    }else {
                        x++;
                        res += Double.parseDouble(split[i]);
                    }

                }
            }
        }
        DecimalFormat df=new DecimalFormat("0.00");
        if (x != 0) {
            if (x == 1){
                res /= x;
                System.out.println("The average of " + x + " number is " + df.format(res));
            }else {
                res /= x;
                System.out.println("The average of " + x + " numbers is " + df.format(res));
            }
        } else {
            System.out.println("The average of 0 numbers is Undefined");
        }
    }
}
