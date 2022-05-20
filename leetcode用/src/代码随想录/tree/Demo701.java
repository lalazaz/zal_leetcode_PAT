package 代码随想录.tree;
//701. 二叉搜索树中的插入操作

/**
 * @author zal
 * @date 2022/4/28 14:11
 */
public class Demo701 {
    public static void main(String[] args) {

    }

    //迭代，要明白他是二叉搜索树
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        TreeNode root1 = root;
        TreeNode cur = root;
        while (root != null) {
            cur = root;
            if (root.val > val) {
                root = root.left;
            } else if (root.val < val) {
                root = root.right;
            }
        }
        if (cur.val > val) {
            cur.left = new TreeNode(val);
        } else cur.right = new TreeNode(val);
        return root1;
    }


    //递归
/*    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);//递归时候的root为空，则说明找到了合适的位置，直接插入

        if (root.val < val) {
            root.right = insertIntoBST(root.right, val);//当前的值比这个结点值大，拿到这个结点的右子树和他去比
        } else if (root.val > val) {
            root.left = insertIntoBST(root.left, val);//左子树
        }
        return root;
    }*/
}
