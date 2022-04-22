package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/30 8:45
 * 1068 万绿丛中一点红 (20 分)
 **/
public class Demo68 {
    public static void main(String[] args) throws IOException {
        int M,N,TOL;
        String res = "Not Exist";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] split = line.split("\\s+");
        M = Integer.parseInt(split[0]);N = Integer.parseInt(split[1]);TOL = Integer.parseInt(split[2]);
        int[][] nums = new int[N][M];
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            String[] temp_spilt = temp.split("\\s+");
            for (int j = 0; j < temp_spilt.length; j++) {
                nums[i][j] = Integer.parseInt(temp_spilt[j]);
            }
        }
        for (int i = 1; i < N-1; i++) {
            for (int j = 1; j < M-1; j++) {
                //这里面的是除去边缘的值
                //开始判断与周围的值的比较
                boolean flag = false;
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        //16711479 为什么不是独一无二的点  和0有什么关系？  题目怎么样描述0？
                    }
                }
            }
        }
    }
}
