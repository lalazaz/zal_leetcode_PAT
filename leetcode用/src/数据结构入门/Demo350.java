package 数据结构入门;
//350. 两个数组的交集 II

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/6 10:18
 */
public class Demo350 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        ArrayList<Integer> res_l = new ArrayList<>();
        for (Integer i : nums1) list.add(i);
        for (int i : nums2) {
            if (list.contains(i)) {
                res_l.add(i);
                list.remove((Object)i);
            }
        }
        int[] res = new int[res_l.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = res_l.get(i);
        }
        return res;
    }
}
