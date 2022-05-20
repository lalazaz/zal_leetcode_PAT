package 数据结构入门;
//104. 二叉树的最大深度

/**
 * @author zal
 * @date 2022/5/14 8:39
 */
public class Demo104 {
    public static void main(String[] args) {

    }

    public static int maxDepth(TreeNode root) {
        return max(root, 0);
    }
    //自己写的，不错
    public static int max(TreeNode node, int high) {
        if (node == null) return high;
        return Math.max(max(node.left, high + 1), max(node.right, high + 1));
    }
}
