package demo3;
//@Date 2022/4/9 10:10
//1095 解码PAT准考证 (25 分)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Demo95 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();int N = (int)st.nval;
        st.nextToken();int M = (int)st.nval;
        String[] IDs = new String[N];
        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split("\\s+");
            IDs[i] = split[0]; scores[i] = Integer.parseInt(split[1]);
        }
        //对成绩经行一个降序的排序，同时影响其ID，相同比较准考证字典序递增输出
        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            System.out.println("Case 1: "+line);
            //三个情况123的判定与输出
        }
    }
}
