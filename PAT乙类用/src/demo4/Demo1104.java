package demo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

//@Date 2022/4/15 19:25
//1104 天长地久 (20 分)
public class Demo1104 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();int N = (int) st.nval;
        for (int i = 0; i < N; i++) {
            System.out.println("Case "+i);
            st.nextToken();int K = (int)st.nval;
            st.nextToken();int m = (int)st.nval;
            StringBuilder s1 = new StringBuilder();
            for (int j = 0; j < K; j++) {
                //接着判断K个数字加起来是不是m   k+1是n
                //+1等....

            }
        }
    }


    //两个数字的最大公约数是不是大于2的素数
    public static boolean maxgongyueisPrime(int m,int n){
        int i = 1;
        do {
            i = m % n;
            m = n;
            n = i;
        }while(n != 0);
        return isPrime(m);
    }

    //判断是否为大于2的素数
    public static boolean isPrime(int i) {
        if (i<=2) return false;
        int j = 2;
        for (; j <= Math.sqrt(i); j++) {
            if (i % j == 0)return false;
        }
        return true;
    }
}
