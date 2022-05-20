package 代码随想录.tree;
//108. 将有序数组转换为二叉搜索树

/**
 * @author zal
 * @date 2022/4/28 16:33
 */
public class Demo108 {
    public static void main(String[] args) {

    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length);
    }

    public static TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left >= right)
            return null;
        if (right - left == 1)
            return new TreeNode(nums[left]);

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, left, mid);
        root.right = sortedArrayToBST(nums, mid + 1, right);
        return root;
    }
}
