package 数据结构入门;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/14 8:34
 */
public class Demo102 {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        LinkedList<TreeNode> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()) {
            ArrayList<Integer> itemNodes = new ArrayList<>();
            int len = que.size();
            while (len-- > 0) {
                TreeNode tmpNode = que.pop();
                itemNodes.add(tmpNode.val);
                if (tmpNode.left != null) que.add(tmpNode.left);
                if (tmpNode.right != null) que.add(tmpNode.right);
            }
            res.add(itemNodes);
        }
        return res;
    }
}
