package m_test;

/**
 * @Date 2022/3/15 9:35
 **/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//测试在冒泡的时候判断两个数组是否相等
public class Demo45_test {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        int[] res = new int[N];
        String line = br.readLine();
        String[] split = line.split("\\s+");
        int[] nums2 = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(split[i]);
            nums2[i] = nums[i];
        }
        int max = 0;
        int p = 0;
        //String res = "";
        Arrays.sort(nums2);
        for (int i = 0;i < N; i++) {
            if (nums[i] == nums2[i] && nums[i] > max) {
                res[p++] = nums[i];
                //res+=nums[i]+" ";
            }
            if (max < nums[i])
                max = nums[i];
        }
        System.out.println(p);

        //应该不会为空
        //if (res.length!=0){}
        for (int i = 0; i < p-1; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println(res[p-1]);

        //System.out.println(res.substring(0,res.length()-1));
    }
}