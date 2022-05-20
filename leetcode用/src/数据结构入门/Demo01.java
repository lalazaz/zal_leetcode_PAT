package 数据结构入门;

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/5/5 9:22
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{0, 1, 2, 4}, 3)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }
}
