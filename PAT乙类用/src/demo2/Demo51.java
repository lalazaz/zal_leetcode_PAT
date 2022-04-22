package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/20 13:11
 * 1051 复数乘法 (15 分)
 * 2022/03/20 13:23:55	 答案正确  15	编程题	Java (javac)	92 ms
 **/
public class Demo51 {
    public static void main(String[] args) throws IOException {
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String[] split = line.split("\\s+");
        Double[] nums = new Double[split.length];
        int i = 0;
        for (String s : split) {
            nums[i++] = Double.parseDouble(s);
        }
        double A = nums[0] * nums[2] * Math.cos(nums[1] + nums[3]);
        double B = nums[0] * nums[2] * Math.sin(nums[1] + nums[3]);

        if (Math.abs(A) < 0.01)     //A<0.01时，即为0
            A = 0;
        if (Math.abs(B) < 0.01)
            B = 0;
        if (B < 0) {
            System.out.printf("%.2f", A);
            System.out.printf("-"+"%.2fi", Math.abs(B));
        }else {
            System.out.printf("%.2f", A);
            System.out.printf("+"+"%.2fi", Math.abs(B));
        }

    }
}
