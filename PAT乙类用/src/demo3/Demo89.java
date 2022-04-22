package demo3;
//@Date 2022/4/6 19:24
//1089 狼人杀-简单版 (20 分)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Demo89 {
    public static void main(String[] args) throws IOException {
        //每个人说的话保存在v[]数组
        //a[]数组判定该人是好人还是狼人  1是好人， -1是狼人
        //lie[]数组保存说谎的人
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] ints = new int[N+1];
        for (int i = 1; i < N+1; i++) {
            int n = Integer.parseInt(br.readLine());
            ints[i] = n;
        }
        for (int i = 1; i <=N ; i++) {
            for (int j = i+1; j <= N; j++) {
                ArrayList<Integer> lie = new ArrayList<>();
                ArrayList<Integer> a = new ArrayList<>(N+1);
                /**
                 *
                 */
                //..请直接看柳神C++实现
            }
        }
    }
}
