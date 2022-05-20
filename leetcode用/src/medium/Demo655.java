package medium;
//655. 输出二叉树

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zal
 * @date 2022/4/29 14:00
 */
public class Demo655 {

    public static void main(String[] args) {
        //构建一个高度为4的二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        TreeNode treeNode1 = new TreeNode(3);
        root.right = treeNode1;
        treeNode1.left = new TreeNode(4);
        treeNode1.right = new TreeNode(5);
//      System.out.println(height(root));
        List<List<String>> myres = new ArrayList<List<String>>();
        String[][] strings = new String[height(root)][(1 << height(root)) - 1];//这个操作~
        //对strings初始化
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[0].length; j++) {
                strings[i][j] = "";
            }
        }
        printTree(strings,root,0,0,strings[0].length);
        for (String[] s : strings) {
            myres.add(Arrays.asList(s));
        }
        System.out.println(myres);
    }

    //写一个方法，返回这个二叉树的高度
    public static int height(TreeNode root) {
        if (root == null) return 0;
        else {
            int m = height(root.left);
            int n = height(root.right);
            return m > n ? (m + 1) : (n + 1);
        }
    }

    public static void printTree(String[][] res, TreeNode root, int deep, int left, int right) {
        if (root==null)return;
        int mid = left + (right - left) / 2;
        res[deep][mid] = root.val + "";
        printTree(res, root.left, deep + 1, left, mid);
        printTree(res, root.right, deep + 1, mid + 1, right);
    }
}
