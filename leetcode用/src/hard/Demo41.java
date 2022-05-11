package hard;
//41. 缺失的第一个正数

/**
 * @author zal
 * @date 2022/4/16 9:08
 */
public class Demo41 {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1, 2, 0}));
        System.out.println(firstMissingPositive(new int[]{1, 2, 0}));
    }

    /**
     * 评论区 @jklp2
     * @param nums
     * @return
     */
    public static int firstMissingPositive(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) nums[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i]) <= nums.length && nums[Math.abs(nums[i]) - 1] > 0)
                nums[Math.abs(nums[i]) - 1] *= -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                res = i + 1;
                return res;
            }
        }
        return nums.length + 1;
    }
}
