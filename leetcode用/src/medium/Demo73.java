package medium;
//73. 矩阵置零

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author zal
 * @date 2022/5/8 10:09
 */
public class Demo73 {
    public static void main(String[] args) {
        //测试方法
        /*int[][] ints = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(Arrays.deepToString(ints));
        zero_fun(ints, 0, 0);
        System.out.println(Arrays.deepToString(ints));*/
    }

    public static void setZeroes(int[][] matrix) {
        ArrayList<String> todo = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    todo.add(i + "_" + j);
//                    zero_fun(matrix, i, j);
                }
            }
        }
        for (int i = 0; i < todo.size(); i++) {
            zero_fun(matrix, Integer.parseInt(todo.get(i).split("_")[0]),
                    Integer.parseInt(todo.get(i).split("_")[1]));
        }
    }

    //输入矩阵，输入行列，矩阵所在行和列置零
    public static void zero_fun(int[][] matrix, int i, int j) {
        for (int k = 0; k < matrix.length; k++) {
            matrix[k][j] = 0;
        }
        for (int k = 0; k < matrix[0].length; k++) {
            matrix[i][k] = 0;
        }
    }
}
