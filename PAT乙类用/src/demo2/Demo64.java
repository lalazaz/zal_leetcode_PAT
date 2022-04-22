package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Date 2022/3/28 11:50
 * 1064 朋友数 (20 分)
 * 2022/03/28 13:00:05
 * 答案正确
 * 	20	编程题	Java (javac)	258 ms
 *
 **/
public class Demo64 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder res = new StringBuilder();
        int m = 0;

        String line = br.readLine();
        String[] split = line.split("\\s+");
        for (int j = 0; j < split.length; j++) {
            char[] chars = split[j].toCharArray();
            int num_temp = 0;
            for (int k = 0; k < chars.length; k++) {
                num_temp += chars[k] - 48;
            }
            //System.out.println(num_temp);
            if (!res.toString().contains("(" + num_temp + ")")) {
                res.append("(").append(num_temp).append(")");
                m++;
            }
        }
        System.out.println(m);
        String[] split1 = res.substring(1, res.length() - 1).split("\\)\\(");
        int[] ints = new int[split1.length];
        for (int i = 0; i < split1.length; i++) {
            ints[i] = Integer.parseInt(split1[i]);
        }
        Arrays.sort(ints);int i = 0;
        for (; i < ints.length -1; i++) {
            System.out.print(ints[i]+" ");
        }
        System.out.println(ints[i]);

    }
}
