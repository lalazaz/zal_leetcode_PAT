package 数据结构入门;
//101. 对称二叉树

/**
 * @author zal
 * @date 2022/5/14 8:44
 */
public class Demo101 {
    public static void main(String[] args) {

    }

    //递归
    public static boolean isSymmetric(TreeNode root) {
        if (root == null || root.left == null && root.right == null)
            return true;
        return isSymmetric(root.left, root.right);
    }

    public static boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right != null || left != null && right == null ||
                left != null && right != null && left.val != right.val)
            return false;
        if (left==null&&right==null)
            return true;
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
