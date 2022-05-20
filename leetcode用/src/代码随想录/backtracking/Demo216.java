package 代码随想录.backtracking;
//216. 组合总和 III

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/4 10:33
 */
public class Demo216 {
    static List<List<Integer>> res = new ArrayList<>();
    static LinkedList<Integer> path = new LinkedList<>();

    public static void main(String[] args) {
        System.out.println(combinationSum3(3, 7));
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(n, k, 0, 1);
        return res;
    }

    public static void backtracking(int targetSum, int k, int sum, int startIndex) {
        //减枝
        if (sum > targetSum)
            return;
        if (path.size() == k) {
            if (sum == targetSum)
                res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
            sum += i;
            path.add(i);
            backtracking(targetSum, k, sum, i + 1);
            path.removeLast();
            sum -= i;
        }
    }
}
