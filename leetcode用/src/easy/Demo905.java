package easy;

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/4/28 9:41
 */
public class Demo905 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{1, 3, 2, 4})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{2, 3})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0, 2})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{8,65,54,3, 2})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{2,1,3,5,7,9,11,13})));
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3,1,4,5,7,9,2})));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            while (nums[left] % 2 == 0) {
                if (left < nums.length - 1) left++;
                else break;
            }
            while (nums[right] % 2 != 0) {
                if (right > 0) right--;
                else break;
            }
            if (left >= right) break;
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
        }
        return nums;
    }
}
