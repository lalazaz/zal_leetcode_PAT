package demo;

/**
 * @Date 2022/4/3 10:11
 * 12. 整数转罗马数字
 **/
public class Demo12 {
    public static void main(String[] args) {
        int num = 1994;
        System.out.println(intToRoman(num));
    }

    public static String intToRoman(int num) {
        String[] strings = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] ints = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String res = "";
        int p = ints.length - 1;
        while (num >= 0 && p >= 0) {
            if (num >= ints[p]) {
                num -= ints[p];
                res = res+strings[p];
            } else p--;
        }
        return res;
    }
}
