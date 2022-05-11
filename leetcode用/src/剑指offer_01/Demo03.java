package 剑指offer_01;
//剑指 Offer 03. 数组中重复的数字

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/4/21 13:26
 */
public class Demo03 {
    public static void main(String[] args) {
        System.out.println(findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
        System.out.println(findRepeatNumber(new int[]{2, 2}));
        System.out.println(findRepeatNumber(new int[]{2, 2, 3}));
        System.out.println(findRepeatNumber(new int[]{2, 3, 3}));
        System.out.println(findRepeatNumber(new int[]{2, 1, 3}));
        System.out.println(findRepeatNumber(new int[]{2, 1, 1, 1}));
        System.out.println(findRepeatNumber(new int[]{2, 1, 4, 5, 6, 7, 8, 9, 8}));
    }

    public static int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        for (; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) break;
        }
        if (i < nums.length - 1)
            return nums[i];
        else return -1;
    }
}
