package demo;
//@Date 2022/4/15 12:24
//136. 只出现一次的数字   ————牛客写过
public class Demo136 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1, 1, 2, 3, 2}));
        System.out.println(singleNumber(new int[]{1, 1, 2, 3, 3}));
    }
    public static int singleNumber(int[] nums) {
        int res = 0;
        for (Integer i : nums) {
            res = res^i;
        }
        return res;
    }
}
