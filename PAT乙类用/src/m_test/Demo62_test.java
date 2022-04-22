package m_test;

import com.sun.tools.javac.Main;

/**
 * @Date 2022/3/27 11:42
 **/
public class Demo62_test {
    public static void main(String[] args) {
        //测试辗转相除法   结果为1则二者之间没有最大公约数
        long gcd = Gcd(2, 977);
        System.out.println(gcd);
    }
    static long Gcd(long a, long b) {
        return (a % b == 0) ? b : (Gcd(b, a % b));
    }
}
