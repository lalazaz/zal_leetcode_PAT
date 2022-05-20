package 代码随想录.tree;
//112. 路径总和
/**
 * @author zal
 * @date 2022/4/26 10:30
 */
public class Demo112 {
    public static void main(String[] args) {

    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null)return false;
        //减去每个进来结点的value
        targetSum-=root.val;
        //若为叶子结点则判断
        if (root.right==null&&root.left==null){
            return targetSum==0;
        }
        if (root.left!=null){
            boolean left = hasPathSum(root.left, targetSum);
            if (left){
                return true;
            }
        }
        if (root.right!=null){
            return hasPathSum(root.right, targetSum);
        }
        return false;
    }
}
