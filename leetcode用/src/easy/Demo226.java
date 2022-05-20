package easy;
//226. 翻转二叉树

import java.util.ArrayDeque;

/**
 * @author zal
 * @date 2022/4/25 11:05
 */
public class Demo226 {
    public static void main(String[] args) {

    }

    public static TreeNode invertTree(TreeNode root) {
        //广度优先遍历，队列中的结点交换子节点    //直接递归也可以
        if (root == null) return root;
        ArrayDeque<TreeNode> que = new ArrayDeque<>();
        que.add(root);
        while (!que.isEmpty()) {
            int len = que.size();
            while (len > 0) {
                TreeNode tmpNode = que.pop();
                //交换结点
                TreeNode temp = new TreeNode();
                temp = tmpNode.left;
                tmpNode.left = tmpNode.right;
                tmpNode.right = temp;

                if (tmpNode.left != null) que.add(tmpNode.left);
                if (tmpNode.right != null) que.add(tmpNode.right);
                len--;
            }
        }
        return root;
    }
}
