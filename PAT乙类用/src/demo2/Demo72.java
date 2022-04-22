package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/4/1 13:18
 * 1072 开学寄语 (20 分)
 * 2022/04/01 13:36:13
 * 答案正确
 * 	20	编程题	Java (javac)	279 ms
 **/
public class Demo72 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();String[] split = line.split("\\s+");
        int N = Integer.parseInt(split[0]),M = Integer.parseInt(split[1]);
        String line2 = br.readLine();
        String[] targets = line2.split("\\s+");
        int x = 0;int y = 0;
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            String[] temp_strings = temp.split("\\s+");
            String res1 = temp_strings[0]+": ";
            String res = "";
            for (int j = 2; j < temp_strings.length; j++) {
                for (String target : targets) {
                    if (temp_strings[j].equals(target)) {
                        //System.out.print(temp_strings[j]);
                        res+=temp_strings[j]+" ";
                        x++;
                    }
                }
            }

            if (!res.equals("")){
                y++;
                System.out.print(res1);
                System.out.println(res.substring(0,res.length()-1));
            }
        }
        System.out.println(y+" "+x);
    }
}
