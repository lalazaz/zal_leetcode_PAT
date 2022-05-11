package demo;

/**
 * @Date 2022/4/2 14:10
 * 84. 柱状图中最大的矩形
 **/
public class Demo84 {
    public static void main(String[] args) {
        int[] ints = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(ints));
    }
    public static int largestRectangleArea(int[] heights) {
        int area = 0;
        for (int i = 0; i < heights.length; i++) {
            int w = 1,h = heights[i],j=i;
            while (--j>=0&&h<=heights[j]){
                w++;
            }
            j = i;
            while (++j<heights.length&&h<=heights[j]){
                w++;
            }
            area = Math.max(area,w*h);
        }
        return area;
    }
}
