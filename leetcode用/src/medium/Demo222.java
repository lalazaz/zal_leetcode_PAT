package medium;
//222. 完全二叉树的节点个数

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zal
 * @date 2022/4/25 16:48
 */
public class Demo222 {
    public static void main(String[] args) {

    }


    public static int countNodes(TreeNode root) {
        int res = 0;
        if (root == null) return res;
        LinkedList<TreeNode> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()) {
            int len = que.size();
            while (len > 0) {
                TreeNode tmpNode = que.pop();
                res++;
                if (tmpNode.left != null) que.add(tmpNode.left);
                if (tmpNode.right != null) que.add(tmpNode.right);
                len--;
            }
        }
        return res;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
