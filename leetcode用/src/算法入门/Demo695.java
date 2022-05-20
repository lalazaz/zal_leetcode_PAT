package 算法入门;
//695. 岛屿的最大面积

/**
 * @author zal
 * @date 2022/4/27 9:54
 */
public class Demo695 {
    public static void main(String[] args) {
        int i = maxAreaOfIsland(new int[][]{{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}});
        System.out.println(i);
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    res = Math.max(DFS(grid,i,j),res);
            }
        }
        return res;
    }

    //找这个点的DFS为1的所有邻居个数
    public static int DFS(int[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0) return 0;
        grid[x][y] = 0;//探索后置零
        int count = 1;
        count += DFS(grid, x + 1, y);
        count += DFS(grid, x - 1, y);
        count += DFS(grid, x, y + 1);
        count += DFS(grid, x, y - 1);
        return count;
    }
}
