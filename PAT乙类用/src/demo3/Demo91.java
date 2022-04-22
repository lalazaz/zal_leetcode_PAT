package demo3;
//@Date 2022/4/7 19:36
//1091 N-自守数 (15 分)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * 2022/04/07 19:50:40
 * 答案正确
 * 	15	编程题	Java (javac)	95 ms
 */
public class Demo91 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();int M = (int)st.nval;int j = 1;
        for (int i = 0; i < M; i++) {
            j=1;
            st.nextToken();
            int temp = (int)st.nval;
            for (; j < 10; j++) {
                if (((temp*temp*j)+"").lastIndexOf(temp+"") == ((temp*temp*j)+"").length()-(temp+"").length()){
                    System.out.println(j+" "+(temp*temp*j)+"");
                    break;
                }
            }
            if (j == 10) System.out.println("No");
        }
    }
}
