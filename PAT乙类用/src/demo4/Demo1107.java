package demo4;
//1107 老鼠爱大米 (20 分)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author zal
 * @date 2022/4/16 17:56
 *
 * 2022/04/16 18:03:25
 * 答案正确
 * 	20	编程题	Java (javac)	270 ms
 */
public class Demo1107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int N = (int) st.nval;
        st.nextToken();
        int M = (int) st.nval;
        int max = 0;
        for (int i = 0; i < N; i++) {
                String[] split = br.readLine().split("\\s+");
                int[] ints = new int[split.length];
                for (int k = 0; k < ints.length; k++) {
                    ints[k] = Integer.parseInt(split[k]);
                }
                Arrays.sort(ints);
                int temp = ints[M - 1];
                if (i==N-1){
                    System.out.println(temp);
                }else System.out.print(temp+" ");
                max = Math.max(max, temp);
        }
        System.out.println(max);

    }
}
