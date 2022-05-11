package demo;

//@Date 2022/4/13 13:00
//53. 最大子数组和
public class Demo53 {
    public static void main(String[] args) {
        int[] ints = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(ints));
        System.out.println(maxSubArray(new int[]{5,4,-1,7,8}));
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (Integer num : nums) {
            if (sum > 0) {
                sum += num;
            } else sum = num;
            max = Math.max(sum, max);
        }
        return max;
    }
}
