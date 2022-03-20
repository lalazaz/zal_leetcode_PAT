package Demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/13 18:41
 * 1039 到底买不买 (20 分)
 * 2022/03/13 19:10:03	 部分正确  14	编程题	Java (javac)	150 ms
 * 又超时   感觉要转CPP了
 **/
public class Demo39 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        int l1 = line1.length();
        //StringBuilder stringBuilder = new StringBuilder(line1);
        String line2 = br.readLine();
        br.close();
        int l2 = line2.length();
        char[] chars = line2.toCharArray();
        int i = 0; int miss = 0;
        for (; i < chars.length; i++) {
            String temp = String.valueOf(chars[i]);
            if (line1.contains(temp)){
                line1 = line1.replaceFirst(temp,"");
            }else {
                miss++;
            }
        }
        if (miss == 0){
            System.out.println("Yes "+(l1 - l2));
        }else {
            System.out.println("No "+miss);
        }
    }
}
