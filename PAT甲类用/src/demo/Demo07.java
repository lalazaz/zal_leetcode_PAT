package demo;
//1007 Maximum Subsequence Sum (25 分)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @author zal
 * @date 2022/4/20 13:45
 *
 * 没搞出来
 */
public class Demo07 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();
        int K = (int) st.nval;
        int res = 0;
        int x = 0;
        int count = 0, l = 0,r = 0;//代表遍历过程中的最大连续总和的右边  count是离右边的个数
        for (int i = 0; i < K; i++) {
            st.nextToken();
            int temp = (int) st.nval;
            if (temp + x >= 0) {
                x += temp;
                if (x > res) {
                    count++;
                    res = x;
                    r = i;
                    l = r- count;
                }
            } else {
                x = 0;
            }
        }
        System.out.print(res + " " + (r - count + 1) + " " + r);
    }
}

