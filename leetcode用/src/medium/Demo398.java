package medium;
//398. 随机数索引

/**
 * @author zal
 * @date 2022/4/25 8:58
 */
public class Demo398 {
    public static void main(String[] args) {
        Demo398 d = new Demo398(new int[]{1, 2, 3, 3, 3});
        System.out.println(d.pick(3));
    }

    static int[] res;

    public Demo398(int[] nums) {
        res = nums;
    }

    public int pick(int target) {
        int len = 0;
        for (int i = 0; i < res.length; i++) {
            if (res[i] == target) len++;
        }
        int[] ints = new int[len];
        for (int i = 0, j = 0; i < res.length; i++) {
            if (res[i] == target) ints[j++] = i;
        }
        return ints[(int) (Math.random() * ints.length)];
    }
}
