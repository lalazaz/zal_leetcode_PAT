package demo3;
//@Date 2022/4/8 12:39
//1092 最好吃的月饼 (20 分)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * 2022/04/08 13:13:45
 * 部分正确
 * 	15	编程题	Java (javac)	158 ms
 * 	不说清楚搞半天，后面两个点超内存，数组改二维可以AC
 */

public class Demo92 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int N = (int) st.nval;
        st.nextToken();
        int M = (int) st.nval;
        int[] ints = new int[N];
        int max = 0, max_all = 0;
        for (int i = 0; i < M; i++) {
            int[] ints1 = new int[N];
            //String line = br.readLine();
            //String[] split = line.split("\\s+");
            for (int j = 0; j < N; j++) {
                int[] split = new int[N];
                st.nextToken();
                split[j] = (int) st.nval;
                max = Math.max(split[j], max);
                ints[j] += split[j];
                max_all = Math.max(ints[j], max_all);
            }
        }
        System.out.println(max_all);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (ints[i] == max_all) {
                res.append(i + 1);
                res.append(" ");
            }
        }
        System.out.println(res.toString().trim());
    }
}
