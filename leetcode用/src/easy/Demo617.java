package easy;
//617. 合并二叉树

import java.util.Stack;

/**
 * @author zal
 * @date 2022/4/28 10:01
 */
public class Demo617 {
    public static void main(String[] args) {

    }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root1);
        stack.push(root2);
        while (!stack.isEmpty()) {
            TreeNode node2 = stack.pop();
            TreeNode node1 = stack.pop();
            node1.val += node2.val;
            if (node1.left != null && node2.left != null) {
                stack.push(node1.left);
                stack.push(node2.left);
            }else {
                if (node1.left==null)node1.left = node2.left;
            }
            if (node1.right != null && node2.right != null) {
                stack.push(node1.right);
                stack.push(node2.right);
            }else {
                if (node1.right==null)node1.right = node2.right;
            }
        }
        return root1;
    }
}
