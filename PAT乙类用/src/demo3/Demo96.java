package demo3;
//@Date 2022/4/10 12:45
//1096 大美数 (15 分)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Demo96 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();
        int K = (int) st.nval;
        for (int i = 0; i < K; i++) {
            st.nextToken();
            int temp = (int) st.nval;
            //进行判定  先拿因子再暴力判断
            System.out.println(judge(temp));
        }
    }
    public static String judge(int temp){
        StringBuilder sb = new StringBuilder("");
        for (int j = 1; j <= temp; j++) {
            if (temp % j == 0) sb.append("@").append(j);
        }
        String[] split = sb.toString().replaceFirst("@","").split("@");
        for (int j = 0; j < split.length; j++) {
            for (int k = j + 1; k < split.length; k++) {
                for (int l = k + 1; l < split.length; l++) {
                    for (int m = l + 1; m < split.length; m++) {
                        if (((Integer.parseInt(split[j]) + Integer.parseInt(split[k])
                                + Integer.parseInt(split[l]) + Integer.parseInt(split[m]))) % temp == 0)
                            return "Yes";
                    }
                }
            }
        }
        return "No";
    }
}
