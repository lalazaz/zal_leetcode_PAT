package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/23 17:48
 * 1055 集体照 (25 分)
 **/
public class Demo55 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("\\s+");
        int N = Integer.parseInt(split[0]);int K = Integer.parseInt(split[1]);
        String[] names = new String[N];int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            String[] temp = br.readLine().split("\\s+");
            names[i] = temp[0];
            heights[i] = Integer.parseInt(temp[1]);
        }
        br.close();
        //身高冒泡排序，然后名字跟着他排
        //拍完后所有人对K取模，模是小于k的，然后模的大小就是从后到前要多加的人的个数
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights.length - i - 1; j++) {
                if (heights[j] < heights[j+1]){
                    int temp_height = 0;
                    String temp_name = "";

                    temp_height = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp_height;

                    temp_name = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp_name;
                }
            }
        }
        /*for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] +" "+ heights[i]);
        }*/
        int mo = N % K;
        for (int i = 0; i < names.length; i++) {
            if (mo > 0){
                System.out.println(names[i]);
                //if ()
            }
        }
    }
}
