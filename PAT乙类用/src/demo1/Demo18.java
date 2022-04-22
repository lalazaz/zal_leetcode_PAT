package demo1;

import java.util.Scanner;
//2022/02/23 22:17:16	部分正确  18	编程题	Java (javac)	200 ms
//最后一个运行超时，不知道怎么改
public class Demo18 {
    //1018 锤子剪刀布 (20 分)
    //1.接受第一行的次数N
    //2.N个循环进入判断
    //每个循环三种情况  甲胜  乙胜  平  统计他们的次数
    //其中记录甲胜使用的最多手势   乙胜最多的手势   （多解则按照字母序输出最小的解）
    public static void main(String[] args) {
        //1.接受第一行的次数N
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        //2.N个循环进入判断

        //规定甲胜利次数为1，乙胜利为M2 平为P
        int M1 = 0;
        int M2 = 0;
        int P = 0;
        //。。如下规定胜利方式
        int M1_C = 0;
        int M1_B = 0;
        int M1_J = 0;
        int M2_C = 0;
        int M2_B = 0;
        int M2_J = 0;


        while (N-- != 0) {
            //每次循环接受控制台的输入————两个字符
            String jia = scanner.next();
            String yi = scanner.next();
            //每个循环三种情况  甲胜  乙胜  平  统计他们的次数
            //其中记录甲胜使用的最多手势   乙胜最多的手势   （多解则按照字母序输出最小的解）

            if (jia.equals("C")&&yi.equals("J")||jia.equals("B")&&yi.equals("C")||jia.equals("J")&&yi.equals("B")) {
                //甲胜利了，统计次数
                M1++;
                switch (jia){
                    case "C":M1_C++;break;
                    case "B":M1_B++;break;
                    case "J":M1_J++;break;
                }
            } else if (jia.equals(yi)) {
                P++;
            } else if (yi.equals("C")&&jia.equals("J")||yi.equals("B")&&jia.equals("C")||yi.equals("J")&&jia.equals("B")) {
                M2++;
                switch (yi){
                    case "C":M2_C++;break;
                    case "B":M2_B++;break;
                    case "J":M2_J++;break;
                }
            }
        }
        //此时循环结束，我们也得到了个自己的结果
        System.out.println(M1+" "+ P +" "+M2);
        System.out.println(M2+" "+ P +" "+M1);
        //打印出各自最多胜率的方法（若有相同..）
        /*System.out.println(Math.max(Math.max(M1_B,M1_C),M1_J)+" "+Math.max(Math.max(M2_B,M2_C),M2_J));*/

        //先甲
        int max1  = Math.max(Math.max(M1_B,M1_C),M1_J);
        if (max1 == M1_B){
            System.out.print('B'+" ");
        }else if (max1 == M1_C){
            System.out.print('C'+" ");
        }else if (max1 == M1_J){
            System.out.print('J'+" ");
        }
        //后乙
        int max2  = Math.max(Math.max(M2_B,M2_C),M2_J);
        if (max2 == M2_B){
            System.out.print('B');
        }else if (max2 == M2_C){
            System.out.print('C');
        }else if (max2 == M2_J){
            System.out.print('J');
        }

    }
}
