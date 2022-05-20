package easy;
//944. 删列造序

/**
 * @author zal
 * @date 2022/5/12 8:42
 */
public class Demo944 {
    public static void main(String[] args) {
        System.out.println(minDeletionSize(new String[]{"abc", "bce", "cae"}));
        System.out.println(minDeletionSize(new String[]{"cba", "daf", "ghi"}));
        System.out.println(minDeletionSize(new String[]{"a", "b"}));
        System.out.println(minDeletionSize(new String[]{"zyx", "wvu", "tsr"}));
        System.out.println(minDeletionSize(new String[]{"rrjk", "furt", "guzm"}));
    }

    public static int minDeletionSize(String[] strs) {
        int res = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            int temp = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (temp > strs[j].charAt(i)) {
                    res++;
                    break;
                }
                temp = strs[j].charAt(i);
            }
        }
        return res;
    }
}
