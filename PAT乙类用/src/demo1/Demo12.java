package demo1;

import java.util.Scanner;

//2022/02/22 09:04:50	部分正确  19	编程题	Java (javac)	184 ms
public class Demo12 {
    //1012 数字分类 (20 分)
//    给定一系列正整数，请按要求对数字进行分类，并输出以下 5 个数字：
//    A1 = 能被 5 整除的数字中所有偶数的和；
//    A2 = 将被 5 除后余 1 的数字按给出顺序进行交错求和，即计算 n1−n2+n3−n4⋯；
//    A3 = 被 5 除后余 2 的数字的个数；
//    A4 = 被 5 除后余 3 的数字的平均数，精确到小数点后 1 位；
//    A5 = 被 5 除后余 4 的数字中最大数字。

    public static void main(String[] args) {
        //1.接受第一个整数
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        //2.接受剩余的一些列数字
        int[] ints = new int[N];
        while (N-- != 0){
            int i = scanner.nextInt();
            ints[ints.length - N -1] = i ;
        }
        scanner.close();
        //得到的intS[]即为我们需要判断的N位数据
        //  进行A1——A5的判断
        int A1 = 0,A2 = 0,A3 = 0,A5 = 0;
        double A4 = 0.0;
        //A2用
        int j = -1;
        //A3用
        int count = 0;
        //A4用
        int count2 = 0;
        double sum = 0;
        for (int i = 0; i < ints.length; i++) {


            //    A1 = 能被 5 整除的数字中所有偶数的和；
            if (ints[i] % 5 == 0 && ints[i] % 2 == 0){
                A1 += ints[i];
            }
            //    A2 = 将被 5 除后余 1 的数字按给出顺序进行交错求和，即计算 n1−n2+n3−n4⋯；

            if (ints[i] % 5 == 1){
                int temp = 0;
                j = j*(-1);
                temp = ints[i] * j;
                A2 += temp;
            }
            //    A3 = 被 5 除后余 2 的数字的个数；
            if (ints[i] % 5 == 2){
                count++;
                A3 = count;
            }
            //    A4 = 被 5 除后余 3 的数字的平均数，精确到小数点后 1 位；

            if (ints[i] % 5 == 3){
                count2++;
                sum += ints[i];
                A4 = sum / count2;
            }
            //    A5 = 被 5 除后余 4 的数字中最大数字。
            if (ints[i] % 5 == 4){
                if (A5 < ints[i]){
                    A5 = ints[i];
                }
            }
        }

        //按照A1——A5顺序输出
        if (A1 == 0){
            System.out.print('N'+" ");
        }else System.out.print(A1+" ");
        if (A2 == 0){
            System.out.print('N'+" ");
        }else System.out.print(A2+" ");
        if (A3 == 0){
            System.out.print('N'+" ");
        }else System.out.print(A3+" ");
        if (A4 == 0){
            System.out.print('N'+" ");
        }else {
            //保留一位小数
            String str1 = String.format("%.1f",A4);
            System.out.print(str1+" ");
        }
        if (A5 == 0){
            System.out.print('N');
        }else System.out.print(A5);
    }
}
