package 数据结构入门;
//566. 重塑矩阵

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/5/7 9:08
 */
public class Demo566 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4)));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length)
            return mat;
/*        int[] temp = new int[mat.length * mat[0].length];
        int z = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                temp[z++] = mat[i][j];
            }
        }
        z = 0;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = temp[z++];
            }
        }*/
        int[][] res = new int[r][c];
        for (int i = 0; i < mat.length * mat[0].length; i++) {
            res[i / c][i % c] = mat[i / mat[0].length][i % mat[0].length];
        }
        return res;
    }
}
