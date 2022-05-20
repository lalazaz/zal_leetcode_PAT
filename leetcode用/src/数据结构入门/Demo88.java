package 数据结构入门;
//88. 合并两个有序数组

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/5/5 9:29
 */
public class Demo88 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 0, 0, 0};
        merge(ints, 3, new int[]{2, -11, 9}, 3);
        System.out.println(Arrays.toString(ints));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[j++];
        }
        //System.out.println(Arrays.toString(nums1) + "test");
        qucikSort(nums1, 0, nums1.length - 1);
    }

    //快排
    public static void qucikSort(int[] nums, int left, int right) {
        int l = left, r = right;
        int pivot = nums[l + ((r - l) >> 1)];
        while (l < r) {
            while (nums[l] < pivot) l++;
            while (nums[r] > pivot) r--;
            if (l >= r) break;
            int temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;
            if (nums[l] == pivot) r--;
            if (nums[r] == pivot) l++;
        }
        if (l == r) {
            l++;
            r--;
        }
        if (l < right)
            qucikSort(nums, l, right);
        if (left < r)
            qucikSort(nums, left, r);
    }
}
