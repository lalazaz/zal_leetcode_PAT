package 代码随想录.greedy;
//1005. K 次取反后最大化的数组和

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author zal
 * @date 2022/5/10 11:39
 */
public class Demo1005 {
    public static void main(String[] args) {
        System.out.println(largestSumAfterKNegations(new int[]{4, 2, 3}, 1));
        System.out.println(largestSumAfterKNegations(new int[]{3, -1, 0, 2}, 3));
        System.out.println(largestSumAfterKNegations(new int[]{2, -3, -1, 5, -4}, 2));
    }

    public static int largestSumAfterKNegations(int[] nums, int k) {
        nums = IntStream.of(nums)
                .boxed()
                .sorted(((o1, o2) -> Math.abs(o2) - Math.abs(o1)))
                .mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && k > 0) {
                nums[i] = -nums[i];
                k--;
            }
        }
        while (k % 2 == 1) {
            nums[nums.length - 1] = -nums[nums.length - 1];
            k--;
        }
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }
}
