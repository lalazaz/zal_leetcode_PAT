package m_test;

import java.util.Scanner;

public class Demo05_test {
 //题目

    //1005 继续(3n+1)猜想 (25 分)
    //1.接受一个正整数n
    //2.接受n个（正好）待验证的正整数，使用字符串接受
    //2.1把这些正整数用空格分开使用数组test_all[]接受
    //3.得到n的验证过程中的全部数字用数组n_all[]接受
    //4.循环判断test_all[]中元素是否为n_all[]中元素，若不是+" " 打印出来
    public static void main(String[] args) {
        //1.接受一个正整数n
        int n = new Scanner(System.in).nextInt();
        //2.接受n个（正好）待验证的正整数，使用字符串接受
        String line = new Scanner(System.in).nextLine();
        //2.1把这些正整数用空格分开使用数组test_all[]接受
        //字符串按照空格分割
        String[] test_all = line.split("\\s+");
        //2.2关闭scanner
        //3.计算n的卡拉兹猜想验证过程中的全部数字用字符串形式+" "接受
        //temp是不断进行猜想过程得到的结果
        int temp = 0;
        StringBuilder test_all_string = new StringBuilder();
        while (true){
            //经行砍一半操作
            if (n == 1){
                break;
            }else {
                //先判断奇偶，偶数不变，奇数(3n+1)
                if (n % 2 !=0){
                    n = 3*n+1;
                }
                n /= 2;
                temp = n;
                //用字符串接受temp+“ ”
                test_all_string.append(temp).append(" ");
            }
        }
        System.out.println(test_all_string);
        //3.1按照空格分开用数组n_all[]接受

        //4.循环判断test_all[]中元素是否为n_all[]中元素，若不是+" " 打印出来
    }
}

