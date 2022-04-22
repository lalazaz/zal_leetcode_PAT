package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

/**
 * @Date 2022/3/31 9:07
 * 1070 结绳 (25 分)
 * 2022/03/31 09:40:12
 * 答案正确
 * 	25	编程题	Java (javac)	142 ms
 **/
public class Demo70 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.nextToken();
        int N = (int)in.nval;
        Double[] doubles = new Double[N];
        for (int i = 0; i < N; i++) {
            in.nextToken();
            doubles[i] = in.nval;
        }
        Arrays.sort(doubles);
        double sum = doubles[0];
        for (int i = 0; i < doubles.length; i++) {
            sum =  (sum+doubles[i])/2;
        }
        System.out.println((int)Math.floor(sum));
    }
}
