package Demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/14 11:59
 * 1043 输出PATest (20 分)
 * 2022/03/14 12:19:54	 部分正确  18	编程题	Java (javac)	246 ms
 * 最后一个超内存了
 **/
public class Demo43 {
    static int P_num = 0;
    static int A_num = 0;
    static int T_num = 0;
    static int e_num = 0;
    static int s_num = 0;
    static int t_num = 0;

    public static void main(String[] args) throws IOException {
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
        while (true) {
            if (line.contains("P")) {
                line = line.replaceFirst("P", "");
                P_num++;
            } else if (line.contains("A")) {
                line = line.replaceFirst("A", "");
                A_num++;
            } else if (line.contains("T")) {
                line = line.replaceFirst("T", "");
                T_num++;
            } else if (line.contains("e")) {
                line = line.replaceFirst("e", "");
                e_num++;
            } else if (line.contains("s")) {
                line = line.replaceFirst("s", "");
                s_num++;
            } else if (line.contains("t")) {
                line = line.replaceFirst("t", "");
                t_num++;
            } else {
                break;
            }
        }
/*        System.out.println(P_num);
        System.out.println(A_num);
        System.out.println(T_num);
        System.out.println(e_num);
        System.out.println(s_num);
        System.out.println(t_num);*/

        while (!(P_num == 0 && A_num == 0 && T_num == 0 && e_num == 0 && s_num == 0 && t_num == 0)) {
            if (P_num != 0) {
                System.out.print("P");
                P_num--;
            }
            if (A_num != 0) {
                System.out.print("A");
                A_num--;
            }
            if (T_num != 0) {
                System.out.print("T");
                T_num--;
            }
            if (e_num != 0) {
                System.out.print("e");
                e_num--;
            }
            if (s_num != 0) {
                System.out.print("s");
                s_num--;
            }
            if (t_num != 0) {
                System.out.print("t");
                t_num--;
            }
        }
        System.out.println("");
    }
}
