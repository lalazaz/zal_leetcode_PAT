package medium;
//230. 二叉搜索树中第K小的元素

import java.util.ArrayList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/1 19:56
 */
public class Demo230 {
    public static void main(String[] args) {

    }

    //直接遍历，拿第 n - k +1个,但是需要得到所有结点的个数？



    //集合存所有元素（从小到大），返回第k个
/*    static ArrayList<Integer> res;
    public static int kthSmallest(TreeNode root, int k) {
        res = new ArrayList<>();
        inorder(root, res);
        return res.get(k - 1);
    }

    //中序遍历
    public static void inorder(TreeNode root, List<Integer> res) {
        if (root == null) return;
        if (root.left != null) inorder(root.left, res);
        res.add(root.val);
        if (root.right != null) inorder(root.right, res);
    }*/
}
