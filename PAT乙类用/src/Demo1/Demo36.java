package Demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/13 11:00
 * 1036 跟奥巴马一起编程 (15 分)
 * 2022/03/13 11:11:03	 答案正确  15	编程题	Java (javac)	82 ms
 **/
public class Demo36 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] split = line.split("\\s+");
        Double N = Double.parseDouble(split[0]);
        String c = split[1];
        for (int i = 0; i < Math.round(N / 2); i++) {
            if (i == 0 || i == Math.round(N / 2) - 1) {
                for (int j = 0; j < N; j++) {
                    System.out.print(c);
                }
                System.out.println("");
            } else {
                System.out.print(c);
                for (int j = 0; j < N - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println(c);
            }
        }
    }
}
