package 代码随想录.backtracking;
//491. 递增子序列

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/7 11:26
 */
public class Demo491 {
    public static void main(String[] args) {
        System.out.println(findSubsequences(new int[]{4, 6, 7, 7}));
    }

    static List<List<Integer>> res = new ArrayList<>();
    static LinkedList<Integer> path = new LinkedList<>();

    public static List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(nums, 0);
        return res;
    }

    public static void backtracking(int[] nums, int startIndex) {
        if (path.size() > 1) {
            res.add(new ArrayList<>(path));
        }
        int[] used = new int[201];//使用数组来当作hash表
        for (int i = startIndex; i < nums.length; i++) {
            if (!path.isEmpty() && nums[i] < path.get(path.size() - 1) || used[nums[i] + 100] == 1)
                continue;
            used[nums[i] + 100] = 1;
            path.add(nums[i]);
            backtracking(nums, i + 1);
            path.removeLast();
        }
    }
}
