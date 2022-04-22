package demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @Date 2022/4/5 9:42
 * 1084 外观数列 (20 分)
 * eg:1 11 12 1121 122111 112213 12221131 1123123111
 *
 * 2022/04/05 10:10:26
 * 答案正确
 * 	20	编程题	Java (javac)	138 ms
 **/
public class Demo84 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int d = (int) st.nval;
        st.nextToken();
        int N = (int) st.nval;
        String temp = "" + d +"@";
        for (int i = 1; i < N; i++) {
            int l = temp.length();
            int same = 1;
            StringBuilder res = new StringBuilder();
            for (int j = 0; j < l-1; j++) {
                int p = j + 1;
                if (temp.charAt(j) == temp.charAt(p)) {
                    p++;
                    same++;
                }else {
                    res.append(temp.charAt(j) - 48).append(same);
                    same = 1;
                }
            }
            temp = res.toString()+"@";
        }
        System.out.println(temp.substring(0,temp.length()-1));
    }
}
