package Demo1;

import java.util.Scanner;
//2022/02/21 09:47:56	部分正确  19  	编程题	Java (javac)	104 ms
public class Demo10 {
    //1010 一元多项式求导 (25 分)
    //设计函数求一元多项式的导数。（注：xn（n为整数）的一阶导数为nxn−1。）
    public static void main(String[] args) {
        //1.接受偶数次非零项系数和指数
        String line = new Scanner(System.in).nextLine();
        //2.按空格分割转为字符串数组【】形式
        String[] split = line.split("\\s+");
        int[] ints = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            ints[i] = Integer.parseInt(split[i]);
        }

        //3.此数组长度除以2即为要求的多元项个数，也即位我们要循环的次数 用j表示
         int j = split.length/2;
        int p = split.length/2;
        //4.进入循环，每两个数一次
            //考虑到最后一个数字后面不能有空格，则我们使用一个字符串来接受结果，然后去掉最后一个空格
        String result = "";

        while (j != 0){
            //每次循环只使用两个数字，用一个新的数组，长度为2 接受
            int[] temp_ints = new int[2];
            for (int k = 0; k < 2; k++) {
                temp_ints[k] = ints[(p - j)*2+k];
            }
            //4.1第二个数为1或者0则是特殊情况
            if (temp_ints[1] == 1){
                //System.out.print(temp_ints[0] + " ");
                result += temp_ints[0] + " ";
                result += 0 + " ";
            }else if (temp_ints[1] == 0){
                //System.out.print(0+" ");
                //result += 0+" ";
            }
           //System.out.println("此时temp_ints[k]就是我么们要进行判断的多项式两个数字");
            /* for (int i : temp_ints) {
                System.out.print(i);
            }*/
            //System.out.println("\n======");

            //4.2其他情况则直接进行正常的多项式求导
            else {
/*                System.out.print(temp_ints[0] * temp_ints[1]+" ");
                System.out.print(temp_ints[1]-1 + " ");*/
                result += temp_ints[0] * temp_ints[1] + " ";
                result += temp_ints[1] -1 + " ";
            }

            j--;
        }
        String substring = "";
        if (result.length()!=0){
            substring = result.substring(0, result.length() - 1);
        }
        System.out.println(substring);
    }
}
