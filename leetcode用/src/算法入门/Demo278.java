package 算法入门;
//278. 第一个错误的版本

/**
 * @author zal
 * @date 2022/4/21 19:29
 */
public class Demo278 {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
        System.out.println(isBadVersion(4));
        System.out.println(isBadVersion(3));
    }

    /**
     * 就是找恰好 n是错的，n-1是好的
     */

    public static int firstBadVersion(int n) {
        int l = 1, r = n;
        while (l <= r) {
            //若r和l都超所Ineger一半后会溢出
//            int mid =  (r + l) / 2 ;
            int mid = l + (r - l) / 2;
            if (!(isBadVersion(mid))) l = mid + 1;
            else r = mid - 1;
        }
        return l;
    }

    static boolean isBadVersion(int version) {
        //4是第一个错误的版本
        return version >= 4;
    }
}
