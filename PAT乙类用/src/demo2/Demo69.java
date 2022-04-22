package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @Date 2022/3/30 18:55
 * 1069 微博转发抽奖 (20 分)
 *
 * 2022/03/30 19:39:09
 * 部分正确
 * 	14	编程题	Java (javac)	157 ms
 **/
public class Demo69 {
    public static void main(String[] args) throws IOException {
        //String res = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        StringBuilder res = new StringBuilder();
        int count = 0;
        int M = Integer.parseInt(line1.split("\\s+")[0]);int N = Integer.parseInt(line1.split("\\s+")[1]);int S = Integer.parseInt(line1.split("\\s+")[2]);
        for (int i = 1; i <= M; i++) {
            String temp = br.readLine();
            if ((i-N) % S == 0&&i>N || i == N){
                count++;
                if (!(res+"").contains("("+temp+")")){
                    res.append("(").append(temp).append(")");
                    System.out.println(temp);
                }
            }
        }
        if ((res+"").equals("")) System.out.println("Keep going...");
    }
}
