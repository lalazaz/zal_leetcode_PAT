package easy;
//101. 对称二叉树

/**
 * @author zal
 * @date 2022/4/25 11:35
 */
public class Demo101 {
    public static void main(String[] args) {

    }

    public static boolean isSymmetric(TreeNode root) {
        if (root==null)return true;
            return compare(root.left,root.right);
    }

    //两个树结点是否对称
    public static boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right != null) return false;
        if (left != null && right == null) return false;
        if (left == null && right == null) return true;
        if (left.val != right.val) return false;
        //比较外侧
        boolean compareOutside = compare(left.left, right.right);
        //比较内侧
        boolean compareInsider = compare(left.right, right.left);
        return compareInsider && compareOutside;
    }
}
