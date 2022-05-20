package 剑指offer_01;
//剑指 Offer 40. 最小的k个数

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/4/23 17:34
 */
public class Demo40 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getLeastNumbers(new int[]{3, 2, 1}, 2)));
        System.out.println(Arrays.toString(getLeastNumbers(new int[]{0, 1, 2, 1}, 1)));
    }

    /**
     * 快排复习一下
     */
    public static int[] getLeastNumbers(int[] arr, int k) {
        quickSort(arr, 0, arr.length - 1);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    //快排
    public static void quickSort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int pivot = arr[(left + right) / 2];
        int temp = 0;
        //这个循环的本质是以pivot作为中间点，不断交换左右数据，使得左边的数据都小于他，右边的数据都大于他
        while (l < r) {
            while (arr[l] < pivot) {
                l += 1;
            }
            while (arr[r] > pivot) {
                r -= 1;
            }
            if (l >= r) break;
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            //左边或者右边的数据有等于中间数据的
            if (arr[l] == pivot) r -= 1;
            if (arr[r] == pivot) l += 1;
        }
        //下面这是啥意思？
        if (l == r) {
            l += 1;
            r -= 1;
        }
        //向左递归
        if (left < r) {
            quickSort(arr, left, r);
        }
        //向右递归
        if (right > l) {
            quickSort(arr, l, right);
        }
    }
}
