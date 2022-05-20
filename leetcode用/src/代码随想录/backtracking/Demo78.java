package 代码随想录.backtracking;
//78. 子集

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/7 10:36
 */
public class Demo78 {
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 2}));
//        System.out.println(subsets(new int[]{0}));
    }

    static List<List<Integer>> res = new ArrayList<>();
    static LinkedList<Integer> path = new LinkedList<>();

    public static List<List<Integer>> subsets(int[] nums) {
        backtracking(nums, 0);
//        return res.stream().distinct().toList();  //这个效率低(子集II问题)
        return res;
    }

    public static void backtracking(int[] nums, int startIndex) {
        //无条件添加，即每个叶子结点
        res.add(new ArrayList<>(path));
        if (startIndex >= nums.length)
            return;
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            backtracking(nums, i + 1);
            path.removeLast();//最近添加的在末尾
        }
    }
}
