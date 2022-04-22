package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Date 2022/3/26 11:51
 * 1060 爱丁顿数 (25 分)
 * 2022/03/27 10:43:14	 部分正确  18	编程题	Java (javac)	250 ms
 * 超时还有一个没过..
 **/
public class Demo60 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split("\\s+");
        br.close();
        int[] days = new int[split.length];
        for (int i = 0; i < days.length; i++) {
            days[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(days);

        //System.out.println(Arrays.toString(days));
        int i = N-1;
        for (; i > 0; i--) {
            if (days[i] > N-i && days[i]<= N-i+1){
                System.out.println(N-i);
                break;
            }
        }
        if (days[0]>N){
            System.out.println(N);
        }else {
            if (i == 0){
                System.out.println(0);
            }
        }
    }
}
