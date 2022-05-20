package contest.my_02;
//2274. 不含特殊楼层的最大连续楼层数

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/5/16 12:54
 */
public class Demo2274 {
    public static void main(String[] args) {
        System.out.println(maxConsecutive(2, 9, new int[]{4, 6}));
        System.out.println(maxConsecutive(6, 8, new int[]{7, 6, 8}));
    }

    public static int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int res = 0;
        for (int i = 1; i < special.length; i++) {
            res = Math.max(special[i] - special[i - 1] - 1, res);
        }
        res = Math.max(res, special[0] - bottom);
        res = Math.max(res, top - special[special.length - 1]);
        return res;
    }
}
