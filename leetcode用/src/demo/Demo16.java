package demo;

//@Date 2022/4/11 13:22
//16. 最接近的三数之和
public class Demo16 {
    public static void main(String[] args) {
        int[] ints = {-1, -20, 1,-4};
        System.out.println(threeSumClosest(ints, 0));

        int[] ints1 = {0, 0, 0};
        System.out.println(threeSumClosest(ints1, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int sum = 0,min = Integer.MAX_VALUE;
        int res = 0;
        //sum 为nums中三个数之和，使得sum - target最小
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    sum = nums[i]+nums[j]+nums[k];
                    if (Math.abs(target-sum) <= min){
                        min = Math.abs(target-sum);
                        res = sum;
                    }
                }
            }
        }
        return res;
    }
}
