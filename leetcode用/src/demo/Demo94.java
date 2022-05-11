package demo;
//94. 二叉树的中序遍历

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zal
 * @date 2022/4/17 20:08
 */
public class Demo94 {
    public static void main(String[] args) {

    }
    static List<Integer> list = new ArrayList<>();
    public static List<Integer> inorderTraversal(TreeNode root) {
/*        if(root==null)return list;
        if(root.left!=null){
            inorderTraversal(root.left);
        }
        list.add(root.val);
        if(root.right!=null){
            inorderTraversal(root.right);
        }*/
        return list;
    }
}
