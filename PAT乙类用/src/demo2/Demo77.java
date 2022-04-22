package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/4/3 16:41
 * 1077 互评成绩计算 (20 分)
 * 2022/04/03 17:06:51
 * 答案正确
 * 	20	编程题	Java (javac)	233 ms
 **/
public class Demo77 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("\\s+");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        for (int i = 0; i < N; i++) {
            double G1 = 0.0;
            int G2 = 0;
            int legal = 0;
            String[] temp = br.readLine().split("\\s+");
            G2 = Integer.parseInt(temp[0]);
            int max = 0;
            int min = 100;
            double sum = 0.0;
            for (int j = 1; j < temp.length; j++) {
                if (Integer.parseInt(temp[j])>=0&&Integer.parseInt(temp[j])<=M){
                    legal++;
                    max = Math.max(max, Integer.parseInt(temp[j]));
                    min = Math.min(min, Integer.parseInt(temp[j]));
                    sum += Integer.parseInt(temp[j]);
                }
            }
            sum = sum - max - min;
            G1 = sum / (legal-2);
            System.out.println(Math.round((G1 + G2) / 2));
        }
        br.close();
    }
}
