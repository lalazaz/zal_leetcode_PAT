package easy;
//66. 加一

import java.util.Arrays;

/**
 * @author zal
 * @date 2022/5/5 18:39
 */
public class Demo66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 0})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
    }

    //在数组本身上进行，除非是999类似的情况就开辟新数组
    public static int[] plusOne(int[] digits) {
        int l = digits.length;
        for (int i = l - 1; i > -1; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        int[] res = new int[l + 1];
        res[0] = 1;
        return res;
    }
/*    public static int[] plusOne(int[] digits) {
        int flag = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int temp = digits[i] + flag;
            flag = temp / 10;
            digits[i] = temp % 10;
        }
        int[] res = new int[flag + digits.length];
        if (flag == 0)
            return digits;
        else {
            res[0] = 1;
            for (int i = 1; i < digits.length; i++) {
                res[i] = digits[i];
            }
        }
        return res;
    }*/
}
