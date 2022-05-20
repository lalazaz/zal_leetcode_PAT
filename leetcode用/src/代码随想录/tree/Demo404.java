package 代码随想录.tree;
//404. 左叶子之和

/**
 * @author zal
 * @date 2022/4/25 20:37
 */
public class Demo404 {
    public static void main(String[] args) {

    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int leftValue = sumOfLeftLeaves(root.left);
        int rightValue = sumOfLeftLeaves(root.right);

        int midValue = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            midValue = root.left.val;
        }
        return leftValue + rightValue + midValue;
    }
}
