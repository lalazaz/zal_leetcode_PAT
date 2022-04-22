package demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * @Date 2022/4/4 14:43
 * 1081 检查密码 (15 分)
 *
 * 2022/04/04 15:11:28
 * 答案正确
 * 	15	编程题	Java (javac)	121 ms
 *
 * 	正则有意思的，有时间系统学一下
 **/
public class Demo81 {
    public static void main(String[] args) throws IOException {
        //System.out.println("fhdhafukd..f3431213a".matches("^[.A-Za-z0-9]*$"));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        //正则判断一个字符串是否含有数字和小数点
        //下面这个好像只能判断纯数字
        //Pattern p = Pattern.compile("^[0-9.]+$");
        Pattern p = Pattern.compile(".*\\d+.*");

        //System.out.println(p.matcher("4fda783917").matches());
        String res = "";
        for (int i = 0; i < n; i++) {
            String temp = bufferedReader.readLine();
            if (temp.length()<6){
                //System.out.println("Your password is tai duan le.");
                System.out.println("Your password is tai duan le.");
                continue;
            }
            if (!temp.matches("^[A-Za-z0-9.]*$")){
                res = "Your password is tai luan le.";
                //System.out.println("Your password is tai luan le.");
            }else if (!p.matcher(temp).matches()){
                //没有数字
                res = "Your password needs shu zi.";
                //System.out.println("Your password needs shu zi.");
            }
            //只有数字没有字母
            if (temp.matches("^[0-9.]*$")){
                res = "Your password needs zi mu.";
                //System.out.println("Your password needs zi mu.");
            }
            if (res.equals("")) res = "Your password is wan mei.";
            System.out.println(res);
            res = "";
        }
    }
}
