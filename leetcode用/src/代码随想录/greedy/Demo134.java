package 代码随想录.greedy;
//134. 加油站

/**
 * @author zal
 * @date 2022/5/11 8:51
 */
public class Demo134 {
    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{5, 1, 2, 3, 4}, new int[]{4, 4, 1, 5, 1}));
    }

    //不太明白这个min
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int min = 0;
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            min = Math.min(sum, min);
        }
        if (sum < 0) return -1;
        if (min >= 0) return 0;
        for (int i = gas.length - 1; i > 0; i--) {
            min += (gas[i] - cost[i]);
            if (min >= 0)
                return i;
        }
        return -1;
    }
}
