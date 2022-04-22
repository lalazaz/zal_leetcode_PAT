package demo1;

import java.util.Scanner;
//2022/02/22 16:28:39	部分正确    16	编程题	Java (javac)	200 ms
public class Demo13 {
    //1013 数素数 (20 分)
    //令 Pi 表示第 i 个素数。现任给两个正整数 M≤N≤104，请输出 PM 到 PN 的所有素数。

    //1.接受输入的两个整数M，N，且M < N
    //2.用数组 primes[]储存N个素数（从零开始递增）
    //3.从M-1下表开始打印出primes[]数组元素，且每10个一行
    public static void main(String[] args) {
        //1.接受输入的两个整数M，N，且M < N
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        //2.用数组 primes[]储存N个素数（从零开始递增）
        int[] primes = new int[N];
        primes[0] = 2;
        int p = 1;
        for (int i = 3; true; i++) {

            //i是我们要进行判断的数字
            int j = 2;
            for (; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                N--;
                primes[p++] = i;
            }

            if (N == 1) break;
        }
        /*for (int i : primes) {
            System.out.print(i + "  ");
        }*/
        //3.从M-1下表开始打印出primes[]数组元素，且每10个一行
        int h = 0;
        for (int i = M - 1; i < primes.length; i++) {
            if (h == 10) {
                System.out.println("");
                h = 0;
            }
            //不加空格输出
            if (i % 10 == M-2 || i == primes.length-1){
                System.out.print(primes[i]);
            }else System.out.print(primes[i] + " ");
            h++;
        }
    }
}

