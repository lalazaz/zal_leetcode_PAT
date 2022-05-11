package demo;

import java.util.Arrays;

//@Date 2022/4/14 19:32
//75. 颜色分类
public class Demo75 {
    public static void main(String[] args) {
        int[] ints = {2, 0, 2, 1, 1, 0};
        sortColors(ints);
        System.out.println(Arrays.toString(ints));
    }

    //用的插入排序
    public static void sortColors(int[] nums) {
        int insertVal = 0;
        int insertIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            insertVal = nums[i];
            insertIndex = i - 1;
            while (insertIndex>=0 && insertVal < nums[insertIndex]){
                nums[insertIndex+1] = nums[insertIndex];
                insertIndex--;
            }
            // 当退出while循环时，说明插入的位置找到, insertIndex + 1
            // 举例：理解不了，我们一会 debug
            //这里我们判断是否需要赋值
            if(insertIndex + 1 != i) {
                nums[insertIndex + 1] = insertVal;
            }
        }
    }
}
