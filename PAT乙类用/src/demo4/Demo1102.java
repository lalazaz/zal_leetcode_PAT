package demo4;

import java.io.*;

//@Date 2022/4/15 18:31
//1102 教超冠军卷 (20 分)

/**
 * 2022/04/15 18:42:25
 * 答案正确
 * 	20	编程题	Java (javac)	365 ms
 */

public class Demo1102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int N = (int) st.nval;
        int max1 = 0;
        String res1 = "";
        int max2 = 0;
        String res2 = "";
        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split("\\s+");
            if (Integer.parseInt(split[2]) >= max1) {
                max1 = Integer.parseInt(split[2]);
                res1 = split[0] + " " + max1;
            }
            if ((Integer.parseInt(split[1]) * (Integer.parseInt(split[2])) >= max2)) {
                max2 = ((Integer.parseInt(split[1]) * (Integer.parseInt(split[2]))));
                res2 = split[0] + " " + max2;
            }
        }
        System.out.println(res1);
        System.out.println(res2);
    }
}
