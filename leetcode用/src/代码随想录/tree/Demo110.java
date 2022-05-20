package 代码随想录.tree;
//110. 平衡二叉树

/**
 * @author zal
 * @date 2022/4/25 17:05
 */
public class Demo110 {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    private int getHeight(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = getHeight(root.left);
        if (leftHeight == -1) return -1;

        int rightHeight = getHeight(root.right);
        if (rightHeight == -1) return -1;

        //此结点的左右子树高度相差超过1，返回-1
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
