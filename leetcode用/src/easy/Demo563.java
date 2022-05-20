package easy;
//563. 二叉树的坡度

import java.util.TreeMap;

/**
 * @author zal
 * @date 2022/4/29 15:30
 */
public class Demo563 {
    static int res = 0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        TreeNode treeNode1 = new TreeNode(3);
        root.right = treeNode1;
        treeNode1.left = new TreeNode(4);
        treeNode1.right = new TreeNode(5);
        //
        System.out.println(findTilt(root));
    }
    public static int findTilt(TreeNode root) {
        sum(root);
        return res;
    }
    public static int sum(TreeNode root){
        if (root==null)return 0;
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        res += Math.abs(leftSum - rightSum);
        return root.val+leftSum+rightSum;
    }
}
