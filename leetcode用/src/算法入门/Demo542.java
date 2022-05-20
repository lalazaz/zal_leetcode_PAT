package 算法入门;
//542. 01 矩阵

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/4/29 19:52
 */
public class Demo542 {
    public static void main(String[] args) {
        int[][] ints = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] ints1 = updateMatrix(ints);
        System.out.println(Arrays.deepToString(ints1));
    }

    static private int row;
    static private int col;
    static private int[][] vector = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};//四个方向
    /**
     * DFS（递归实现，解答正确，但是会超时，下方是优化版）
     */
    public static int[][] updateMatrix(int[][] matrix) {
        row = matrix.length;
        col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] = row + col;//初始化一个较大的值，为什么？为了能够将我们要经行遍历的元素区别出来
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                //可以在这里地方继续优化，关键点是靠近0的1不用重新判断，即他的最后结果就是1
                if (matrix[i][j] == 0) {
                    updateMatrix(matrix, i, j);
                }
            }
        }
        return matrix;
    }

    /**
     * DFS 递归函数
     */
    private static void updateMatrix(int[][] matrix, int r, int c) {
        // 搜索上下左右四个方向
        for (int[] v : vector) {
            //v[0]是行变化，v[1]是列变化
            int nr = r + v[0], nc = c + v[1];
            if (nr >= 0 && nr < row
                    && nc >= 0 && nc < col//边界内
                    && matrix[nr][nc] > matrix[r][c] + 1//是否是被我们区别的元素
            ) {
                matrix[nr][nc] = matrix[r][c] + 1;
                updateMatrix(matrix, nr, nc);
            }
        }
    }
}
