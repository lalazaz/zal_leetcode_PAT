package demo3;
//@Date 2022/4/8 22:27
//1094 谷歌的招聘 (20 分)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * 2022/04/08 22:51:32
 * 答案正确
 * 	20	编程题	Java (javac)	96 ms
 */

public class Demo94 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();int L = (int)st.nval;        st.nextToken();int K = (int)st.nval;
        String line = br.readLine();int i = 0;
        String res = "";
        for (; i < L - K + 1; i++) {
            String test = line.substring(i,K+i);
            //判断 test
            if (test.length()<=4){
                if (isPrime_4(test)){
                    res = test;
                    break;
                }
            }else {
                if (isPrime(test)){
                    res = test;
                    break;
                }
            }
        }
        //找到输出，没找到404
        if (i == L-K+1) System.out.println("404");
        else System.out.println(res);
    }

    //给一个字符串判断其对应的整数是否为素数   并且004这样的字符串看作为4
    public static boolean isPrime(String s){
        int n = Integer.parseInt(s);
        boolean flag = false;int i = 2;
        for (; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (i > Math.sqrt(n)) flag = true;
        return flag;
    }

    /**
     * 写这个是因为测试点1用上面的方法判断有点问题
     * @param s
     * @return
     */
    //给一个字符串判断其对应的整数是否为素数   并且004这样的字符串看作为4
    public static boolean isPrime_4(String s){
        int n = Integer.parseInt(s);
        boolean flag = false;int i = 2;
        for (; i < n ; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (i ==n ) flag = true;
        return flag;
    }
}
