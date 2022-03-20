package Demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2022/02/24 19:59:07	答案正确	  15	编程题	Java (javac)	80 ms
//1021 个位数统计 (15 分)
//1.接受一个不超过1000位的正整数N(字符串接受)
//2.每一位分割，放入字符数组中
//3.使用switch统计每一个数字出现的次数 ———— 放到一个长度位10的整形数组中
//4.不为0则打印出来
public class Demo21 {
    public static void main(String[] args) throws IOException {
        //1.接受一个不超过1000位的正整数N(字符串接受)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        //2.每一位分割，放入字符数组中
        char[] chars = N.toCharArray();
        //3.遍历chars[] 使用switch统计每一个数字出现的次数 ———— 放到一个长度位10的整形数组中
        int num_0 = 0;
        int num_1 = 0;
        int num_2 = 0;
        int num_3 = 0;
        int num_4 = 0;
        int num_5 = 0;
        int num_6 = 0;
        int num_7 = 0;
        int num_8 = 0;
        int num_9 = 0;
        for (Character c : chars) {
            switch (c) {
                case '0':
                    num_0++;
                    break;
                case '1':
                    num_1++;
                    break;
                case '2':
                    num_2++;
                    break;
                case '3':
                    num_3++;
                    break;
                case '4':
                    num_4++;
                    break;
                case '5':
                    num_5++;
                    break;
                case '6':
                    num_6++;
                    break;
                case '7':
                    num_7++;
                    break;
                case '8':
                    num_8++;
                    break;
                case '9':
                    num_9++;
                    break;
            }
        }
        //4.不为0则从0——9打印出来
        if (num_0 != 0) {
            System.out.println("0:" + num_0);
        }
        if (num_1 != 0) {
            System.out.println("1:" + num_1);
        }
        if (num_2 != 0) {
            System.out.println("2:" + num_2);
        }
        if (num_3 != 0) {
            System.out.println("3:" + num_3);
        }
        if (num_4 != 0) {
            System.out.println("4:" + num_4);
        }
        if (num_5 != 0) {
            System.out.println("5:" + num_5);
        }
        if (num_6 != 0) {
            System.out.println("6:" + num_6);
        }
        if (num_7 != 0) {
            System.out.println("7:" + num_7);
        }
        if (num_8 != 0) {
            System.out.println("8:" + num_8);
        }
        if (num_9 != 0) {
            System.out.println("9:" + num_9);
        }
    }
}
