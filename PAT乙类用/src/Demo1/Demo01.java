package Demo1;

import java.util.Scanner;

public class Demo01 {
    //对给定的任一不超过 1000 的正整数 n，简单地数一下，奇数(3n+1)偶数直接砍..需要多少步（砍几下）才能得到 n=1？
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("请输入你想要砍的数字：");
        String line = scanner.next();
        scanner.close();
        int num = Integer.parseInt(line);
        int step = 0;
        while (true){
            //经行砍一半操作
            if (num == 1){
                break;
            }else {
                //先判断奇偶，偶数不变，奇数(3n+1)
                if (num % 2 !=0){
                    num = 3*num+1;
                }

                num /= 2;
                step++;
            }
        }
        System.out.println(step);
    }
}
