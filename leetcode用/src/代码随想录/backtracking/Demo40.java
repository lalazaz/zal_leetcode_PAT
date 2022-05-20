package 代码随想录.backtracking;
//40. 组合总和 II　上一个版本的不适用重复数字

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/5 12:54
 */
public class Demo40 {
    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
        //System.out.println(combinationSum2(new int[]{2, 5, 2, 1, 2}, 5));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        boolean[] flag = new boolean[candidates.length];
        backtracking(candidates, target, 0, flag);
        return res;
    }

    static List<List<Integer>> res = new ArrayList<>();
    static LinkedList<Integer> path = new LinkedList<>();
    static int sum = 0;

    public static void backtracking(int[] arr, int target, int index, boolean[] flag) {
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < arr.length && arr[i] + sum <= target; i++) {
            //出现重复结点且前面的结点使用过了
            if (i > 0 && arr[i] == arr[i - 1] && !flag[i - 1]) continue;
            flag[i] = true;
            sum += arr[i];
            path.push(arr[i]);
            backtracking(arr, target, i + 1, flag);
            int temp = path.pop();
            flag[i] = false;
            sum -= temp;
        }
    }


    //拿结果后去重超时
   /* static List<List<Integer>> res = new ArrayList<>();
    static LinkedList<Integer> path = new LinkedList<>();

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(res, path, candidates, target, 0, 0);
        return res.stream().distinct().toList();
    }

    public static void backtracking(List<List<Integer>> res, LinkedList<Integer> path, int[] candidates, int target, int sum, int startIndex) {
        if (sum > target) return;
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            if (sum + candidates[i] > target)
                break;
            path.add(candidates[i]);
            backtracking(res, path, candidates, target, sum + candidates[i], i + 1);
            path.remove(path.size() - 1);
        }
    }*/
}
