package 算法入门;
//994. 腐烂的橘子

import java.util.LinkedList;

/**
 * @author zal
 * @date 2022/4/29 23:01
 */
public class Demo994 {
    public static void main(String[] args) {

    }

    public static int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        //遍历矩阵，腐烂橘子入队、统计新鲜橘子数量
        int row = grid.length;
        int col = grid[0].length;
        LinkedList<Integer> que = new LinkedList<>();
        int juice = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) //腐烂橘子入队列
                    que.add(i * col + j);//注意把二维长度转为一维长度
                else if (grid[i][j] == 1)
                    juice++;
            }
        }
        int time = 0;
        while (!que.isEmpty() && juice != 0) {
            //对腐烂橘子队列经行出队操作，一层一层的出队，每个腐烂橘子进行广度优先遍历,
            //即判断它周围橘子是否新鲜橘子，新鲜橘子入队，变成腐烂橘子，且新鲜橘子数量减少
            //当循环结束，判断新鲜橘数量，也为空就返回时间，不为空返回-1
            time++;
            int size = que.size();
            for (int i = 0; i < size; i++) {
                Integer p = que.pop();
                int x = p / col, y = p % col;
                //每一个腐烂橘子上下左右感染
                if (x - 1 >= 0 && grid[x - 1][y] == 1) {
                    juice--;
                    grid[x - 1][y] = 2;
                    que.add((x - 1) * col + y);
                }
                if (x + 1 < grid[0].length && grid[x + 1][y] == 1) {
                    juice--;
                    grid[x + 1][y] = 2;
                    que.add((x + 1) * col + y);
                }
                if (y - 1 >= 0 && grid[x][y - 1] == 1) {
                    juice--;
                    grid[x][y - 1] = 2;
                    que.add(x * col + y - 1);
                }
                if (y + 1 < grid[0].length && grid[x][y + 1] == 1) {
                    juice--;
                    grid[x][y + 1] = 2;
                    que.add(x * col + y + 1);
                }
            }
        }
        return juice == 0 ? time : -1;
    }
}
