package demo;

import java.util.Arrays;

//@Date 2022/4/11 12:50
//1893. 检查是否区域内所有整数都被覆盖
public class Demo1893 {
    public static void main(String[] args) {
        int[][] ints = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        System.out.println(isCovered(ints, 2, 7));

        int[][] ranges = {{1, 10}, {10, 20}};
        System.out.println(isCovered(ranges, 21, 21));
    }

    public static boolean isCovered(int[][] ranges, int left, int right) {
        int flag = 0;//表示在里面的值，如果等于right-left+1则返回true
        for (int i = left; i <= right; i++) {
            //拿ranges的每一行出来
            for (int j = 0; j < ranges.length; j++) {
                if (i>=ranges[j][0]&&i<=ranges[j][1]){
                    flag++;
                    break;
                }
            }
        }
        return flag == right - left + 1;
    }
}
