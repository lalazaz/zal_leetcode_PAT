package demo;

import java.util.Arrays;

/**
 * @Date 2022/4/3 9:49
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 **/
public class Demo34 {
    public static void main(String[] args) {
        int[] test = {5,7,7,8,8,10};
        int[] ints = searchRange(test, 8);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        boolean first = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target &&first){
                first = false;
                res[0] = i;res[1] = i;
            }
            if (nums[i] == target&&!first) res[1] = i;
        }
        return res;
    }
}
