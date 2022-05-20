package 代码随想录.greedy;
//45. 跳跃游戏 II

/**
 * @author zal
 * @date 2022/5/10 11:17
 */
public class Demo45 {
    public static void main(String[] args) {

    }

    public static int jump(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1)
            return 0;
        int res = 0;
        int curDistance = 0;
        int maxDistance = 0;
        for (int i = 0; i < nums.length; i++) {
            maxDistance = Math.max(maxDistance, i + nums[i]);
            if (maxDistance >= nums.length - 1) {
                res++;
                break;
            }
            if (i == curDistance) {
                curDistance = maxDistance;
                res++;
            }
        }
        return res;
    }
}
