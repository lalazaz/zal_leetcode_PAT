package medium;
//36. 有效的数独

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author zal
 * @date 2022/5/8 9:23
 */
public class Demo36 {
    public static void main(String[] args) {
        char[][] chars = {{'5', '3', '.', '.', '5', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        //new int[][]{ints
        System.out.println(isValidSudoku(chars));//lc中通过了，这里哪里有问题？
    }

    public static boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] block = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    int blockIndex = i / 3 * 3 + j / 3;
                    if (row[i][num] || col[j][num] || block[blockIndex][num])
                        return false;
                    else {
                        row[i][num] = true;
                        col[j][num] = true;
                        block[blockIndex][num] = true;
                    }
                }
            }
        }
        return true;
    }


/*    public static boolean isValidSudoku(char[][] board) {
        boolean flag1 = false;
        //boolean flag2 = false;
        //两块进行，flag1代表行列满足，flag2代表所在的3*3满足
        for (int i = 0; i < 9; i++) {
            //行
            int temp = board[i][0];
            for (int j = 1; j < 9; j++) {
                if (temp == 0) {
                    return false;
                }
                if (board[i][j] == '.')
                    continue;
                else temp ^= board[i][j];
            }
            //列
            temp = board[0][i];
            for (int j = 1; j < 9; j++) {
                if (temp == 0) {
                    return false;
                }
                if (board[j][i] == '.')
                    continue;
                else temp ^= board[j][i];
            }
        }
        //然后经行宫格的判断


        return true;
    }*/
}
