package easy;
//594. 最长和谐子序列

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zal
 * @date 2022/4/19 12:33
 */
public class Demo594 {
    public static void main(String[] args) {
        System.out.println(findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
        System.out.println(findLHS(new int[]{1, 2, 3, 4}));
        System.out.println(findLHS(new int[]{1, 1, 1, 1}));
        System.out.println(findLHS(new int[]{1, 1, 1, 2}));
        System.out.println(findLHS(new int[]{1, -3421, 231, 2}));
        System.out.println(findLHS(new int[]{0,0,0,0,0,0,0,0,0,0}));
        System.out.println(findLHS(new int[]{1,3,5,7,9,11,13,15,17}));
        System.out.println(findLHS(new int[]{1,4,1,3,1,-14,1,-13}));
    }

    public static int findLHS(int[] nums) {
        AtomicInteger max = new AtomicInteger();
        Arrays.sort(nums);
        //if (Arrays.stream(nums).distinct().toArray().length==1)return 0;

        Arrays.stream(nums).distinct().forEach(i -> {
            int temp = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i || nums[j] - 1 == i) {
                    temp++;
                    list.add(nums[j]);
                }
            }
            int size = list.stream().distinct().toList().size();
            if (size == 1) temp = 0;
            if (temp > max.get() && temp!= 1) max.set(temp);
        });

        return max.get();
        /**
         * 搞的复杂
         */
        /* int max = 0;
        Arrays.sort(nums);
        StringBuilder sb = new StringBuilder();
        for (int i : nums) {
            sb.append("#"+i+"#");
        }

        int[] dis_nums = Arrays.stream(nums).distinct().toArray();
        for (int i = 0; i < dis_nums.length; i++) {
            int temp = sb.length() - sb.toString()
                    .replaceAll("#" + dis_nums[i] + "#", "")
                    .replaceAll("#" + (dis_nums[i] + 1) + "#", "")
                    .length();
            if (temp > max) {
                max = temp;
            }
        }
        return max;*/
    }
}
