package Demo1;

import java.util.Scanner;
//2022/02/16 22:03:57	部分正确   18	编程题	Java (javac)	200 ms
//5  运行超时   0
public class Demo07 {
    //1007 素数对猜想 (20 分)

    //1.接受输出的正整数n
    //2.在2到接受的n-1之间循环，求出素数对中较小的素数a
    //3.在2的基础上判断a+2是否也为素数,若成立的话则count++
    //4.返回count
    public static void main(String[] args) {
        int count = 0;
        //1.接受输出的正整数n
        int n = new Scanner(System.in).nextInt();
        //2.在3至接受的n之间循环，求出第count++个 素数对中较小的素数a

        for (int i = 3; i < n -1; i++) {
            //此刻i即是我们要判断的素数
                //a = i + 2也是我们要判断的素数
            int a = i+2;
            int j = 0;

            for (j = 2; j  < i ; j++) {
                if (i % j ==0){
                    break;
                }
                if (a % j == 0){
                    break;
                }
            }



            if (j == i){
                //则从2到j，i没有因子，可以确定i是素数
                //3.在2的基础上判断i+2是否也为素数,若成立的话则count++
                int k = 0;
//                if (a % (i + 2) != 0){
//
//                }
                count++;
//                for (k = 2; k < a; k++) {
//                    if (a % k ==0){
//                        break;
//                    }
//                }
//                if (a == k){
//                    //则a = i+2也是素数
//
//                }
            }
        }

        //4.返回count
        System.out.println("共有素数对为:"+count);
    }
}
