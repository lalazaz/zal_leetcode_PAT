package 算法入门;
//283. 移动零

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/4/23 9:27
 */
public class Demo283 {
    public static void main(String[] args) {
        int[] ints = {0, 1, 0, 3, 12};
        moveZeroes(ints);
        System.out.println(Arrays.toString(ints));
    }


    /**
     * 评论大致做法，遍历数组，不为0的元素前移，后面补零
     *
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        for (; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
    /**
     * 思路有问题
     */
/*    public static void moveZeroes(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            if (nums[l] == 0){
                int temp = nums[r];
                nums[r] = 0;
                for (int i = r - 1; i > l; i--) {
                    int temp1 = nums[i];
                    nums[i] = temp;
                    temp = nums[i-1];
                }
            }
        }
    }*/
}
