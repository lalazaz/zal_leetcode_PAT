package 代码随想录.tree;
//501. 二叉搜索树中的众数

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zal
 * @date 2022/4/27 19:42
 */
public class Demo501 {
    public static void main(String[] args) {
        //看下遍历情况
        TreeNode root = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        root.left = treeNode1;
        treeNode1.left = new TreeNode(3);
        treeNode1.right = new TreeNode(4);
        root.right = new TreeNode(5);

        preorder(root);
        System.out.println(list);
    }

/*    public static int[] findMode(TreeNode root) {
//        List<Integer> list = Demo501.list.stream().sorted().toList();
        String s = list.toString();
        List<Integer> list1 = list.stream().distinct().toList();
        for (int i = 0; i < list1.size(); i++) {
            思路有问题
        }
    }*/

    static ArrayList<Integer> list = new ArrayList<>();

    //前序拿到所有的值
    public static void preorder(TreeNode root) {
        if (root == null) return;
        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
