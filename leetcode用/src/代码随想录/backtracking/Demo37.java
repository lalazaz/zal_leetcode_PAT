package 代码随想录.backtracking;
//37. 解数独

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/5/8 11:34
 */
public class Demo37 {
    public static void main(String[] args) {
        char[][] chars = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        solveSudoku(chars);
        System.out.println(Arrays.deepToString(chars));
    }

    public static void solveSudoku(char[][] board) {
        backtracking(board);
    }

    public static boolean backtracking(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.')//已有数字则继续
                    continue;
                for (char k = '1'; k <= '9'; k++) {
                    if (isVaild(i, j, k, board)) {//如果这个放置的数字在数独中有效
                        board[i][j] = k;
                        if (backtracking(board))//找到一组立刻返回?
                            return true;
                        board[i][j] = '.';
                    }
                }
                return false;//这步好迷啊。
            }
        }
        return true;
    }

    //写一个方法，在指定位置上放下这个val，判断数独是否仍然成立
    public static boolean isVaild(int row, int col, char val, char[][] board) {
        //行
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == val)
                return false;
        }
        //列
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == val)
                return false;
        }
        //九宫格
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == val)
                    return false;
            }
        }
        return true;
    }
}
