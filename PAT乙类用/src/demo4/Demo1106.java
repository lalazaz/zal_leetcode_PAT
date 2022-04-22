package demo4;
//1106 2019数列 (15 分)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;

/**
 * @author zal
 * @date 2022/4/16 17:39
 * 2022/04/16 17:54:24
 * 答案正确
 * 	15	编程题	Java (javac)	110 ms
 */
public class Demo1106 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();int n = (int)st.nval;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);        list.add(0);        list.add(1);        list.add(9);
        if (n==1) {
            System.out.println(2);return;
        }
        if (n==2) {
            System.out.println(20);return;
        }
        if (n==3) {
            System.out.println(201);return;
        }
        if (n==4) {
            System.out.println(2019);return;
        }
        for (int i = 4; i < n; i++) {
            list.add((list.get(i-1)+list.get(i-2)+list.get(i-3)+list.get(i-4))%10);
        }
        System.out.println(list.toString()
                .replaceAll(", ","")
                .replaceAll("\\[","")
                .replaceAll("]",""));
    }
}
