package demo;

import java.util.Arrays;

/**
 * @Date 2022/4/2 13:16
 * 26. 删除有序数组中的重复项
 * 通过
 * 	0 ms	43.2 MB	Java	2022/04/02 13:56
 * 	为什么想这么久..
 **/
public class Demo26 {
    public static void main(String[] args) {
        int[] ints = {1, 1, 2};
        System.out.println(removeDuplicates(ints));
        System.out.println(Arrays.toString(ints));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int p = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[p] != nums[i]) nums[++p] = nums[i];
        }
        return p+1;
        /*if (nums.length==0) return 0;
        int p = 1;
        for (int i = 0; i < nums.length; i++) {
            int j = i+1;
            int last = j;
            for (; j < nums.length; j++) {
                if (nums[j]==nums[i]) last = j;
            }
            nums[p++] = nums[last+1];
            i = last+1;
        }
        return p;*/
    }
}
