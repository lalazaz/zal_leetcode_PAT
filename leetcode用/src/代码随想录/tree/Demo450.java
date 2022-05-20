package 代码随想录.tree;
//450. 删除二叉搜索树中的节点

/**
 * @author zal
 * @date 2022/4/28 14:46
 */
public class Demo450 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode treeNode1 = new TreeNode(3);
        root.left = treeNode1;
        treeNode1.left = new TreeNode(2);
        treeNode1.right = new TreeNode(4);
        root.right = new TreeNode(6);
        deleteNode(root, 3);

    }

    public static TreeNode deleteNode(TreeNode root, int key) {
        root = delete(root, key);
        return root;
    }

    private static TreeNode delete(TreeNode root, int key) {
        //四种删除的情况  还有一种情况没找到这个结点直接返回
        if (root == null) return null;
        if (root.val > key) {
            root.left = delete(root.left, key);
        } else if (root.val < key) {
            root.right = delete(root.right, key);
        } else {
            //找到了相等的结点，但是要判断他们的左右子树情况
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            //都不为空，则找到右子树的最左边的那个结点，然后接上递归时候的根节点
            TreeNode tmp = root.right;
            while (tmp.left != null) {
                tmp = tmp.left;
            }
            //下面两步不太懂
            root.val = tmp.val;
            root.right = delete(root.right, tmp.val);
        }
        return root;
    }
}
