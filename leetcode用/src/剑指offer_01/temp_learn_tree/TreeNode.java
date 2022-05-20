package 剑指offer_01.temp_learn_tree;


/**
 * @author zal
 * @date 2022/4/24 9:39
 */
//定义一个标准的二叉树
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
