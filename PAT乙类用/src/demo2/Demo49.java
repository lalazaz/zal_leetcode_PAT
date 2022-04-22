package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/17 9:10
 * 1049 数列的片段和 (20 分)
 * 2022/03/17 09:31:17	 部分正确  15	编程题	Java (javac)	500 ms   超时...
 **/
public class Demo49 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String line = br.readLine();
        Double[] doubles = new Double[N];
        for (int i = 0; i < N; i++) {
            doubles[i] = Double.parseDouble(line.split("\\s+")[i]);
        }
        double res = 0.0;
        for (int i = 0; i < N; i++) {
            for (int temp = i + 1; temp < N + 1; temp++) {
                for (int j = i; j < temp; j++) {
                    res += doubles[j];
                    //System.out.println(doubles[j]);
                }
            }
        }
        System.out.printf("%.2f%n",res);
    }
}
