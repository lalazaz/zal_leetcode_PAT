import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@Date 2022/4/6 20:50
//1011 World Cup Betting (20 分)
// printf的用法看看  https://blog.csdn.net/jhsword/article/details/108574442

/**
 * 2022/04/06 21:07:34
 * 答案正确
 * 	20	编程题	Java (javac)	94 ms
 */
public class Demo11 {
    public static void main(String[] args) throws IOException {
        String[] strings = new String[3];
        strings[0] = "W";       strings[1] = "T";       strings[2] = "L";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double res= 1.0;
        for (int i = 0; i < 3; i++) {
            String temp = br.readLine();
            String[] split = temp.split("\\s+");
            double max = 0;
            int max_index = 0;
            for (int j = 0; j < split.length; j++) {
                if (max < Double.parseDouble(split[j])){
                    max = Double.parseDouble(split[j]);
                    max_index = j;
                }
            }
            res *= max;
            System.out.print(strings[max_index]+" ");
        }
        res = (res * 0.65 - 1) * 2;
        System.out.printf("%.2f",res);
    }
}
