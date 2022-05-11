package 剑指offer_01;
//剑指 Offer 11. 旋转数组的最小数字

/**
 * @author zal
 * @date 2022/4/21 14:35
 */
public class Demo11 {
    public static void main(String[] args) {
        System.out.println(minArray(new int[]{3, 4, 5, 1, 2}));
        System.out.println(minArray(new int[]{3, 4, 5, 0, 1, 2}));
        System.out.println(minArray(new int[]{1, 2, 3, 4, -1, 0}));
    }

    /**
     * 评论区的二分法
     * @param numbers
     * @return
     */
    public static int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if (numbers[right] > numbers[mid]) {
                right = mid;
            } else if (numbers[right] < numbers[mid]) {
                left = mid + 1;
            } else {
                //去重
                right--;
            }
        }
        return numbers[left];
    }
    /**
     * 暴力右边向左
     */
/*    public static int minArray(int[] numbers) {
        int temp = numbers[numbers.length - 1];
        for (int i = numbers.length - 2; i >= 0; i--) {
            if (numbers[i] > temp)
                break;
            else temp = numbers[i];
        }
        return temp;
    }*/
}
