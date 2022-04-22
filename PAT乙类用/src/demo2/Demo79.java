package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/4/3 22:22
 * 1079 延迟的回文数 (20 分)
 * 2022/04/03 22:43:24
 * 部分正确
 * 	18	编程题	Java (javac)	85 ms
 * 	测试点六数字超出int能接受的范围，改的话需要使用数组存储数字
 **/
public class Demo79 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int i = 0;
        for (; i < 10; i++) {
            if (isPalindrome(line)) {
                System.out.println(line + " is a palindromic number.");
                break;
            } else {
                System.out.print(line+" + ");
                //正序和逆序一起加
                int num = 0, flag = 1;
                char[] chars = line.toCharArray();
                //拿到逆序
                for (int j = chars.length - 1; j >= 0; j--) {
                    num = num * flag + chars[j] - 48;
                    flag = 10;
                }
                System.out.print(num+" = ");
                /**
                 * 这个地方测试点六会超出范围，要通过这个测试点需要使用数组来保存数字..要改动的地方比较多..
                 */
                int res = num + Integer.parseInt(line);
                line = res+"";
                System.out.println(line);
            }
        }
        br.close();
        if (i == 10) {
            System.out.println("Not found in 10 iterations.");
        }
    }

    //传入一个字符串，判断该字符串对应的字符是否为回文数
    public static boolean isPalindrome(String s) {
        //当然，如果传来的字符串不是数字什么的也没判断
        boolean flag = false;
        char[] chars = s.toCharArray();
        int l = chars.length;
        int i = 0;
        for (; i <= chars.length / 2; i++) {
            if (!(chars[i] == chars[l - i - 1])) {
                break;
            }
        }
        if (i == (l / 2) + 1) flag = true;
        return flag;
    }
}
