package 代码随想录.greedy;
//55. 跳跃游戏

import java.sql.Array;
import java.util.ArrayList;

/**
 * @author zal
 * @date 2022/5/9 22:04
 */
public class Demo55 {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(canJump(new int[]{3, 2, 1, 0, 4}));
        System.out.println(canJump(new int[]{3, 2, 2, 0, 4}));
        System.out.println(canJump(new int[]{3, 4, 0, 0, 4}));
    }


    //转为覆盖范围的问题，若最终能覆盖到最后的结果，则返回true    覆盖范围由当前下标加值贪心得到
    //再覆盖范围内更新最大覆盖范围————又是一个贪心的思想
    public static boolean canJump(int[] nums) {
        if (nums.length == 1)
            return true;
        int coverRange = 0;
        for (int i = 0; i <= coverRange; i++) {
            coverRange = Math.max(coverRange, i + nums[i]);
            if (coverRange >= nums.length - 1)
                return true;
        }
        return false;
    }

    //有问题，不能只看0的，很多地方有bug（比如很多0连续的情况）
    //找到所有零的下标，分割数组，满足所有的零离他前面的元素和他的下标至少有一个不同，所有的零同时满足
/*    public static boolean canJump(int[] nums) {
        ArrayList<Integer> zp = new ArrayList<>();
        zp.add(0);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zp.add(i);
        }
        for (int i = 1; i < zp.size(); i++) {
            int pre = zp.get(i - 1);
            int p = zp.get(i), j = pre;
            for (; j < p; j++) {
                if (p - nums[j] < j)
                    break;
            }
            if (j == p) return false;
        }
        return true;
    }*/
}
