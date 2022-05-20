package 代码随想录.greedy;
//376. 摆动序列

/**
 * @author zal
 * @date 2022/5/9 21:30
 */
public class Demo376 {
    public static void main(String[] args) {
        System.out.println(wiggleMaxLength(new int[]{1, 7, 4, 9, 2, 5}));
        System.out.println(wiggleMaxLength(new int[]{1, 17, 5, 10, 13, 15, 10, 5, 16, 8}));
        System.out.println(wiggleMaxLength(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println(wiggleMaxLength(new int[]{1, 1, 1}));
    }

    public static int wiggleMaxLength(int[] nums) {
        int len = nums.length;
        if (len < 2)
            return len;
        int up = 1, down = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i])
                up = down + 1;
            if (nums[i + 1] < nums[i])
                down = up + 1;
        }
        return Math.max(up, down);
    }
}
