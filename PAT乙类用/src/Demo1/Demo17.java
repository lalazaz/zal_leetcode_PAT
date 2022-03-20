package Demo1;

import java.math.BigInteger;
import java.util.Scanner;

//运行超时了，但在过程没有问题
public class Demo17 {
    //1017 A除以B (20 分)
    public static void main(String[] args) {
        //123456789050987654321  7
        //接受一行字符串   分割  第一个字符用大整数接受   第二个用int接受
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        //long startTime = System.currentTimeMillis();
        String[] split = line.split("\\s+");
        BigInteger bigInteger = new BigInteger(split[0]);
        BigInteger i = new BigInteger(split[1]);

        BigInteger bigInteger1 = bigInteger.divide(i);
        System.out.print(bigInteger1+" ");
        System.out.print(bigInteger.mod(i));
        //long endTime = System.currentTimeMillis();

        //float seconds = (endTime - startTime);
        //System.out.println("");
        //System.out.println(Float.toString(seconds) + "毫秒");
    }
}



