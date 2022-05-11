package medium;
//56. 合并区间

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zal
 * @date 2022/4/18 12:31
 */
public class Demo56 {
    public static void main(String[] args) {
        int[][] ints = {{1, 3}, {2, 6}, {6, 10}, {100, 180}};
        System.out.println(Arrays.deepToString(merge(ints)));

        int[][] ints1 = {{1, 3}, {4, 4}};
        System.out.println(Arrays.deepToString(merge(ints1)));

        int[][] ints2 = {{1, 2}, {0, 4}};
        System.out.println(Arrays.deepToString(merge(ints2)));

        int[][] ints3 = {{1, 3}, {2, 3}};
        System.out.println(Arrays.deepToString(merge(ints3)));
    }

    public static int[][] merge(int[][] intervals) {
        //对intervals按照左边的数据进行排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        ArrayList<int[]> res_list = new ArrayList<>();
        int i = 0;
        for (; i < intervals.length - 1; i++) {
            //三种情况
            if (intervals[i][1] < intervals[i + 1][0]) {
                //没有交集
                res_list.add(intervals[i]);
            } else if (intervals[i][1] >= intervals[i + 1][0] && intervals[i][1] <= intervals[i + 1][1]) {
                //有交集
                intervals[i + 1] = new int[]{intervals[i][0], intervals[i + 1][1]};
            } else if (intervals[i][1] > intervals[i + 1][1]) {
                //包含
                intervals[i + 1] = new int[]{intervals[i][0], intervals[i][1]};
            } else res_list.add(intervals[i]);

        }
        res_list.add(intervals[i]);
        int[][] res = new int[res_list.size()][2];
        for (int j = 0; j < res_list.size(); j++) {
            res[j] = res_list.get(j);
        }
        return res;
    }
}
