package demo1;

import java.math.BigInteger;
import java.util.Scanner;

//2022/02/21 14:32:55	答案正确	  15	编程题	Java (javac)	110 ms

public class Demo11 {
    //1011 A+B 和 C (15 分)
    //给定区间 [−231,231] 内的 3 个整数 A、B 和 C，请判断 A+B 是否大于 C。
    public static void main(String[] args) {
        //1.接受第一行输入的整数
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        //2.循环T次数接受后面输入的数字
            //temp是T次循环判断的字符串
        int j =0 ;
        while (T-- != 0){

            //数字依次是A，B，C,考虑有大整数存在，则我们用字符串接受，然后通过空格分割转为bigNumber
            BigInteger A = scanner.nextBigInteger();
            BigInteger B = scanner.nextBigInteger();
            BigInteger C = scanner.nextBigInteger();
            //此时我们则得到了ABC；
            /*System.out.print(A);
            System.out.print(B);
            System.out.print(C);*/
            //经行判断直接输出
            if(A.add(B).compareTo(C) == 1){
                j++;
                System.out.println("Case #"+j+": true");
            }else{
                j++;
                System.out.println("Case #"+j+": false");
            }
        }

    }
}
