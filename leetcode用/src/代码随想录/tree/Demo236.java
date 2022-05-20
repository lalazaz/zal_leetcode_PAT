package 代码随想录.tree;
//236. 二叉树的最近公共祖先

/**
 * @author zal
 * @date 2022/4/28 13:56
 */
public class Demo236 {
    public static void main(String[] args) {

    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null && right == null) {//递归结束，没有找到结点
            return null;
        } else if (left == null && right != null) {//找到一个
            return right;
        } else if (left != null && right == null) {
            return left;
        } else return root;
    }
}
