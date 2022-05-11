package demo;

/**
 * @Date 2022/4/2 9:18
 * 29. 两数相除、
 *
 *
 *
 * 超时与边界问题    ——   使用了除法直接算了..
 **/
public class Demo29 {
    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));

/*        int test = -2147483648;
        System.out.println(-test);
        System.out.println(Integer.MAX_VALUE);*/
    }

    public static int divide(int dividend, int divisor) {
        int res = 0;
        int temp = divisor;
        if (dividend < 0 && divisor < 0) {
            if (dividend == divisor) return 1;
            else if (divisor==-1 && dividend==-2147483648) return 2147483647;
            else {
                while (divisor >= dividend){
                    divisor+=temp;
                    res++;
                }
                return res;
            }
        } else {

            if ((dividend > 0 && divisor > 0)) {
                if (divisor==1) return dividend;
                while (divisor <= dividend) {
                    divisor += temp;
                    res++;
                }
                return res;
            } else {
                if (divisor==1)return dividend;
                if (divisor==-1) return -dividend;
                res = 0;
                //int temp = divisor;
                if (dividend > 0) {
                    int dividend_temp = -dividend;
                    while (divisor >= dividend_temp) {
                        divisor += temp;
                        res++;
                    }
                } else {
                    int dividend_temp = -dividend;
                    while (divisor <= dividend_temp) {
                        divisor += temp;
                        res++;
                    }
                }
                return -res;
            }
        }
    }
}
