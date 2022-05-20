package 代码随想录.backtracking;
//51. N 皇后

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/8 11:00
 */
public class Demo51 {
    public static void main(String[] args) {
        System.out.println(solveNQueens(8));
    }

    /**
     * copy的代码，  ╥﹏╥...
     */
    static List<List<String>> res = new ArrayList<>();

    public static List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for (char[] c : chessboard) {
            Arrays.fill(c, '.');
        }
        backtracking(n, 0, chessboard);
        return res;
    }

    //回溯
    public static void backtracking(int n, int row, char[][] chessboard) {
        if (row == n) {
            res.add(Array2List(chessboard));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isVaild(row, col, n, chessboard)) {//如果当前这个位置可以放置
                chessboard[row][col] = 'Q';
                backtracking(n, row + 1, chessboard);
                chessboard[row][col] = '.';
            }
        }
    }

    //把当前棋盘(矩阵)转为list
    public static List Array2List(char[][] chessboard) {
        List<String> res = new ArrayList<>();
        for (char[] c : chessboard) {
            res.add(String.copyValueOf(c));
        }
        return res;
    }

    //判断当前棋盘是否合法
    public static boolean isVaild(int row, int col, int n, char[][] chessboard) {
        //行每次都加一所以不用检查
        //检查列
        for (int i = 0; i < row; i++) {
            if (chessboard[i][col] == 'Q')
                return false;
        }
        //45度角
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessboard[i][j] == 'Q')
                return false;
        }
        //135度
        for (int i = row - 1, j = col + 1; i >= 0 && j <= n - 1; i--, j++) {
            if (chessboard[i][j] == 'Q')
                return false;
        }
        return true;
    }
}
