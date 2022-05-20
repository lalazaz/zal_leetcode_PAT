package 代码随想录.greedy;
//435. 无重叠区间

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zal
 * @date 2022/5/11 21:27
 */
public class Demo435 {
    public static void main(String[] args) {
        System.out.println(eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}}));
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;
        Arrays.sort(intervals, Comparator.comparing(o -> o[0]));
        int count = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= intervals[i - 1][1])
                count++;
            else
                intervals[i][1] = Math.min(intervals[i][1], intervals[i - 1][1]);
        }
        return intervals.length - count;
    }
}
