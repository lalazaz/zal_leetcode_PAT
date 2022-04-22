package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/16 12:02
 * 1047 编程团体赛 (20 分)
 * 2022/03/16 12:21:34	 部分正确  14	编程题	Java (javac)	400 ms
 * 测试点1 超时
 *
 **/
public class Demo47 {
    static int max = 0;
    static int max_index = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //试着先读N行，然后再拆开
        String[] strings = new String[N];
        for (int i = 0; i < N; i++) {
            strings[i] = br.readLine();
        }
        br.close();




        int[] ints = new int[10001];




        for (int i = 0; i < N; i++) {
            //String[] info = br.readLine().split("\\s+");
            String[] info = strings[i].split("\\s+");
            String s = info[0].split("-")[0];
            int score = Integer.parseInt(info[1]);
            ints[Integer.parseInt(s)] += score;
            if (max < ints[Integer.parseInt(s)]){
                max = ints[Integer.parseInt(s)];
                max_index = Integer.parseInt(s);
            }
        }
        System.out.println(max_index+" "+max);
    }
}
