package 剑指offer_01;
//剑指 Offer 21. 调整数组顺序使奇数位于偶数前面

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/4/22 10:16
 */
public class Demo21 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(exchange(new int[]{1, 2, 3, 4, 5, 6, 7, 8})));
    }

    /**
     * 双指针   他没有要求奇数在前面需要排序的
     * 	2 ms	49.3 MB	Java
     */
    public static int[] exchange(int[] nums) {
        int[] res = new int[nums.length];
        int k = 0;
        for (int i = 0, j = nums.length - 1; i <= j; i++, j--) {
            if (nums[i] % 2 == 1) res[k++] = nums[i];
            if (i != j)
                if (nums[j] % 2 == 1) res[k++] = nums[j];
        }
        for (int i = 0, j = nums.length - 1; i <= j; i++, j--) {
            if (nums[i] % 2 == 0) res[k++] = nums[i];
            if (i != j)
                if (nums[j] % 2 == 0) res[k++] = nums[j];
        }
        return res;
    }

    /**
     * 暴力
     * 	2 ms	49.5 MB	Java
     */
    /*public static int[] exchange(int[] nums) {
        int[] res = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                res[j++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                res[j++] = nums[i];
            }
        }
        return res;
    }*/
}
