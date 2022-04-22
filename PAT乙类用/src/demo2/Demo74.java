package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/4/2 16:23
 * 1074 宇宙无敌加法器 (20 分)
 *
 * 2022/04/02 17:12:09
 * 部分正确
 * 	16	编程题	Java (javac)	85 ms
 * 	不改了..
 **/
public class Demo74 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mould = br.readLine();
        String N1 = br.readLine();
        String N2 = br.readLine();
        int minLength = Math.min(N1.length(), N2.length());
        for (int i = minLength; i < mould.length(); i++) {
            if (N1.length() > N2.length()) {
                N2 = "0" + N2;
            } else {
                N1 = "0" + N1;
            }
        }
        String res = "";
        int flag = 0;
        for (int i = mould.length() - 1; i >= 0; i--) {
            int x = (int) mould.charAt(i) - 48;
            if (x == 0) {
                x = 10;
            }
            if (flag + (int) N1.charAt(i) - 48 + (int) N2.charAt(i) - 48 >= x) {
                res = (flag - x + (int) N1.charAt(i) - 48 + (int) N2.charAt(i) - 48) + res;
                flag = 1;
                //System.out.println((flag-(int)mould.charAt(i)+(int)N1.charAt(i)+(int)N2.charAt(i)-48));
            } else {
                res = (flag + (int) N1.charAt(i) - 48 + (int) N2.charAt(i) - 48) + res;
                flag = 0;
            }
        }
        if (flag==1) res = flag+res;
        System.out.println(Integer.parseInt(res));
    }
}
