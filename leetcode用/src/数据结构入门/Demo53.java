package 数据结构入门;
//53. 最大子数组和

/**
 * @author zal
 * @date 2022/5/4 9:27
 */
public class Demo53 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (num > 0)
                num += nums[i];
            else num = nums[i];

            res = Math.max(res, num);
        }
        return res;
    }
}
