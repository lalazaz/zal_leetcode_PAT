package utils;
//@Date 2022/4/14 11:05
//判断是否为素数
public class IsPrime {
    public static Boolean isPrime(int i){
        if (i==1||i<=0)return false;
        int j = 2;
        for (; j <= Math.sqrt(i); j++) {
            if (i % j == 0)return false;
        }
        return true;
    }

    //测试
    public static void main(String[] args) {
        System.out.println(isPrime(4));
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(5));
        System.out.println(isPrime(9));
        System.out.println(isPrime(10));
        System.out.println(isPrime(7));
        System.out.println(isPrime(8));
    }
}
