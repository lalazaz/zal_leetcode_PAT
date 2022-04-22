package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/16 8:37
 * 1046 划拳 (15 分)
 *       2022/03/16 08:45:52	 答案正确  15	编程题	Java (javac)	93 ms
 **/
public class Demo46 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int jia = 0 ;
        int yi = 0 ;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] split = line.split("\\s+");
            int[] ints = new int[split.length];
            for (int j = 0; j < split.length; j++) {
                ints[j] = Integer.parseInt(split[j]);
            }
            if ((ints[0]+ints[2] == ints[1])&&ints[0]+ints[2] != ints[3]){
                yi++;
            }
            if ((ints[0]+ints[2] != ints[1])&&ints[0]+ints[2] == ints[3]){
                jia++;
            }
        }
        System.out.println(jia+" "+yi);
    }
}
