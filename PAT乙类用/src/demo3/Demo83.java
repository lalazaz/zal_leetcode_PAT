package demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @Date 2022/4/5 9:28
 * 1083 是否存在相等的差 (20 分)
 * 2022/04/05 09:35:53
 * 答案正确
 * 	20	编程题	Java (javac)	165 ms
 **/
public class Demo83 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int n = (int)st.nval;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            st.nextToken();
            int x = (int)st.nval;
            res[Math.abs(x-i-1)]++;
        }
        //System.out.println(Arrays.toString(res));
        for (int i = res.length-1; i >=0 ; i--) {
            if (res[i]>1){
                System.out.println(i+" "+res[i]);
            }
        }
    }
}
