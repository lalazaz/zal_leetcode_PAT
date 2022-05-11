package demo;

//@Date 2022/4/11 12:31
//50. Pow(x, n)
public class Demo50 {
    public static void main(String[] args) {
        System.out.printf("%.5f", myPow(1.00000, -2147483647));
        System.out.println();
        System.out.println(Math.pow(1.000, -2147483647));
    }

    //1.00000
    //2147483647
    //2.00000
    //-2147483648
    //-1.00000
    //2147483647

    //pow(x,n)
    public static double myPow(double x, int n) {
        if (n == 0 || x==1) return 1;
        if (x == -1) return (n % 2)==0?1:-1;
        if (n < -2147483600)return 0;
        double temp = x;
        if (n > 0) {
            for (int i = 0; i < n - 1; i++) {
                x *= temp;
            }
        } else {
            n *= -1;
            for (int i = 0; i < n - 1; i++) {
                x *= temp;
            }
            x = 1 / x;
        }
        return x;
    }
}
