package demo1;

import java.io.IOException;
import java.util.Scanner;

/**
 * @Date 2022/3/15 9:16
 * 1045 快速排序 (25 分)
 * 思路就是原有的数组和排序好的数组对比，一个位置统计数量，输出
 * 超内存了
 *
 * 2022/03/15 16:16:01	 部分正确   21	编程题	Java (javac)	699 ms
 * 参考了下别人的代码，加了一个max   ，但是第二个测试点还是没过
 **/
public class Demo45 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }
        int[] nums2 = new int[N];
        for (int i = 0; i < N; i++) {
            nums2[i] = nums[i];
        }
        int[] res = new int[N];
        int l = 0;
        int[] bubble = bubble(nums2);
        for (int i = 0; i < N; i++) {
            if (bubble[i] == nums[i]){
                l++;
                res[l] = nums[i];
            }
        }
        System.out.println(l);
        int i = 0;
        for (; i < res.length-2; i++) {
            if (res[i]!=0){
                System.out.print(res[i]+" ");
            }
        }
        System.out.println(res[i]);

    }

    public static int[] bubble(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                int temp = 0;
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
