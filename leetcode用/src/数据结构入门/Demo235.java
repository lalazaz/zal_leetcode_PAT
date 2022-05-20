package 数据结构入门;
//235. 二叉搜索树的最近公共祖先

/**
 * @author zal
 * @date 2022/5/17 9:02
 */
public class Demo235 {
    public static void main(String[] args) {

    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
        if (root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}
