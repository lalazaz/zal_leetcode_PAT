package 算法入门;
//189. 轮转数组

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author zal
 * @date 2022/4/22 10:39
 */
public class Demo189 {
    public static void main(String[] args) {
        int[] ints = {1, 2};
        rotate(ints, 3);
        System.out.println(Arrays.toString(ints));
    }


    public static void rotate(int[] nums, int k) {
        if (k > nums.length) k = k % nums.length;
        int[] last = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        int[] before = Arrays.copyOfRange(nums, 0, nums.length - k);
        int[] res = Arrays.copyOf(last, before.length + last.length);

        System.arraycopy(before, 0, res, last.length, before.length);
        System.arraycopy(res, 0, nums, 0, res.length);
    }


    /**
     * 暴力
     */
/*    public static void rotate(int[] nums, int k) {
        if (k >= nums.length) k = k % nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = nums.length - k; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = list.get(i);
        }
    }*/
}
