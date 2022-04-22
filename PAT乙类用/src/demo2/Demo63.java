package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/28 8:29
 * 1063 计算谱半径 (20 分)
 * 2022/03/28 08:37:03
 * 部分正确
 * 	16	编程题	Java (javac)	200 ms
 * 	测试点2 超时
 *
 * 用CPP过了
 * 2022/03/28 09:02:08
 * 答案正确
 * 	20	编程题	C++ (g++)	5 ms
 **/
public class Demo63 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double max = 0.0;
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            int a = Math.abs(Integer.parseInt(temp.split("\\s+")[0]));
            int b = Math.abs(Integer.parseInt(temp.split("\\s+")[1]));
            double sqrt = Math.sqrt(a * a + b * b);
            if (max < sqrt) max = sqrt;
        }br.close();
        System.out.printf("%.2f",max);
    }
}
