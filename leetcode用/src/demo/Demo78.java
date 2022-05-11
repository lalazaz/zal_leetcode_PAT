package demo;

import java.util.ArrayList;
import java.util.List;

//@Date 2022/4/14 15:18
//78. 子集
public class Demo78 {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            //长度划分 0个长度，1个长度，2...nums.length
            int all = res.size();
            //动态变化
            for (int j = 0; j < all; j++) {
                ArrayList<Integer> temp = new ArrayList<>(res.get(j));
                temp.add(nums[i]);
                res.add(temp);
            }
        }
        return res;
    }
}
