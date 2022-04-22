package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/26 9:50
 * 2022/03/26 10:45:31	 部分正确   14	编程题	Java (javac)	200 ms
 * 超时
 **/
public class Demo59 {
    public static void main(String[] args) throws IOException {
        /*int[] primes = new int[1000];
        int p = 2,count = 1;
        while (true){
            if (isPrime(p)){
                primes[count++] = p;
            }
            p++;
            if (count == 1000) break;
        }
        System.out.println(Arrays.toString(primes));*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] order_list = new String[N];
        for (int i = 0; i < N; i++) {
            order_list[i] = br.readLine();
        }
        int K = Integer.parseInt(br.readLine());
        String temp = "";
        for (int i = 0; i < K; i++) {
            temp = br.readLine();
            for (int j = 0; j < N; j++) {

                if ((temp+"X").equals(order_list[j])){
                    System.out.println(temp + ": Checked");
                    break;
                }
                if (temp.equals(order_list[j])) {
                    if (j == 0) {
                        System.out.println(order_list[j] + ": Mystery Award");
                        order_list[j] = order_list[j]+"X";
                        break;
                    } else if (isPrime(j+1)) {
                        if (!order_list[j].equals(order_list[j]+"X")){
                            System.out.println(order_list[j] + ": Minion");
                            order_list[j] = order_list[j]+"X";
                            break;
                        }
                    } else if (!order_list[j].equals(order_list[j]+"X")) {
                        System.out.println(order_list[j] + ": Chocolate");
                        order_list[j] = order_list[j]+"X";
                        break;
                    }
                }

                if (j == N-1 && !(temp.equals(order_list[j]))){
                        System.out.println(temp + ": Are you kidding?");
                        break;
                }

            }
        }
        br.close();
    }

    public static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {//程序默认2是素数，当j=2时，循环不执行
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
