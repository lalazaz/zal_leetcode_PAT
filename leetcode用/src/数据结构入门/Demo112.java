package 数据结构入门;
//112. 路径总和

import java.util.LinkedList;

/**
 * @author zal
 * @date 2022/5/15 9:14
 */
public class Demo112 {
    public static void main(String[] args) {

    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null)
            return root.val == targetSum;
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
