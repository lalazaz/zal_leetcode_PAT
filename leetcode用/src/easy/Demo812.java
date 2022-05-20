package easy;
//812. 最大三角形面积

/**
 * @author zal
 * @date 2022/5/15 9:02
 */
public class Demo812 {
    public static void main(String[] args) {

    }

    public static double largestTriangleArea(int[][] points) {
        double res = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    int x1 = points[i][0];
                    int y1 = points[i][1];
                    int x2 = points[j][0];
                    int y2 = points[j][1];
                    int x3 = points[k][0];
                    int y3 = points[k][1];
                    res = Math.max(res, Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)));
                }
            }
        }
        return res / 2;
    }
}
