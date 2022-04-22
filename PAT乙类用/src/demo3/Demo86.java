package demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;


/**
 * @Date 2022/4/5 19:09
 * 1086 就不告诉你 (15 分)
 * 2022/04/05 19:16:39
 * 答案正确
 * 	15	编程题	Java (javac)	93 ms
 * 	结果需要取整  例如结果是001 变成 1才正确
 **/
public class Demo86 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();        int A = (int)st.nval;
        st.nextToken();        int B = (int)st.nval;
        String res =  A * B+"";
        System.out.println(Integer.parseInt(new StringBuilder(res).reverse()+""));
    }
}
