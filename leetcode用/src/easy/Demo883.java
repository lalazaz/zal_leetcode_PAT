package easy;
//883. 三维形体投影面积

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/4/26 11:46
 */
public class Demo883 {
    public static void main(String[] args) {
//        int[][] ints = {{1, 2}, {3, 4}};
//        System.out.println(projectionArea(ints));
//        System.out.println(projectionArea(new int[][]{{2}}));
//        System.out.println(projectionArea(new int[][]{{1,0},{0,2}}));
        //
        System.out.println(projectionArea(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}));
    }

    public static int projectionArea(int[][] grid) {
        int len = grid.length;
        int x = 0, y = 0, z = 0;//分别代表三面阴影
        for (int[] ints : grid) {
            x += Arrays.stream(ints).max().getAsInt();
        }
        for (int i = 0; i < grid.length; i++) {
            int max = 0;
            for (int j = 0; j < grid[0].length; j++) {
                max = Math.max(grid[j][i], max);
            }
            y += max;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) z++;
            }
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        return x + y + z;
    }
}
