package 代码随想录.backtracking;
//77. 组合

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/1 10:12
 */
public class Demo77 {
    static List<List<Integer>> res = new ArrayList<List<Integer>>();
    static LinkedList<Integer> path = new LinkedList<>();

    public static void main(String[] args) {
        System.out.println(combine(10, 3));
    }

    public static List<List<Integer>> combine(int n, int k) {
        backtracking(n, k, 1);
        return res;
    }

    public static void backtracking(int n, int k, int startIndex) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            backtracking(n, k, i + 1);
            path.removeLast();
        }
    }
}
