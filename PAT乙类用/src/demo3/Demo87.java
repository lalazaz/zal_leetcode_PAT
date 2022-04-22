package demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;

/**
 * @Date 2022/4/5 19:17
 * 1087 有多少不同的值 (20 分)
 * 2022/04/05 19:49:33
 * 答案正确
 * 	20	编程题	Java (javac)	91 ms
 * 	总想着字符串拼接搞了好久,甚至想找某种规律..其实Hashset多简单
 **/
public class Demo87 {
    static int all = 0;

    public static void main(String[] args) throws IOException {

        /*//超时
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();
        int N = (int) st.nval;
        //不同的结果用@@包起来~
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= N; i+=2) {
            int temp = (int) (i / 2) + (int) (i / 3) + (int) (i / 5);
            if (!res.toString().contains("@" + temp + "@")) {
                res.append("@").append(temp).append("@");
                all++;
            }
            if (i%5==4)i--;
            else if (i%3==2)i--;
            else if (i%5==3)i--;
            else if (i%3==1)i--;
        }
        System.out.println(all);
        //System.out.println(res);*/

        //好像可以用Hashset..
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();
        int N = (int) st.nval;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= N; i++) {
            int temp = (int) (i / 2) + (int) (i / 3) + (int) (i / 5);
            set.add(temp);
        }
        System.out.println(set.size());
    }
}


