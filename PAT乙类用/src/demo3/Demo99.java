package demo3;

import utils.IsPrime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

//@Date 2022/4/14 11:08
//1099 性感素数 (20 分)

/**
 * 2022/04/14 11:40:22
 * 答案正确
 * 	20	编程题	Java (javac)	89 ms
 */
public class Demo99 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();
        int N = (int) st.nval;

        if (IsPrime.isPrime(N) && IsPrime.isPrime(N - 6)) {
            System.out.println("Yes");
            System.out.println(N - 6);
            return;
        } else if (IsPrime.isPrime(N) && IsPrime.isPrime(N + 6)) {
            System.out.println("Yes");
            System.out.println(N);
            return;
        }
        //往上找
        boolean flag = false;
        while (!flag) {
            N++;
            if ((IsPrime.isPrime(N) && IsPrime.isPrime(N - 6))) {
                flag = true;
            } else if ((IsPrime.isPrime(N) && IsPrime.isPrime(N + 6))) {
                flag = true;
            }
        }
        System.out.println("No");
        System.out.println(N);
    }
}
