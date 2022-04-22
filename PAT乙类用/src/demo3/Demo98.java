package demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

//@Date 2022/4/13 23:02
//1098 岩洞施工 (20 分)

/**
 * 2022/04/13 23:20:02
 * 答案正确
 * 	20	编程题	Java (javac)	82 ms
 */

public class Demo98 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();int N = (int)st.nval;int N1 = N;
        int min = Integer.MAX_VALUE;int max = 0;
        while (N-- !=0){
            st.nextToken();int l1 = (int)st.nval;min = Math.min(min,l1);
        }
        while (N1-- !=0){
            st.nextToken();int l2 = (int)st.nval;max = Math.max(max,l2);
        }

        if (min - max >= 1){
            System.out.println("Yes "+(min-max));
        }else System.out.println("No "+(max-min+1));
    }
}
