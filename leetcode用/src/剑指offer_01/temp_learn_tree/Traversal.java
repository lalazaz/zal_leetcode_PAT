package 剑指offer_01.temp_learn_tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zal
 * @date 2022/4/24 9:48
 */
//二叉树的遍历            ——       递归
public class Traversal {
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
        System.out.println(postorderTraversal(root));
    }

    //前序遍历解耦
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    //前序,中左右，放到容器中
    public static void preorder(TreeNode root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        preorder(root.left, result);
        preorder(root.right, result);
    }

    //中序解耦
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    //中序遍历，左中右，放到容器中
    public static void inorder(TreeNode root, List<Integer> result) {
        if (root == null) return;
        preorder(root.left, result);
        result.add(root.val);
        preorder(root.right, result);
    }

    //后序解耦？  。。或者叫做简化的操作
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    //后序遍历，左右中，放到容器中
    public static void postorder(TreeNode root, List<Integer> result) {
        if (root == null) return;
        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.val);
    }
}
