package 代码随想录.tree;
//654. 最大二叉树

import java.util.TreeMap;

/**
 * @author zal
 * @date 2022/4/26 16:51
 */
public class Demo654 {
    public static void main(String[] args) {

    }

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree1(nums, 0, nums.length);
    }
    /**
     * 思路就是不断找最大的结点作为根结点，其下标左边的元素都在左子树中，右边的在右子树中，
     * 子树中的结点也是这样找，所以是递归，然后表明结束的条件
     */
    public static TreeNode constructMaximumBinaryTree1(int[] nums, int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex < 1) return null;//没有结点了返回空
        if (rightIndex - leftIndex == 1) return new TreeNode(nums[leftIndex]);//仅有一个结点，就返回这个结点
        //有两个以上的结点了就继续这些结点递归构造
        int maxIndex = leftIndex;//从左到右找根结点，就是最大值
        int maxValue = nums[maxIndex];
        for (int i = leftIndex+1; i < rightIndex; i++) {
            if (maxValue < nums[i]) {
                maxValue = nums[i];
                maxIndex = i;
            }
        }
        //放到树中
        TreeNode root = new TreeNode(maxValue);
        //往下找
        root.left = constructMaximumBinaryTree1(nums, leftIndex, maxIndex);
        root.right = constructMaximumBinaryTree1(nums, maxIndex + 1, rightIndex);
        return root;
    }
}
