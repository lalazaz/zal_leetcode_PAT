package demo;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Date 2022/3/24 8:51
 * 2022/03/24 09:13:20 部分正确  21	编程题	Java (javac)	149 ms
 *
 * 这个基础上加了一个限制double精度的格式测试点2通过
 *
 * 在以上基础上又加了一个判断是否为空的格式，若为空则输出0，测试点6通过
 *
 * 2022/03/24 09:41:44	 答案正确  25	编程题	Java (javac)	153 ms
 **/
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");

        int K1 = scanner.nextInt();
        //Double[] res = new Double[1001];
        double[] res = new double[1001];
        for (int i = 0; i < K1; i++) {
            int index = scanner.nextInt();
            double nums = scanner.nextDouble();
            res[index]+=nums;
        }
        int K2 = scanner.nextInt();
        for (int i = 0; i < K2; i++) {
            int index = scanner.nextInt();
            double nums = scanner.nextDouble();
            res[index]+=nums;
        }
        int p = 0;
        String res2 = "";
        for (int i = res.length-1; i >= 0; i--) {
            if (res[i] != 0.0){
                p++;
                //System.out.println(res[i]);
                res2 += i+" "+decimalFormat.format(res[i])+" ";
            }
        }
        if (res2.length()==0){
            System.out.println(0);
        }else {
            System.out.println(p+" "+res2.substring(0,res2.length()-1));
        }
    }
}
