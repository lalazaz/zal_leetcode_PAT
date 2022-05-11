package demo;

//@Date 2022/4/11 19:04
//357. 统计各位数字都不同的数字个数
public class Demo357 {
    public static void main(String[] args) {
        System.out.println(countNumbersWithUniqueDigits(3));
    }

    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int x = 9;
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res+=x;
            x*=(10-i);
        }
        return res;
    }
}
