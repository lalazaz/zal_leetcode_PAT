package Demo1;

import java.math.BigInteger;
import java.util.Scanner;

public class Demo02 {
    //不完美，只拿了19分

    //1002 写出这个数 (20 分)
    //读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger num = new BigInteger(scanner.nextLine());
        //double num = Double.parseDouble(line);
        BigInteger big_10 = new BigInteger("10");
        scanner.close();
        BigInteger test = new BigInteger("0");
        //最终所加的数字
        //int j = 0;
        //System.out.println("test");
        BigInteger j = new BigInteger("0");
        while (true) {
            //double i = 0;
            BigInteger i = new BigInteger("0");
            if (!num.divide(big_10).equals(test)){
                i = num.remainder(big_10);
                j = j.add(i);
                num = num.divide(big_10);
            }if (num.divide(big_10).equals(test)){
                break;
            }/*
            if (num / 10 != 0) {
                i = num % 10;
                j += i;
                num /= 10;
            }
            if (num / 10 == 0) {
                break;
            }*/
        }
        //还要加？
        j = j.add(num);
        int num2 = j.intValue();
        //System.out.println(jieguo);
        //j += num;
        //j是结果，但为数字
        /*System.out.println(j);*/
        //反转数字



        String[] a = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        String result = "";
        while (true){
            //s是num的个位数
            int s = num2 % 10;

            result += a[s]+" ";
            //System.out.print(a[s]+" ");
            num2 /= 10;
            if (num2 % 10 ==0)break;
        }
        //str = str.substring(0, str.length() -1);去掉最后一位
        result = result.substring(0, result.length() -1);
        //System.out.print(result);

        //字符串按照空格分割
        String [] c = result.split("\\s+");
        String result2 = "";
        for (int i = 0;i<c.length;i++){

            result2 += c[c.length-i-1]+" ";
        }
        result2 = result2.substring(0, result2.length() -1);
        System.out.print(result2);
        System.out.println("\n");
    }

}
