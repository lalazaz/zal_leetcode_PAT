package 剑指offer_01;
//剑指 Offer 04. 二维数组中的查找

/**
 * @author zal
 * @date 2022/4/21 13:31
 */
public class Demo04 {
    public static void main(String[] args) {
        int[][] ints = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.println(findNumberIn2DArray(ints, 5));
        System.out.println(findNumberIn2DArray(ints, 20));
        System.out.println(findNumberIn2DArray(ints, 1));
        System.out.println(findNumberIn2DArray(ints, 4));
        System.out.println(findNumberIn2DArray(ints, 7));
        System.out.println(findNumberIn2DArray(ints, 1098));

        int[][] ints1 = new int[][]{};
        System.out.println(findNumberIn2DArray(ints1, 2));
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length==0)return false;
        if (matrix[0].length == 0)return false;
        //列———从右上到右下
        //行———从右到左
        int m = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            if (target <= matrix[i][m - 1]) {
                for (int j = m - 1; j >= 0; j--) {
                    if (matrix[i][j] == target) return true;
                }
            }
        }
        return false;
    }
}
