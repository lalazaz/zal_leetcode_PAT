package demo1;

import java.util.Scanner;
//2022/02/17 09:31:20	答案正确
//	15	编程题	Java (javac)	111 ms

/**
 * 如果部分正确的话再读一遍题目，可能有特殊情况或者没有明白题意
 */
public class Demo06 {
    //1006 换个格式输出整数 (15 分)
/*    输入样例 1：           234
      输出样例 1：       BBSSS1234  */

    //1.接受一个输入的数字n
    //2.经行循环——不断减去值  100   10 每减一个打出对应字母（  B   S）
    // 3.剩下个位（即小于10的数字）m,进入另一个简单的循环打出数字
    public static void main(String[] args) {
        //1.接受一个输入的数字n
        int n = new Scanner(System.in).nextInt();
        //2.经行循环——不断减去值  100   10 每减一个打出对应字母（  B   S）
            //原则是大于100 减去100小于100大于10减去10
        while (n >= 10){
            while (n >= 100){
                n -=100;
                System.out.print('B');
            }
            if (n >=10) {
                n -= 10;
                System.out.print('S');
            }
        }
        // 3.剩下个位（即小于10的数字）m,进入另一个简单的循环打出数字
            //是反向输入的
        int k = 1;
        while (k <= n){
            System.out.print(k);
            k++;
        }
        System.out.println();
    }
}
