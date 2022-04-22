package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * @Date 2022/3/23 9:20
 * 2022/03/23 10:15:28	 部分正确  18	编程题	Java (javac)	400 ms
 * 测试点2超时
 **/
public class Demo53 {
    public static void main(String[] args) throws IOException {
        DecimalFormat decimalFormat = new DecimalFormat("0.0%");
        /*String format = decimalFormat.format(0.2);*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("\\s+");
        int N = Integer.parseInt(split[0]), D = Integer.parseInt(split[2]);
        int N1 = N;
        double e = Double.parseDouble(split[1]);
        int may_empty = 0;
        int empty = 0;
        while (N-- != 0) {
            int low_days = 0;
            String[] temp = br.readLine().split("\\s+");
            int days = Integer.parseInt(temp[0]);
            for (int i = 1; i < temp.length; i++) {
                if (e > Double.parseDouble(temp[i])) {
                    //System.out.print(Double.parseDouble(temp[i]));
                    low_days++;
                }
                //System.out.println("");
            }//System.out.println(low_days);
            //System.out.println(Math.round((days+0.0)/2));
            //System.out.println("Test");


            if (low_days+0.0 > ((days+0.0)/2)){
                //System.out.println(((days+0.0)/2));
                /*may_empty++;
                if (days > D){
                    may_empty--;
                    empty++;
                }*/
                int i = days > D ? empty++ : may_empty++;
            }


        }
        br.close();

        System.out.print(decimalFormat.format((may_empty+0.0) / N1)+" ");
        System.out.println(decimalFormat.format((empty+0.0) / N1));
    }
}
