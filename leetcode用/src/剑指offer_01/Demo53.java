package 剑指offer_01;
//剑指 Offer 53 - II. 0～n-1中缺失的数字

/**
 * @author zal
 * @date 2022/4/24 13:31
 */
public class Demo53 {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9}));
        System.out.println(missingNumber(new int[]{0, 1, 3}));
        System.out.println(missingNumber(new int[]{1, 2}));
        System.out.println(missingNumber(new int[]{0, 1, 2}));
    }

    public static int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] ^ i) != 0) return i;
        }
        return nums.length;
    }
}
