package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/27 11:07
 * 1062 最简分数 (20 分)
 * 2022/03/27 12:05:05
 * 答案正确
 * 	20	编程题	Java (javac)	108 ms
 *
 * 	。。看的柳神代码
 **/
public class Demo62 {
    public static void main(String[] args) throws IOException {
        int n1, m1, n2, m2, k;
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String[] split = line.split("\\s+");
        n1 = Integer.parseInt(split[0].split("/")[0]);
        m1 = Integer.parseInt(split[0].split("/")[1]);
        n2 = Integer.parseInt(split[1].split("/")[0]);
        m2 = Integer.parseInt(split[1].split("/")[1]);
        k = Integer.parseInt(split[2]);
        if (n1*m2 > n2 * m1) {
            int temp = 0;
            temp = n1;n1 = n2;n2 = temp;
            temp = m1;m1 = m2;m2 = temp;
        }
        int num = 1;
        boolean flag = false;
        while (n1 * k >= m1 * num) num++;
        while (n1 * k < m1 * num && m2 * num < n2 * k){
            if (Gcd(num,k) == 1){
                System.out.print(flag?" ":"");
                System.out.print(num+"/"+k);
                flag = true;
            }
            num++;
        }
    }
    static long Gcd(long a, long b) {
        return (a % b == 0) ? b : (Gcd(b, a % b));
    }
}
