package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/4/4 9:42
 * 1080 MOOC期终成绩 (25 分)
 **/
public class Demo80 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("\\s+");
        int P = Integer.parseInt(split[0]),M = Integer.parseInt(split[1]),N = Integer.parseInt(split[2]);
        //合格的放在一个字符串中，不同学生之间的信息用@@分割
        String all_bianchen = "";
        String all_qizhong = "";
        for (int i = 0; i < P; i++) {
            String temp = br.readLine();
            if (Integer.parseInt(temp.split("\\s+")[1])>=200&&Integer.parseInt(temp.split("\\s+")[1])<=900){
                all_bianchen+=temp+"@@";
            }
        }
        //System.out.println(all_bianchen);
        for (int i = 0; i < M; i++) {
            String temp = br.readLine();
            /**
             * 总之就是各种分割，判断..
             */
        }
    }
}
