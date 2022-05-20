package 算法入门;
//733. 图像渲染

/**
 * @author zal
 * @date 2022/4/27 9:34
 */
public class Demo733 {
    public static void main(String[] args) {

    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        DFS(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }
    //就是找每个点的四周，然后把又把四周的点来继续遍历
    public static void DFS(int[][] image, int x, int y, int newColor, int num) {
        if (x < 0 || x > image.length || y < 0 || y > image[0].length) return;
        if (image[x][y] == newColor || image[x][y] != num)
            return;
        else {
            image[x][y] = newColor;
            DFS(image, x - 1, y, newColor, num);
            DFS(image, x + 1, y, newColor, num);
            DFS(image, x, y - 1, newColor, num);
            DFS(image, x, y + 1, newColor, num);
        }
    }
}
