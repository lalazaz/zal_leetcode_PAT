package easy;
//268. 丢失的数字

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/5/16 9:17
 */
public class Demo268 {
    public static void main(String[] args) {
        int[] ints = {123, 4, -123, 4, 4, 4, 4, 1};
        quickSort(ints, 0, ints.length - 1);
        System.out.println(Arrays.toString(ints));

        int[] ints1 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        quickSort(ints1, 0, ints1.length - 1);
        System.out.println(Arrays.toString(ints1));
    }

    public static int missingNumber(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i)
                return i;
        }
        return nums.length;
    }

    public static void quickSort(int[] arr, int left, int right) {
        int l = left, r = right;
        int qivot = arr[(left + right) / 2];

        while (l < r) {
            while (arr[l] < qivot) l++;
            while (arr[r] > qivot) r--;
            if (l >= r) break;
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            if (arr[l] == qivot) r--;
            if (arr[r] == qivot) l++;
        }
        if (l == r) {
            l++;
            r--;
        }
        if (left < r) {
            quickSort(arr, left, r);
        }
        if (l < right) {
            quickSort(arr, l, right);
        }
    }
}
