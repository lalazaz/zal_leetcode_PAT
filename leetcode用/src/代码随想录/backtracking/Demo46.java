package 代码随想录.backtracking;
//46. 全排列

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/1 11:02
 */
public class Demo46 {
    static List<List<Integer>> res = new ArrayList<>();
    static LinkedList<Integer> path = new LinkedList<>();
    static boolean[] used;//用来标记此数字是否用过

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0)
            return res;
        used = new boolean[nums.length];
        permuteBackTracking(nums);
        return res;
    }

    public static void permuteBackTracking(int[] nums) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            path.add(nums[i]);
            used[i] = true;
            permuteBackTracking(nums);
            path.removeLast();
            used[i] = false;
        }
    }
}
