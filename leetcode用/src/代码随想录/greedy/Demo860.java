package 代码随想录.greedy;
//860. 柠檬水找零

/**
 * @author zal
 * @date 2022/5/11 20:14
 */
public class Demo860 {
    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5, 5, 5, 10, 20}));
        System.out.println(lemonadeChange(new int[]{5, 5, 10, 10, 20}));
        System.out.println(lemonadeChange(new int[]{5}));
        System.out.println(lemonadeChange(new int[]{10}));
        System.out.println(lemonadeChange(new int[]{20}));
    }

    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5)//客户给5美元
                five++;
            if (bills[i] == 10) {//客户给10美元
                if (five == 0) {
                    return false;
                } else {
                    five--;
                    ten++;
                }
            }
            if (bills[i] == 20) {//客户给20美元
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else return false;
            }
        }
        return true;
    }
}
