package 代码随想录.backtracking;
//90. 子集 II

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/7 11:01
 */
public class Demo90 {
    public static void main(String[] args) {
        System.out.println(subsetsWithDup(new int[]{1, 2, 2}));
    }

    static List<List<Integer>> res = new ArrayList<>();
    static LinkedList<Integer> path = new LinkedList<>();

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtracking(nums, 0);
        return res;
    }

    public static void backtracking(int[] nums, int startIndex) {
        res.add(new ArrayList<>(path));
        if (startIndex > nums.length)
            return;
        for (int i = startIndex; i < nums.length; i++) {
            //因为nums排好了序的，所以我们只需要判断相同元素不必重复添加即可  且要考虑数组下标问题
            if (i > startIndex && nums[i - 1] == nums[i])
                continue;
            path.add(nums[i]);
            backtracking(nums, i + 1);
            path.removeLast();
        }
    }
}








