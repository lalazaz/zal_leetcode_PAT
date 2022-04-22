package demo1;

import java.util.Scanner;

//2022/02/24 14:14:20	答案错误   0	编程题	Java (javac)	88 ms
//不知道哪里错了，我在IDEA里面测试都没问题
//2022/02/24 16:44:14	部分正确  15	编程题	Java (javac)	126 ms
//把上面的package去掉
public class Demo19 {
    //1019 数字黑洞 (20 分)
    //1.接受给出一个 (0,10000) 区间内的正整数 N
    //2.使用取余除法操作取出其各项数字   抓装整形数组中
    //3.进行输出操作
    //若该数字4位数字全相等，则输出N - N = 0000；
    //若该数字不全相等则进入无限循环，直到  .. 6174  打印出每一步的步骤
    public static void main(String[] args) {
        //1.接受给出一个 (0,10000) 区间内的正整数 N
        int N = new Scanner(System.in).nextInt();
        //2.使用取余除法操作取出其各项数字   放入整形数组中
        int[] ints = fuzhi(N);

        //3.进行输出操作
        //若该数字4位数字全相等，则输出N - N = 0000；
        if (ints[0] == ints[1] && ints[1] == ints[2] && ints[2] == ints[3]) {
            System.out.println(N + " - " + N + " = " + "0000");
        }
        //若该数字不全相等则进入无限循环，直到  .. 6174  打印出每一步的步骤
        else {
            while (true) {
                //我们现在有了存有的四个不相等的数字的数组——ints[]
                if (ints[0]==6 && ints[1]==1 && ints[2]==7 && ints[3]==4){
                    break;
                }else {
                    int[] A_ints = bubble(ints);
                    int[] B_ints = new int[4];
                    int m = 3;
                    for (Integer integer : A_ints) {
                        B_ints[m] = integer;
                        m--;
                    }

            /*for (int i = 0; i < A_ints.length; i++) {
                System.out.println(A_ints[i]);
            }
            for (int i = 0; i < A_ints.length; i++) {
                System.out.println(B_ints[i]);
            }*/
                    //现在要进行大的减去小的
                    int temp_max = A_ints[0] * 1000 + A_ints[1] * 100 + A_ints[2] * 10 + A_ints[3];
                    int temp_min = B_ints[0] * 1000 + B_ints[1] * 100 + B_ints[2] * 10 + B_ints[3];
                    // 打印至控制台
                    int num = temp_max - temp_min;
                    String temp_max2;
                    String temp_min2;
                    if (temp_max<1000){
                         temp_max2 = "0"+temp_max;
                    }else temp_max2 = temp_max+"";
                    if (temp_min<1000){
                        temp_min2 = "0"+temp_min;
                    }else temp_min2 = temp_min+"";
                    System.out.println(temp_max2 + " - " + temp_min2 + " = " + num);
                    // 重新赋值给数组
                    ints = fuzhi(num);
                }
            }
        }


        /*//测试冒泡排序
        int[] ints1 = new int[4];
        ints1[0] = 2;
        ints1[1] = 1;
        ints1[2] = 7;
        ints1[3] = 412;

        int[] bubble = bubble(ints1);
        for (Integer l : bubble) {
            System.out.println(l);
        }*/
    }

    public static int[] bubble(int[] ints2) {
        for (int i = 0; i < ints2.length - 1; i++) {
            for (int j = 0; j < ints2.length - 1 - i; j++) {
                if (ints2[j] < ints2[j + 1]) {
                    int temp = ints2[j];
                    ints2[j] = ints2[j + 1];
                    ints2[j + 1] = temp;
                }
            }
        }
        return ints2;
    }

    public static int[] fuzhi(int P) {
        int[] ints3 = new int[4];
        ints3[0] = P / 1000;
        ints3[1] = (P - ints3[0] * 1000) / 100;
        ints3[2] = (P - ints3[0] * 1000 - ints3[1] * 100) / 10;
        ints3[3] = P % 10;
        return ints3;
    }
}
