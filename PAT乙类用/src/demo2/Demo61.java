package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/27 10:45
 * 1061 判断题 (15 分)
 * 2022/03/27 10:58:43
 * 答案正确
 * 	15	编程题	Java (javac)	202 ms
 **/
public class Demo61 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        int N = Integer.parseInt(line1.split("\\s+")[0]);int M = Integer.parseInt(line1.split("\\s+")[1]);
        String scores_string = br.readLine();String answers_string = br.readLine();
        String[] scores = scores_string.split(" ");
        String[] answers = answers_string.split(" ");

        for (int i = 0; i < N; i++) {
            int my_score = 0;
            String temp = br.readLine();
            String[] split = temp.split("\\s+");
            for (int j = 0; j < split.length; j++) {
                if (split[j].equals(answers[j]+"")){
                    my_score+= Integer.parseInt(String.valueOf(scores[j]));
                }
            }
            System.out.println(my_score);
        }
    }
}
