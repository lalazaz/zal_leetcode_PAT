package demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @Date 2022/4/5 19:51
 * 1088 三人行 (20 分)
 *
 * 2022/04/06 10:50:22
 * 部分正确
 * 	16	编程题	Java (javac)	92 ms
 * 	有毛病的题目
 **/
public class Demo88 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();        int M = (int) st.nval;
        st.nextToken();        int X = (int) st.nval;
        st.nextToken();        int Y = (int) st.nval;
        int jia = 99,yi = 0;
        int bing = 0;

        /*for (; jia > 9 ; jia--) {
            yi = jia / 10 + (jia % 10) * 10;
            bing = yi / Y;
            if ((Math.abs(jia  - yi ) - X * bing)==0) break;
        }*/
        for(int a = 10 ; a <= 99; a++){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder = stringBuilder.append(a).reverse();
            if(stringBuilder.charAt(0) == '0'){
                stringBuilder.deleteCharAt(0);
            }
            int b = Integer.parseInt(stringBuilder.toString());
            if(Math.abs(a - b) ==  ((double) X / Y) * b){
                jia = a;
                yi = b;
                bing = yi / Y;
            }
        }

        if (jia == 9){
            System.out.println("No Solution");
        }else {
            System.out.print(jia+" ");
            System.out.print(jia > M ? "Cong " : jia == M ? "Ping " : "Gai ");
            System.out.print(yi > M ? "Cong " : yi == M ? "Ping " : "Gai ");
            System.out.print(bing > M ? "Cong" : bing == M ? "Ping" : "Gai");
        }
    }

}
