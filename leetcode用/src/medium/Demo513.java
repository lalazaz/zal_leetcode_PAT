package medium;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

/**
 * @author zal
 * @date 2022/4/25 20:41
 */
public class Demo513 {
    public static void main(String[] args) {

    }

    //递归
    private static int Deep = -1;
    private static int value = 0;

    public static int findBottomLeftValue(TreeNode root) {
        value = root.val;
        findLeftValue(root, 0);
        return value;
    }

    private static void findLeftValue(TreeNode root, int deep) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            if (deep > Deep) {
                value = root.val;
                Deep = deep;
            }
        }
        if (root.left != null) findLeftValue(root.left, deep + 1);
        if (root.right != null) findLeftValue(root.right, deep + 1);
    }


    //层序遍历拿最左边的
/*    public static int findBottomLeftValue(TreeNode root) {
        int res = 0;
        if (root == null) return 0;
        LinkedList<TreeNode> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()) {
            int len = que.size();
            ArrayList<Integer> itemNode = new ArrayList<>();
            while (len > 0) {
                TreeNode tmpNode = que.pop();
                itemNode.add(tmpNode.val);
                if (tmpNode.left != null) que.add(tmpNode.left);
                if (tmpNode.right != null) que.add(tmpNode.right);
                len--;
            }
            res = itemNode.get(0);
        }
        return res;
    }*/
}
