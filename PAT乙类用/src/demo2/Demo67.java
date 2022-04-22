package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/29 18:58
 * 1067 试密码 (20 分)
 * 2022/03/29 19:11:30
 * 答案正确
 * 	20	编程题	Java (javac)	86 ms
 **/
public class Demo67 {
    public static void main(String[] args) throws IOException {
        String correct;
        int max_error;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("\\s+");
        correct = split[0];max_error = Integer.parseInt(split[1]);
        int i = 0;
        String temp = "";
        for (; i < max_error; i++) {
            temp = br.readLine();
            if (temp.equals("#")){
                break;
            }
                if (!temp.equals(correct)) System.out.println("Wrong password: "+temp);
                else {
                    System.out.println("Welcome in");
                    break;
            }
        }
        if (i == max_error&&!temp.equals(correct)){
            System.out.println("Account locked");
        }
        br.close();
    }
}
