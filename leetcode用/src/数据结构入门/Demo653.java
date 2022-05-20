package 数据结构入门;
//653. 两数之和 IV - 输入 BST

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author zal
 * @date 2022/5/17 8:51
 */
public class Demo653 {
    public static void main(String[] args) {

    }

    public static boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> que = new LinkedList<>();
        que.push(root);
        while (!que.isEmpty()) {
            int len = que.size();
            while (len-- > 0) {
                TreeNode tmpNode = que.pop();
                list.add(tmpNode.val);
                if (tmpNode.left != null) que.add(tmpNode.left);
                if (tmpNode.right != null) que.add(tmpNode.right);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.contains(k - list.get(i)) && k != 2 * list.get(i))
                return true;
        }
        return false;
    }
}
