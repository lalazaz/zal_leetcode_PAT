package 代码随想录.tree;
//617. 合并二叉树

import java.util.Stack;

/**
 * @author zal
 * @date 2022/4/26 17:18
 */
public class Demo617 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(2);
        treeNode2.right = new TreeNode(5);
        TreeNode treeNode = mergeTrees(treeNode1, treeNode2);
        System.out.println(treeNode.right.val);
    }

    /**
     * 栈实现
     * 两个结点入栈，子结点均不为空就加到root1中，root1子结点为空就把置为root2的子结点
     * 返回root1
     */
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root2);
        stack.push(root1);
        while (!stack.isEmpty()) {
            TreeNode r1 = stack.pop();
            TreeNode r2 = stack.pop();
            r1.val += r2.val;
            if (r2.right != null && r1.right != null) {
                stack.push(r2.right);
                stack.push(r1.right);
            } else {
                if (r1.right == null) {
                    r1.right = r2.right;
                }
            }
            if (r1.left != null && r2.left != null) {
                stack.push(r2.left);
                stack.push(r1.left);
            } else {
                if (r1.left == null) {
                    r1.left = r2.left;
                }
            }
        }
        return root1;
    }


    /**
     * 同时前序遍历两个子树，一个树的结点为空则返回另一个树的这个结点值
     * 两个都不为空。用一个新的结点来拿到两个结点的和
     * 不断递归直到遍历完所有的结点
     */
/*    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        TreeNode newNode = new TreeNode(root1.val + root2.val);
        newNode.left = mergeTrees(root1.left, root2.left);
        newNode.right = mergeTrees(root1.right, root2.right);
        return newNode;
    }*/
}
