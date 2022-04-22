package demo1;

import java.util.Scanner;
//2022/02/21 08:40:48
//答案正确
//	20	编程题	Java (javac)	102 ms
public class Demo09 {
    //1009 说反话 (20 分)
    //给定一句英语，要求你编写程序，将句中所有单词的顺序颠倒输出。——好简单😎

    //1.接受一行不超过80的字符串，（都单词构成，且单词之间由空格隔开）
    //2.将字符串按照空格分割，由String【】的数组接受
    //3.反向输入凭借一个新的字符串，空格间隔，最后一个单词后面没有空格
    public static void main(String[] args) {
        //1.接受一行不超过80的字符串，（都单词构成，且单词之间由空格隔开）
        String line = new Scanner(System.in).nextLine();
        //2.将字符串按照空格分割，由String【】的数组接受
        String[] split = line.split("\\s+");
        //3.反向输入凭借一个新的字符串，空格间隔，最后一个单词后面没有空格
        String[] strings = new String[split.length];
        int j = 0;
        int i = 0;
        for (i = split.length; i > 0 ; i--) {
           strings[j++]  = split[i-1] + " ";
        }
        strings[j-1] = split[0];
        for (String s : strings) {
            System.out.print(s);
        }


    }
}
