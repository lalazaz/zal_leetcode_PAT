package 代码随想录.tree;
//98. 验证二叉搜索树

import java.util.Stack;

/**
 * @author zal
 * @date 2022/4/27 9:17
 */
public class Demo98 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        System.out.println(isValidBST(root));
    }

    public static boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode pop = stack.pop();
            if (pre != null && pop.val <= pre.val) {
                return false;
            }
            pre = pop;
            root = pop.right;
        }
        return true;
    }
}
