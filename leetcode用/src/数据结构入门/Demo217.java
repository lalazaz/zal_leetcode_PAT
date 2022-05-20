package 数据结构入门;
//217. 存在重复元素

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zal
 * @date 2022/5/4 9:18
 */
public class Demo217 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 1, 2, 3}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 2}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 3}));
        System.out.println(containsDuplicate(new int[]{1, 1}));
        System.out.println(containsDuplicate(new int[]{1}));
    }

    //set
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        return set.size() != nums.length;
    }
    //stream
/*    public static boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().toArray().length != nums.length;
    }*/
    //两层循环
/*    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] ^ nums[j]) == 0)
                    return true;
            }
        }
        return false;
    }*/
}
