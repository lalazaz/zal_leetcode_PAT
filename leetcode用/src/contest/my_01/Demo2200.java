package contest.my_01;
//2200. 找出数组中的所有 K 近邻下标

import java.util.ArrayList;
import java.util.List;

/**
 * @author zal
 * @date 2022/4/16 10:48
 */
public class Demo2200 {
    public static void main(String[] args) {
//        System.out.println(findKDistantIndices(new int[]{3, 4, 9, 1, 3, 9, 5}, 9, 1));
//        System.out.println(findKDistantIndices(new int[]{2, 2, 2, 2, 2}, 2, 2));
    }
    public static /*List<Integer>*/ void findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key){
                for (int j = 0; j < nums.length; j++) {
                    if (Math.abs(j - i) <= k) res.add(j);
                }
            }
        }
//        return res.stream().distinct().toList();
        //不小心改掉了，直接看leetcode
    }
}
