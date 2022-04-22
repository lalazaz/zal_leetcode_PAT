package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Date 2022/3/28 13:27
 * 1065 单身狗 (25 分)
 **/
public class Demo65 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();
        int x= 0;
        int N = Integer.parseInt(br.readLine());
        int[] boys = new int[N];int[] girls = new int[N];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            boys[i] = Integer.parseInt(line.split("\\s+")[0]);girls[i] = Integer.parseInt(line.split("\\s+")[1]);
        }
        int M = Integer.parseInt(br.readLine());
        String line = br.readLine();
        String[] split = line.split("\\s+");
        for (int i = 0; i < M; i++) {
            //遍历我们有的两个数组，如果不在内，加入字符串中
            int j = 0;
            for (; j < N; j++) {
                if ((girls[j] == Integer.parseInt(split[i]) && line.contains(boys[j]+""))||
                        (boys[j] == Integer.parseInt(split[i]) && line.contains(girls[j]+"")))
                    break;
            }
            if (j == N) {
                x++;
                res.append(split[i]+" ");
            }
        }
        String[] split1 = res.toString().split("\\s+");
        Arrays.sort(split1);
        String res2 = "";
        for (String s : split1) {
            res2+=s+" ";
        }
        System.out.println(x);
        System.out.println(res2.substring(0,res2.length()-1));
    }
}
