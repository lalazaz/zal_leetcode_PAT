package 剑指offer_01;
//剑指 Offer 39. 数组中出现次数超过一半的数字

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/4/23 13:53
 */
public class Demo39 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
        System.out.println(majorityElement(new int[]{1, 2, 2}));
        System.out.println(majorityElement(new int[]{1, 2, 2, 2, 4}));
    }


    /**
     * 摩尔投票法————极限一换一
     */
    public static int majorityElement(int[] nums) {
        int count = 0;
        int card = 0;
        for (Integer i : nums) {
            if (count == 0) card = i;
            count += card == i ? 1 : -1;
        }
        return card;
    }

    /**
     * API
     */
/*    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }*/
}
