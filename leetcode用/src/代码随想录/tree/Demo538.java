package 代码随想录.tree;

/**
 * @author zal
 * @date 2022/4/28 16:54
 */
public class Demo538 {
    public static void main(String[] args) {

    }

    static int sum = 0;

    public static TreeNode convertBST(TreeNode root) {
        convertBST1(root);
        return root;
    }
    //累加树可以认为是结点是右边所有结点的和
    //故我们可以反中序遍历——右中左来得到这一结果
    public static void convertBST1(TreeNode root) {
        if (root == null) return;
        convertBST1(root.right);
        sum += root.val;
        root.val = sum;
        convertBST1(root.left);
    }
}
