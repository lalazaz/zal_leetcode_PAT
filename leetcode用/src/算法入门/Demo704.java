package 算法入门;
//704. 二分查找

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/4/21 19:18
 */
public class Demo704 {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
        System.out.println(search(new int[]{5}, 5));
    }

    public static int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] < target) l = mid + 1;
            else if (nums[mid] > target) r = mid - 1;
            else return mid;
        }
        return -1;
    }
}
