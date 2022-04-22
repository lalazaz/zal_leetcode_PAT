package demo1;

import java.util.Scanner;
import java.util.regex.Pattern;

//2022/03/10 16:31:19  答案正确	 15	编程题	Java (javac)	138 ms
/**
 * @Date 2022/3/10 15:47
 **/
public class Demo31 {
    public static void main(String[] args) {
        int[] pows = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        String[] strings = {"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
        int test = 0;

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            int pow = 0;
            String line = scanner.nextLine();
            //前十七位数字拿出来，最后一位拿到
            String substring = line.substring(0, line.length() - 1);
            String laststring = line.substring(line.length() - 1, line.length());
            if (isInteger(substring)){
/*                System.out.println(substring);
                System.out.println(laststring);*/
                char[] chars = substring.toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    pow += Integer.parseInt(String.valueOf(chars[j])) * pows[j];
                    //System.out.println(chars[j]+"   "+pows[j]);
                }
                //System.out.println("前十七位乘权重一共为："+pow);
                int mo = pow % 11;
                if (!strings[mo].equals(laststring)){
                    test++;
                    System.out.println(line);
                }
            }else {
                test++;
                System.out.println(line);
            }
        }
        if (test == 0){
            System.out.println("All passed");
        }
    }

    //    判断字符串是否为整数
    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }
}
