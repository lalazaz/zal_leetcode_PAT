package medium;
//103. 二叉树的锯齿形层序遍历

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/1 19:37
 */
public class Demo103 {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<TreeNode> que = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root==null)
            return res;
        que.push(root);
        //boolean flag = false;//是否反转的标志
        while (!que.isEmpty()) {
            List<Integer> itemList = new ArrayList<>();
            int len = que.size();
            while (len-- > 0) {
                TreeNode tmpNode = que.pop();
                itemList.add(tmpNode.val);
                if (tmpNode.left != null) que.add(tmpNode.left);
                if (tmpNode.right != null) que.add(tmpNode.right);
            }
            /*if (flag) {
                Collections.reverse(itemList);
                flag = false;
            } else flag = true;*/
            if (res.size()%2!=0)
                Collections.reverse(itemList);
            res.add(itemList);
        }
        return res;
    }
}
