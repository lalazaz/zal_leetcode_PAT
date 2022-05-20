package medium;
//105. 从前序与中序遍历序列构造二叉树

import java.util.TreeMap;

/**
 * @author zal
 * @date 2022/5/6 10:32
 */
public class Demo105 {

    //不对
/*    public static void main(String[] args) {
        System.out.println(buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 20, 15, 7}));
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        if (len == 0) return null;
        return build(preorder, 0, len - 1, inorder, 0, len - 1);
    }

    public static TreeNode build(int[] preorder, int head1, int tail1, int[] inorder, int head2, int tail2) {
        if (head1 > tail1 || head2 > tail2) return null;
        int val = preorder[head2];
        int mid = 0;
        while (inorder[head2 + mid] != val) mid++;
        TreeNode root = new TreeNode(val);
        root.left = build(preorder, head1 + 1, head1 + mid - head2, inorder, head2, mid - 1);
        root.right = build(preorder, head1 + mid - head2 + 1, tail1, inorder, mid + 1, tail2 );
        return root;
    }*/
}
