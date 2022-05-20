package 算法入门;
//136. 只出现一次的数字

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/5/4 8:58
 */
public class Demo136 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1, 1, 2, 2, 3}));
    }
    public static int singleNumber(int[] nums) {
        return Arrays.stream(nums).reduce((a, b) -> a ^ b).getAsInt();
    }
}
