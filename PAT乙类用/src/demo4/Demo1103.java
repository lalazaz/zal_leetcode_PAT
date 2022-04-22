package demo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

//@Date 2022/4/15 18:46
//1103 缘分数 (20 分)

/**
 * 2022/04/15 19:09:33
 * 答案正确
 * 	20	编程题	Java (javac)	93 ms
 */
public class Demo1103 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();int m = (int)st.nval;        st.nextToken();int n = (int)st.nval;
        int flag = 0;
        for (int i = m; i <= n; i++) {
            double num = Math.sqrt(i*i*i - (i-1)*(i-1)*(i-1));
            if ((int)num - num == 0){

                //判断num是否可以被构成
                int yuan = yuan((int)num);
                if (yuan!=-1){
                    System.out.println(i+" "+yuan);
                    flag++;
                }
            }
        }
        if (flag==0){
            System.out.println("No Solution");
        }

    }
    //输出一个数字，返回正好有另一个数字b*b+(b-1)(b-1)等于这个数字,否则返回-1
    public static int yuan(int n){
        /*if (n==1)return 1;*/
        int i = 1;
        for (; i <= n; i++) {
            if (i*i+(i-1)*(i-1) == n)
                break;
        }
        if (i==n)return -1;
        else return i;
    }
}
