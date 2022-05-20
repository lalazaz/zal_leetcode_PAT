package 代码随想录.greedy;
//135. 分发糖果

/**
 * @author zal
 * @date 2022/5/11 9:27
 */
public class Demo135 {
    public static void main(String[] args) {

    }

    public static int candy(int[] ratings) {
        int[] candyVec = new int[ratings.length];
        candyVec[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candyVec[i] = candyVec[i - 1] + 1;
            } else candyVec[i] = 1;
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1])
                candyVec[i] = Math.max(candyVec[i], candyVec[i + 1] + 1);
        }
        int res = 0;
        for (int i : candyVec) {
            res += i;
        }
        return res;
    }
}
