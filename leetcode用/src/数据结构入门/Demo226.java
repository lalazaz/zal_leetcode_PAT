package 数据结构入门;

/**
 * @author zal
 * @date 2022/5/15 9:08
 */
public class Demo226 {
    public static void main(String[] args) {

    }

    public static TreeNode invertTree(TreeNode root) {
        reverse(root);
        return root;
    }

    public static void reverse(TreeNode node) {
        if (node == null) return;
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        reverse(node.left);
        reverse(node.right);
    }
}
