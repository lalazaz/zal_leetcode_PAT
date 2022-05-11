package demo;

/**
 * @Date 2022/4/3 9:23
 * 11. 盛最多水的容器
 **/
public class Demo11 {
    public static void main(String[] args) {
        int[] ints = {1,2};
        int i = maxArea(ints);
        System.out.println(i);
    }
    public static int maxArea(int[] height) {
        //暴力
        /*int max = 0;
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j < height.length; j++) {
                max = Math.max(Math.min(height[i],height[j])*(j-i),max);
                *//*System.out.print(height[i]+" "+height[j]);
                System.out.println("     ");*//*
            }
            //System.out.println("");
        }
        return max;*/
        //双指针
        if (height.length==2) return Math.min(height[0], height[1]);
        int max= 0;
        for (int i = 0,j = height.length-1; i < j; ) {
            int minHeilgt = height[i] < height[j] ? height[i++]:height[j--];
            max = Math.max(max,(j-i+1)*minHeilgt);
        }
        return max;
    }
}
