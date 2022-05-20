package 代码随想录.tree;
//530. 二叉搜索树的最小绝对差

import java.util.Stack;

/**
 * @author zal
 * @date 2022/4/27 17:16
 */
public class Demo530 {
    public static void main(String[] args) {

    }

    public static int getMinimumDifference(TreeNode root) {
        if (root==null)return 0;
        return traversal(root);
    }

    static TreeNode pre;
    public static int traversal(TreeNode node) {
        int res = Integer.MAX_VALUE;
        if (node == null) return 0;
        traversal(node.left);
        if (pre != null) {
            res = Math.min(res, node.val - pre.val);
        }
        pre = node;
        traversal(node.right);
        return res;
    }
}












