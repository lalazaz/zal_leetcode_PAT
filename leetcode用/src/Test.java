//@Date 2022/4/11 19:11

import javax.naming.BinaryRefAddr;
import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        System.out.println(toshi("100000000000000000000000000000000000000000000000000000000000000000000"));
        System.out.println("100000000000000000000000000000000000000000000000000000000000000000000");
        System.out.println(toer("9223372036854775807"));
    }

    public static String addBinary(String a, String b) {
        return toer(new BigInteger(toshi(a)).add(new BigInteger(toshi(b))).toString());
    }

    //写一个二进制字符串转十进制
    //会溢出
    //BigInteger请求出战
    //为什么，最多只能转到    2147483647     有一个int
    public static String toshi(String s) {
        char[] chars = s.toCharArray();
        //long res = 0;
        BigInteger res = new BigInteger("0");
        for (int i = 0; i < s.length(); i++) {
            //这里有一个int
            BigInteger temp2 = new BigInteger((long)Math.pow(2, i) + "");
            //String substring = temp2.toString().substring(0, temp2.toString().indexOf("."));

            BigInteger temp = (new BigInteger(temp2+"")
                    .multiply(new BigInteger((chars[s.length() - i - 1] - 48) + "")));
            //System.out.println(temp.toString());
            res = res.add(new BigInteger(temp.toString()/*.substring(0,temp.toString().indexOf("."))*/));
            //res+=Math.pow(2,i)*(chars[s.length()-i-1]-48);
        }
        return res.toString();
    }

    //十进制转二进制
    public static String toer(String s) {
        if (s.equals("0")) return "0";
        BigInteger bigInteger = new BigInteger(s);
        BigInteger x = new BigInteger("2");
        StringBuilder sb = new StringBuilder();
        while (!(bigInteger.toString().equals("0"))) {
            sb.append(bigInteger.mod(x));
            bigInteger = bigInteger.divide(x);
        }
        return sb.reverse().toString();
    }
}
