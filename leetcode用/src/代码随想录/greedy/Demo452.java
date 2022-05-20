package 代码随想录.greedy;
//452. 用最少数量的箭引爆气球

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zal
 * @date 2022/5/11 21:15
 */
public class Demo452 {
    public static void main(String[] args) {

    }

    public static int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;
        Arrays.sort(points, Comparator.comparingInt(o -> o[0]));
        int count = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > points[i - 1][1])
                count++;
            else points[i][1] = Math.min(points[i][1], points[i - 1][1]);
        }
        return count;
    }
}
