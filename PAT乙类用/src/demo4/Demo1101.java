package demo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

//@Date 2022/4/15 17:43
//1101 B是A的多少倍 (15 分)

/**
 * 2022/04/15 17:55:47
 * 答案正确
 * 	15	编程题	Java (javac)	237 ms
 */

public class Demo1101 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();int A = (int)st.nval;
        st.nextToken();int D = (int)st.nval;
        int a1 = A / (int)Math.pow(10,D);
        double a2 = (A - a1 * (int)Math.pow(10,D)) * (int)Math.pow(10,(A+"").length()-D)+a1;
        System.out.printf("%.2f",a2/A);
    }
}
