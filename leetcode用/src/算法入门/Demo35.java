package 算法入门;
//35. 搜索插入位置

/**
 * @author zal
 * @date 2022/4/21 20:15
 */
public class Demo35 {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 7}, 6));
        System.out.println(searchInsert(new int[]{1, 3, 5, 7}, 3));
        System.out.println(searchInsert(new int[]{1, 3, 5, 7}, 1));
        System.out.println(searchInsert(new int[]{1, 3, 5, 7}, 7));
        System.out.println(searchInsert(new int[]{1, 3, 5, 7}, 8));
        System.out.println(searchInsert(new int[]{1, 3, 5, 7}, 0));
    }

    public static int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]) return nums.length;
        int l = 0, r = nums.length - 1;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
                if (nums[mid + 1] > target) {
                    mid += 1;
                    break;
                }
            } else if (nums[mid] > target) r = mid - 1;
            else break;
        }
        return mid;
    }
}
