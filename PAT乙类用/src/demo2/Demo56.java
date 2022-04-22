package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/25 10:36
 * 1056 组合数的和 (15 分)
 * 2022/03/25 10:43:17	 答案正确  15	编程题	Java (javac)	81 ms
 **/
public class Demo56 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("\\s+");
        int N = Integer.parseInt(split[0]);
        int sum = 0;
        for (int i = 1; i < split.length; i++) {
            for (int j = 1; j < split.length; j++) {
                if (j != i) {
                    sum += Integer.parseInt(split[i]) * 10 + Integer.parseInt(split[j]);
                }
            }
        }
        System.out.println(sum);
    }
}
