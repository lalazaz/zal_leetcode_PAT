package 剑指offer_01.temp_learn_tree;

import java.util.*;

/**
 * @author zal
 * @date 2022/4/24 10:05
 */
//二叉树的遍历            ——       使用栈的特性迭代
public class Traversal2 {
    public static void main(String[] args) {
        //构造一个tree
        TreeNode root = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        root.left = treeNode2;
        root.right = treeNode3;
        treeNode2.left = new TreeNode(4);
        treeNode2.right = new TreeNode(5);
        //前序
        System.out.println(preorderTraversal(root));
        //中序
        System.out.println(inorderTraversal(root));
        //后序
        System.out.println(postTraversal(root));
    }

    //前序，中左右  ,入栈顺序：中 - 右 - 左
    public static List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            //主要是这个stack弹出来的node会不断的变化
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return result;
    }

    //中序，左中右   入栈顺序：左 - 右   和前序不一样
    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                result.add(cur.val);
                cur = cur.right;
            }
        }
        return result;
    }

    //后序，和前序差不多，  入栈： 中 - 左 - 右   最后反转结果
    public static List<Integer> postTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return null;
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
        Collections.reverse(result);
        return result;
    }
}
