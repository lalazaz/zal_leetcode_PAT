package demo3;
//@Date 2022/4/7 18:58
//1090 危险品装箱 (25 分)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2022/04/07 19:30:58
 * 部分正确
 * 	18	编程题	Java (javac)	400 ms
 * 	测试点2 超时
 */

public class Demo90 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String[] split = line1.split("\\s+");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);
        //不相容的字符串放到数组里面
        String[] strings = new String[N];
        for (int i = 0; i < N; i++) {
            strings[i] = br.readLine();
        }
        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            int j = 0;
            for (; j < strings.length; j++) {
                int x = Integer.parseInt(strings[j].substring(0,5));
                int y = Integer.parseInt(strings[j].substring(6,11));

                if (line.contains(x+"") && line.contains(y+"")) {
                    System.out.println("No");
                    break;
                }
            }
            if (j == strings.length) System.out.println("Yes");
        }
    }
}
