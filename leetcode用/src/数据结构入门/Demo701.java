package 数据结构入门;
//701. 二叉搜索树中的插入操作

/**
 * @author zal
 * @date 2022/5/16 9:03
 */
public class Demo701 {
    public static void main(String[] args) {

    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root==null)return new TreeNode(val);
        TreeNode root1 = root;
        TreeNode cur = root;
        while (root!= null) {
            cur = root;
            if (root.val < val)
                root = root.right;
            else if (root.val > val)
                root = root.left;
        }
        if(cur.val > val)cur.left = new TreeNode(val);
        else cur.right = new TreeNode(val);
        return root1;
    }
}
