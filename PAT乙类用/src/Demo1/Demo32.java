package Demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @Date 2022/3/10 20:25
 **/
//2022/03/10 20:55:03	部分正确  17	编程题	Java (javac)	200 ms
//1032 挖掘机技术哪家强 (20 分)
public class Demo32 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String l = br.readLine();
        int N = Integer.parseInt(l);
        int[] score = new int[100001];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] split = line.split("\\s+");
            int id = Integer.parseInt(split[0]);
            int score_temp = Integer.parseInt(split[1]);
            //加入到score数组里面
            score[id] = score[id] + score_temp;
        }
        br.close();
        int max = score[1];
        int max_id = 1;
        //System.out.println(Arrays.toString(score));
        for (int i = 0; i < score.length; i++) {
            if (score[i]!=0){
                if (max < score[i]) {
                    max = score[i];
                    max_id = i;
                }
            }
        }
        System.out.println(max_id+" "+max);
    }
}
