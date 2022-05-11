package medium;
//39. 组合总和

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zal
 * @date 2022/4/18 13:25
 */
public class Demo39 {
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2, 3, 6, 7}, 7));
    }

    /**
     * 思路不对，或者说很难实现，看下回溯吧
     * @param candidates
     * @param target
     * @return
     */
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        StringBuilder mystrings = new StringBuilder();
        for (int i = 0; i < candidates.length; i++) {
            mystrings.append(candidates[i]+"#");
        }
        for (int i = 0; i < candidates.length; i++) {
            int temp_target = target;
            List<Integer> temp = new ArrayList<>();
            if (mystrings.toString().contains(temp_target%candidates[i]+"")&&candidates[i]>=temp_target%candidates[i]){
                temp.add(candidates[i]);
            }
        }
        return res;
    }
}
