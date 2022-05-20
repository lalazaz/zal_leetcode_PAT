package medium;
//442. 数组中重复的数据

import java.util.ArrayList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/8 9:12
 */
public class Demo442 {
    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(findDuplicates(new int[]{1, 1, 2}));
        System.out.println(findDuplicates(new int[]{1}));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int[] ints = new int[10001];
        List<Integer> res = new ArrayList<>();
        for (Integer num : nums) {
            if (ints[num] != 0)
                res.add(num);
            ints[num] = 1;
        }
        return res;
    }
}
