package demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//@Date 2022/4/14 11:45
//1100 校庆 (25 分)

/**
 * 需要考虑的情况，年老的人在同一天出生？那么输出就要输出多个人的ID
 * 内存如何优化？HashMap?ArrayList？
 * 2022/04/14 13:19:40
 * 部分正确
 * 	15	编程题	Java (javac)	367 ms
 */
public class Demo100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String oldest_xiaoyou = "";        String oldest_laibing = "";
        int max_temp = Integer.MAX_VALUE;
        //boolean flag = false;
        StringBuilder all_xiaoyou = new StringBuilder();
        String[] all_xiaoyou2 = new String[N];
        int x = 0;
        for (int i = 0; i < N; i++) {
            //拿到最大年纪的校友
            String temp = br.readLine();
            if (Integer.parseInt(temp.substring(6,14))<max_temp){
                max_temp = Integer.parseInt(temp.substring(6,14));
                oldest_xiaoyou = temp;
            }
            //all_xiaoyou.append(temp+"*");
            all_xiaoyou2[i] = temp;
        }

        int M = Integer.parseInt(br.readLine());
        max_temp = Integer.MAX_VALUE;
        //StringBuilder all_laibing = new StringBuilder();
        for (int i = 0; i < M; i++) {
            //拿到最大年纪的来宾
            String temp = br.readLine();
            if (Integer.parseInt(temp.substring(6,14))<max_temp){
                max_temp = Integer.parseInt(temp.substring(6,14));
                oldest_laibing = temp;
            }
            //来宾中有校友，x++
            /*if (all_xiaoyou.toString().contains(temp)){
                x++;
            }*/
            //
            /*for (int j = 0; j < all_xiaoyou2.length; j++) {
                if (all_xiaoyou2[j].equals(temp)){
                    x++;
                    break;
                }
            }*/
            if (Arrays.toString(all_xiaoyou2).contains(temp)){
                x++;
            }
        }

        if (x>0){
            System.out.println(x);
            System.out.println(oldest_xiaoyou);
        }else System.out.println(oldest_laibing);
    }
}
