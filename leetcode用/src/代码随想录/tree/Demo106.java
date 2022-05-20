package 代码随想录.tree;
//106. 从中序与后序遍历序列构造二叉树

/**
 * @author zal
 * @date 2022/4/26 11:14
 */
public class Demo106 {
    public static void main(String[] args) {

    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildMyTree(inorder, 0, inorder.length,
                postorder, 0, postorder.length);
    }

    public static TreeNode buildMyTree(int[] inorder, int inLeft, int inRight,
                                       int[] postorfer, int postLeft, int postRight) {

        if (inRight - inLeft < 1) return null;//没有元素
        if (inRight - inLeft == 1) return new TreeNode(inorder[inLeft]);//只有一个元素
        //剩下的情况就是中序遍历的当前情况左子树超过两个结点，则需要再找其中的结点
        //后序遍历的最后一个结点就是根节点
        int rootVal = postorfer[postRight - 1];
        TreeNode root = new TreeNode(rootVal);
        //找到他在中序遍历的位置
        int rootIndex = 0;
        for (int i = inLeft; i < inRight; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        //因为左边的这个子树超过两个结点，需要再重新划分子树，根据这个根结点划分
        root.left = buildMyTree(inorder, inLeft, rootIndex,
                postorfer, postLeft,  postLeft + (rootIndex - inLeft));
        root.right = buildMyTree(inorder, rootIndex + 1, inRight,
                postorfer, postLeft + (rootIndex - inLeft), postRight - 1);
        return root;
    }
}
