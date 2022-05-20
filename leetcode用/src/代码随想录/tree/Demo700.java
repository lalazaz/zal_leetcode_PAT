package 代码随想录.tree;
//700. 二叉搜索树中的搜索

import java.util.Stack;

/**
 * @author zal
 * @date 2022/4/26 17:50
 */
public class Demo700 {
    public static void main(String[] args) {

    }

    //普通栈，还可以优化为不用栈直接判断他们的值，然后覆盖
    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode tmpNode = stack.pop();
            if (tmpNode.val==val)return tmpNode;
            if (tmpNode.right!=null)
                stack.push(tmpNode.right);
            if (tmpNode.left!=null)
                stack.push(tmpNode.left);
        }
        return null;
    }

    //因为是二叉搜索树，其左子树的值小于根结点，右子树的值大于根节点
/*    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        if (root.val > val) return searchBST(root.left, val);
        else return searchBST(root.right, val);
    }*/
}
