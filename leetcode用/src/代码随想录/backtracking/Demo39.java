package 代码随想录.backtracking;
//39. 组合总和

import java.util.*;

/**
 * @author zal
 * @date 2022/5/5 11:06
 */
public class Demo39 {
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{1, 2, 3, 7, 6}, 7));
    }

    //
    static List<List<Integer>> res = new ArrayList<>();
    static LinkedList<Integer> path = new LinkedList<>();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(res, path, candidates, target, 0, 0);
        return res;
    }

    public static void backtracking(List<List<Integer>> res, List<Integer> path, int[] candidates, int target, int sum, int startIndex) {
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }
        //因为排了序，所以可以从startIndex开始
        for (int i = startIndex; i < candidates.length; i++) {
            if (sum + candidates[i] > target) break;
            path.add(candidates[i]);
            backtracking(res, path, candidates, target, sum + candidates[i], i + 1);
            path.remove(path.size() - 1);//回溯
        }
    }
}
