package easy;
//349. 两个数组的交集

import java.util.*;

/**
 * @author zal
 * @date 2022/4/18 18:37
 */
public class Demo349 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {


        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        ArrayList<Integer> resList = new ArrayList<>();
        Arrays.stream(nums2).distinct().forEach(i -> {
            if (set.contains(i)) {
                resList.add(i);
            }
        });
/*
        StringBuilder sb = new StringBuilder();
        int[] ints = Arrays.stream(nums1).distinct().toArray();
        for (int i = 0; i < ints.length; i++) {
            sb.append("@" + ints[i] + "@");
        }

        Arrays.stream(nums2).distinct().forEach(i -> {
            if (sb.toString().contains("@" + i + "@")) {
                resList.add(i);
            }
        });*/
        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }
}
