package 数据结构入门;
//98. 验证二叉搜索树

import java.util.ArrayList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/17 9:05
 */
public class Demo98 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        List<Integer> list1 = list.stream().distinct().toList();
        System.out.println(list1);
    }

    public static boolean isValidBST(TreeNode root) {
        inorder(root);
        List<Integer> list2 = list;
        list = list.stream()
                .sorted().distinct().toList();
        //System.out.println(list);
        //System.out.println(list2);
        if (list2.size()!=list.size())
            return false;
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i)!=list.get(i))
                return false;
        }
        return true;
    }

    static List<Integer> list = new ArrayList<>();

    public static void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        list.add(node.val);
        inorder(node.right);
    }
}
