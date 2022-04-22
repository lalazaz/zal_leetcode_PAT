package demo1;

import java.util.Scanner;

//2022/02/23 20:52:11	答案正确	  15	编程题	Java (javac)	106 ms
public class Demo16 {
    //1016 部分A+B (15 分)
    public static void main(String[] args) {
        //接受输入的四个数字
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int DA = scanner.nextInt();
        int B = scanner.nextInt();
        int DB = scanner.nextInt();
        System.out.println(M_shiliu(A,DA)+M_shiliu(B,DB));
        scanner.close();
    }

    //一个方法，接受两个整数A  DA
    public static int M_shiliu(int num,int D_num){
        int res = 0;
        int m_num = num;
        String num_len = num+"";
        int L = num_len.length();
        //将num转整形数组
        int[] ints = new int[L];
        int temp = 0;
        int i = -1;
        do {
            ints[++i] = m_num % 10;
            m_num /= 10;
        }
        while (m_num >= 10);
        ints[++i] = m_num;
        //遍历该数组，若其中有D_num元素，则结果 res加上其10倍（第一次是0）
        int k = 0;
        for (Integer j : ints) {
            if (j == D_num){
                res+=Math.pow(10,k)*D_num;
                k++;
            }
        }
        //返回该res
        return  res;
    }
}
