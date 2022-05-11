//1006 Sign In and Sign Out (25 分)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zal
 * @date 2022/4/20 13:02
 * 2022/04/20 13:08:16
 * 答案正确
 * 	25	编程题	Java (javac)	88 ms
 */
public class Demo06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String rearlyest = "";
        String latest = "";
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split("\\s+");
            if (Integer.parseInt(split[1].replaceAll(":", "")) < min) {
                rearlyest = split[0];
                min = Integer.parseInt(split[1].replaceAll(":", ""));
            }
            if (Integer.parseInt(split[2].replaceAll(":", "")) > max) {
                latest = split[0];
                max = Integer.parseInt(split[2].replaceAll(":", ""));
            }
        }
        System.out.println(rearlyest+" "+latest);
    }
}
