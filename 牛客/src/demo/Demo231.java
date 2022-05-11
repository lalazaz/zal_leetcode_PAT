package demo;

import java.util.Arrays;

//@Date 2022/4/14 19:46
//NC231 只出现一次的数字
public class Demo231 {
    public static void main(String[] args) {
        int[] ints = {-1, 3, -1};
        System.out.println(singleNumber(ints));
        System.out.println(singleNumber2(ints));
    }


    //牛客红名大佬的方法
    //任何数字异或相同的数字为0
    //任何数字异或0为自己
    public static int singleNumber2(int[] nums) {
        // write code here
        int res = 0;
        for (int i : nums)
            res ^= i;
        return res;
    }
    //超时
    public static int singleNumber(int[] nums) {
        // write code here
        String nums_string = Arrays.toString(nums);
        int i = 0;

        for (; i < nums.length; i++) {
            String temp = nums_string
                    .replaceFirst(nums[i] + "", "");
            if (!temp.contains(nums[i] + "")) break;
        }
        return nums[i];
    }
}
