package 数据结构入门;
//700. 二叉搜索树中的搜索

/**
 * @author zal
 * @date 2022/5/16 8:58
 */
public class Demo700 {
    public static void main(String[] args) {

    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        TreeNode res = new TreeNode();
        if (root.val < val) res = searchBST(root.right, val);
        if (root.val > val) res = searchBST(root.left, val);
        return res;
    }
}
