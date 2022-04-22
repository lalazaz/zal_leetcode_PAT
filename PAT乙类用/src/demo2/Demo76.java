package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/4/3 16:34
 * 1076 Wifi密码 (15 分)
 * 2022/04/03 16:40:01
 * 答案正确
 * 	15	编程题	Java (javac)	86 ms
 **/
public class Demo76 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String stings = "ABCD";
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            int index = temp.indexOf('T');
            char c = temp.charAt(index - 2);
            System.out.print(stings.indexOf(c+"")+1);
        }
        System.out.println("");
        br.close();
    }
}
