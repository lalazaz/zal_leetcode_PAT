package m_test;

import java.math.BigInteger;
import java.util.Scanner;

public class Demo11_test {
    //测试回车正则表达式分割字符串
    //测试接受许多行黏贴数据
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a, b, c;
        int t = scanner.nextInt();

        for (int i = 1; i <= t; ++i) {
            a = scanner.nextBigInteger();
            b = scanner.nextBigInteger();
            c = scanner.nextBigInteger();
            String s = a.add(b).subtract(c).toString();
            if (s.charAt(0) != '-' && s.charAt(0) != '0')
                System.out.println("Case #" + i + ": true");
            else
                System.out.println("Case #" + i + ": false");
        }
    }
}
