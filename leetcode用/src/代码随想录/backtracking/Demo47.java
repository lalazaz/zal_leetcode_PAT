package 代码随想录.backtracking;
//47. 全排列 II

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/7 11:47
 */
public class Demo47 {
    public static void main(String[] args) {
        System.out.println(permuteUnique(new int[]{1, 1, 2}));
    }

    static List<List<Integer>> res = new ArrayList<>();
    static LinkedList<Integer> path = new LinkedList<>();

    public static List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.fill(used, false);
        Arrays.sort(nums);
        backtracking(nums, used);
        return res;
    }

    public static void backtracking(int[] nums, boolean[] used) {
        if (nums.length == path.size()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            //相等且使用过则直接跳过
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;
            //如果同以树枝没有处理过则开始处理
            if (!used[i]) {
                used[i] = true;
                path.add(nums[i]);
                backtracking(nums, used);
                path.removeLast();
                used[i] = false;
            }
        }
    }
}
