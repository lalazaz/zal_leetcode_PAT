//@Date 2022/4/6 21:23
//1012 The Best Rank (25 分)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

/**
 * 好麻烦的题目以及果然超时了🤢
 * 2022/04/06 22:02:55
 * 部分正确
 * 	19	编程题	Java (javac)	200 ms
 */

public class Demo12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();        int N = (int)st.nval;
        st.nextToken();        int M = (int)st.nval;
        String[] info = new String[N];
        //对数据处理结果的保存
        int[] A_order = new int[N];        int[] C_order = new int[N];
        int[] M_order = new int[N];        int[] E_order = new int[N];
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            info[i] = temp;
            String[] temp_list = temp.split("\\s+");
            C_order[i] = Integer.parseInt(temp_list[1]);
            M_order[i] = Integer.parseInt(temp_list[2]);
            E_order[i] = Integer.parseInt(temp_list[3]);
            A_order[i] = (Integer.parseInt(temp_list[1])+ Integer.parseInt(temp_list[2])+ Integer.parseInt(temp_list[3]))/3;
        }
        Arrays.sort(A_order);        Arrays.sort(C_order);
        Arrays.sort(M_order);        Arrays.sort(E_order);

        long start = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            String res = "";
            int mingci = 0;
            String line = br.readLine();
            for (int j = 0; j < info.length; j++) {
                if (info[j].substring(0,info[j].indexOf(" ")).equals(line)){
                    String s = info[j];
                    s = s.replace(line+" ","");
                    //这个s就是当前要判断的信息
                    //判断名次，从A-》C-》M-》-》E
                    String[] split = s.split("\\s+");
                    int pingjun = (Integer.parseInt(split[0])+Integer.parseInt(split[1])+Integer.parseInt(split[2]))/3;
                    for (int k = 0; k < A_order.length; k++) {
                        if (pingjun==A_order[k]){
                            mingci = A_order.length-k;
                            res = "A";
                        }
                    }
                    if (mingci==1)break;
                    for (int k = 0; k < C_order.length; k++) {
                        if (split[0].equals(C_order[k]+"")){
                            if (C_order.length-k < mingci){
                                mingci = C_order.length-k;
                                res = "C";
                            }
                        }
                    }
                    if (mingci==1)break;
                    for (int k = 0; k < M_order.length; k++) {
                        if (split[1].equals(M_order[k]+"")){
                            if (M_order.length-k < mingci){
                                mingci = M_order.length-k;
                                res = "M";
                            }
                        }
                    }
                    if (mingci==1)break;
                    for (int k = 0; k < E_order.length; k++) {
                        if (split[2].equals(E_order[k]+"")){
                            if (E_order.length-k < mingci){
                                mingci = E_order.length-k;
                                res = "E";
                            }
                        }
                    }
                }
            }
            if (mingci!=0){
                System.out.print(mingci+" ");
                System.out.println(res);
            }else {
                System.out.println("N/A");
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
