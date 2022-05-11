package demo;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.Callable;

//@Date 2022/4/11 18:02
//66. 加一
public class Demo66 {
    public static void main(String[] args) {
        int[] ints = {0 , 0};
        System.out.println(Arrays.toString(plusOne(ints)));
    }
    public static int[] plusOne(int[] digits) {
        BigInteger bigInteger = new BigInteger(Arrays.toString(digits)
                .replaceAll(", ","")
                .replace("[","")
                .replace("]",""))
                .add((new BigInteger("1")));
        char[] chars = bigInteger.toString().toCharArray();
        int[] res = new int[chars.length];

        for (int i = 0; i < chars.length ; i++) {
            res[i] = chars[i] -48;
        }
        return res;
    }
}
