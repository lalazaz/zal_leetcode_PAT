package contest.my_02;
//2275. 按位与结果大于零的最长组合

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/16 13:00
 */
public class Demo2275 {
    public static void main(String[] args) {
        //System.out.println(largestCombination(new int[]{16, 17, 71, 62, 12, 24, 14}));
        //System.out.println(largestCombination(new int[]{8, 8}));
        System.out.println(largestCombination(new int[]{33, 93, 31, 99, 74, 37, 3, 4, 2, 94, 77, 10, 75, 54, 24, 95, 65, 100, 41, 82, 35, 65, 38, 49, 85, 72, 67, 21, 20, 31}));
        //System.out.println(largestCombination(new int[]{935, 1, 2, 4, 6100, 43, 43, 431, 412, 41, 82, 35, 65, 38, 49, 85, 72, 67, 21, 20, 31}));
    }

    /**
     * 超时  ——  暴力
     */
    public static int largestCombination(int[] candidates) {
        int ans = 0;
        List<List<Integer>> subsets = subsets(candidates);
        System.out.println(subsets);
        for (int i = 0; i < subsets.size(); i++) {
            List<Integer> list = subsets.get(i);
            if (!list.isEmpty()) {
                int temp = list.get(0);
                for (int j = 1; j < list.size(); j++) {
                    temp &= list.get(j);
                    if (j == list.size() - 1 && temp != 0) {
                        ans = Math.max(ans, list.size());//这里可以排序后逆向
                    }
                }
            }
        }
        return ans;
    }

    static List<List<Integer>> res = new ArrayList<>();
    static LinkedList<Integer> path = new LinkedList<>();

    public static List<List<Integer>> subsets(int[] nums) {
        backtracking(nums, 0);
        return res;
    }

    public static void backtracking(int[] nums, int startIndex) {
        res.add(new ArrayList<>(path));
        if (startIndex > nums.length)
            return;
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            backtracking(nums, i + 1);
            path.removeLast();
        }
    }








 /*   static int res = 0;
    static LinkedList<Integer> path = new LinkedList<>();

    public static int largestCombination(int[] candidates) {
//        Arrays.sort(candidates);
        backtracking(candidates, 0);
        return res;
    }

    public static void backtracking(int[] arr, int startIndex) {
        //对path判断————符合要求长度结果给res
        if (!path.isEmpty()) {
            int temp = path.get(0);
            for (int i = 1; i < path.size(); i++) {
                temp = path.get(i) & temp;
                if (i == path.size() - 1 && temp != 0) {
                    res = Math.max(res, path.size());
                }
            }
        }
        if (startIndex > arr.length) return;
        for (int i = startIndex; i < arr.length; i++) {
            path.add(arr[i]);
            backtracking(arr, i + 1);
            path.removeLast();
        }
    }*/
}
