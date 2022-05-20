package 剑指offer_01;
//剑指 Offer 42. 连续子数组的最大和

/**
 * @author zal
 * @date 2022/4/23 18:46
 */
public class Demo42 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(maxSubArray(new int[]{-2, -2, 4, -10, 100}));
        System.out.println(maxSubArray(new int[]{-10}));
        System.out.println(maxSubArray(new int[]{-10, -1}));
    }


    public static int maxSubArray(int[] nums) {
        int all = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (all < 0) {
                all = nums[i];
            } else
                all += nums[i];
            max = Math.max(all, max);
        }
        return max;
    }
/*    public static int maxSubArray(int[] nums) {
        int all = 0, max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            all += nums[i];
            if (all < 0) {
                all = 0;
            } else max = Math.max(max, all);
        }
        return max;
    }*/
}
