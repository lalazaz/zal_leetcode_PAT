package Demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/13 19:28
 * 1040 有几个PAT (25 分)
 **/
public class Demo40 {
    static long P_num = 0;
    static long A_num = 0;
    static long sum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        br.close();
        char[] chars = line.toCharArray();
        //找到最后一个T
        int index = line.lastIndexOf("T");
        if (index < 2) {
            System.out.println(0);
        }
        for (int i = 0; i <= index; i++) {
            if (chars[i] == 'P') {
                P_num++;
            }
            if (chars[i] == 'A') {
                A_num += P_num;
            }
            if (chars[i] == 'T') {
                sum += A_num;
            }
        }
        //System.out.println(index);
        System.out.println(sum % 1000000007);
        //System.out.println(sum);
        //System.out.println(index);
    }
}
