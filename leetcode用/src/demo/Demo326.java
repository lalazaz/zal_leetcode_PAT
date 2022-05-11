package demo;
//@Date 2022/4/14 15:36
//326. 3 的幂
public class Demo326 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree2(1));
        System.out.println(isPowerOfThree2(3));
        System.out.println(isPowerOfThree2(9));
        System.out.println(isPowerOfThree2(27));
        System.out.println(isPowerOfThree2(1162261467));
        System.out.println(isPowerOfThree2(2187));
        System.out.println(isPowerOfThree2(1594323));
        System.out.println(isPowerOfThree2(2187));
    }
    public static boolean isPowerOfThree(int n) {
        int temp = 1;
        for (; temp <= n; temp*=3) {
            if (temp==n)return true;
        }
        return false;
    }

    //不用循环
    public static boolean isPowerOfThree2(int n) {
        return n>=1&&1162261467%n==0;
    }
}
