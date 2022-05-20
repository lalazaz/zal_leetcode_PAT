package 代码随想录.tree;
//113. 路径总和 II

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zal
 * @date 2022/4/26 10:35
 */
public class Demo113 {
    public static void main(String[] args) {


    }

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        LinkedList<Integer> path = new LinkedList<>();
        preorderdfs(root, targetSum, res, path);
        return res;
    }

    public static void preorderdfs(TreeNode root, int targetSum, List<List<Integer>> res, List<Integer> path) {
        path.add(root.val);
        //如果是叶子结点判断根结点到他的所有路径的和是否和我们目标一致
        if (root.left == null && root.right == null) {
            if (targetSum - root.val == 0) {
                res.add(new ArrayList<>(path));
            }
            return;
        }
        if (root.left != null) {
            preorderdfs(root.left, targetSum-root.val, res, path);
            path.remove(path.size() - 1);//回溯
        }
        if (root.right != null) {
            preorderdfs(root.right, targetSum-root.val, res, path);
            path.remove(path.size() - 1);
        }
    }
}






