package 算法入门;
//977. 有序数组的平方

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/4/22 9:57
 */
public class Demo977 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -3, -1, 0, 3, 10, 11, 11})));
    }

    public static int[] sortedSquares(int[] nums) {
        int k = nums.length - 1;
        int[] res = new int[nums.length];
        int i = 0, j = nums.length - 1;
        for (; i <= j; ) {
            if (nums[i] * nums[i] <= nums[j] * nums[j]) {
                res[k--] = nums[j] * nums[j];
                j--;
            } else {
                res[k--] = nums[i] * nums[i];
                i++;
            }
        }
        return res;
    }
}
