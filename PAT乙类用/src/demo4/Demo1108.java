package demo4;
//1108 String复读机 (20 分)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zal
 * @date 2022/4/16 18:04
 *
 * 2022/04/16 19:06:24
 * 答案正确
 * 	20	编程题	Java (javac)	150 ms
 */
public class Demo1108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        char[] chars = line.toCharArray();
        int i1 = 0;        int i2 = 0;        int i3 = 0;        int i4 = 0;        int i5 = 0;        int i6 = 0;
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i]+"").equals("S"))i1++;
            if ((chars[i]+"").equals("t"))i2++;
            if ((chars[i]+"").equals("r"))i3++;
            if ((chars[i]+"").equals("i"))i4++;
            if ((chars[i]+"").equals("n"))i5++;
            if ((chars[i]+"").equals("g"))i6++;
        }
        while (i1!=0||i2!=0||i3!=0||i4!=0||i5!=0||i6!=0){
            if (i1>0) {
                System.out.print("S");
                i1--;
            }
            if (i2>0) {
                System.out.print("t");
                i2--;
            }
            if (i3>0) {
                System.out.print("r");
                i3--;
            }
            if (i4>0) {
                System.out.print("i");
                i4--;
            }
            if (i5>0) {
                System.out.print("n");
                i5--;
            }
            if (i6>0) {
                System.out.print("g");
                i6--;
            }

        }


        /*while (line.contains("S") || line.contains("t") || line.contains("r")
                || line.contains("i") || line.contains("n") || line.contains("g")) {
            if (line.contains("S")) {
                System.out.print("S");
                line = line.replaceFirst("S", "");
            }
            if (line.contains("t")) {
                System.out.print("t");
                line = line.replaceFirst("t", "");
            }
            if (line.contains("r")) {
                System.out.print("r");
                line = line.replaceFirst("r", "");
            }
            if (line.contains("i")) {
                System.out.print("i");
                line = line.replaceFirst("i", "");
            }
            if (line.contains("n")) {
                System.out.print("n");
                line = line.replaceFirst("n", "");
            }
            if (line.contains("g")){
                System.out.print("g");
                line = line.replaceFirst("g","");
            }
        }*/
    }
}
