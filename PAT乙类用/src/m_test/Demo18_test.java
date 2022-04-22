package m_test;

import java.util.Scanner;

public class Demo18_test {
    //测试输入一个字母一个空格一个字母如何接受

    //结果：scanner.next()接受字符或者字符串 遇到空格跳过
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        String next2 = scanner.next();
        //String next3 = scanner.next();
        System.out.println(next);
        System.out.println(next2);
        //System.out.println(next3);
    }
}
