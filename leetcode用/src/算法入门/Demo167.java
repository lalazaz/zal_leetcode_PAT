package 算法入门;
//167. 两数之和 II - 输入有序数组

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/4/23 9:52
 */
public class Demo167 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{-1, 0}, -1)));
    }

    /**
     * 暴力双指针
     */
    public static int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            if (numbers[l] + numbers[r] == target) break;
            else if (numbers[l] + numbers[r] < target) l++;
            else if (numbers[l] + numbers[r] > target) r--;
        }
        return new int[]{l += 1, r += 1};
    }

    /**
     * 通过二分查找优化右边指针位置,不能优化，因为左边的数据可能为负数
     */
   /* public static int[] twoSum(int[] numbers, int target) {
    }*/

}
