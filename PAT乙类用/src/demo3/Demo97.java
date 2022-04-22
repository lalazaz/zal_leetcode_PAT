package demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

//@Date 2022/4/12 14:56
//1097 矩阵行平移 (20 分)

/**
 * 2022/04/12 15:40:52
 * 答案正确
 * 	20	编程题	Java (javac)	211 ms
 */
public class Demo97 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();int n = (int)st.nval;        st.nextToken();int k = (int)st.nval;
        int k1 = 0;
        st.nextToken();int x = (int)st.nval;
        int[][] res = new int[n][n];

        for (int i = 1; i <= n; i++) {
            if (k1==k) k1=0;
            int sum = 0;
            String[] split = br.readLine().split("\\s+");
            if (i%2==0){
                for (int j = 0; j < split.length; j++) {
                    res[i-1][j] = Integer.parseInt(split[j]);
                }
            }else {
                int t = 0;
                for (; t < k1+1; t++) {
                    res[i-1][t] = x;
                }k1++;
                for (int j=0;j+t  < split.length; j++) {
                    res[i-1][j+t] = Integer.parseInt(split[j]);
                }
            }
        }
        int lie_sum = 0;
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                lie_sum+=res[j][i];
            }
            if (i==res.length-1)
                System.out.print(lie_sum);
            else System.out.print(lie_sum+" ");
            lie_sum=0;
        }
    }
}
