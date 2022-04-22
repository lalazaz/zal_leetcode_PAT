package demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/13 21:30
 * 1041 考试座位号 (15 分)
 * 2022/03/13 21:45:38  部分正确 9	编程题	Java (javac)	400 ms
 *                        超时
 **/
public class Demo41 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(br.readLine());
        String[] info = new String[N];
        for (int i = 0; i < N; i++) {
            info[i] = br.readLine();
        }

/*      String s = info[0].split("\\s+")[1];
        System.out.println(s);*/
        Integer M = Integer.parseInt(br.readLine());
        int[] nums = new int[M];
        String line = br.readLine();
        String[] split = line.split("\\s+");
        for (int i = 0; i < split.length; i++) {
            nums[i] = Integer.parseInt(split[i]);
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (nums[i] == Integer.parseInt(info[j].split("\\s+")[1])) {
                    String replace = info[j].replace(" " + Integer.parseInt(info[j].split("\\s+")[1]), "");
                    System.out.println(replace);
                }
            }
        }
    }
}

