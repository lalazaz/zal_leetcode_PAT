package 数据结构入门;
//118. 杨辉三角

import java.util.ArrayList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/7 9:21
 */
public class Demo118 {
    public static void main(String[] args) {
        System.out.println(generate(5));
        System.out.println(generate(10));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        res.add(integers);
        for (int i = 2; i <= numRows; i++) {
            ArrayList<Integer> temp = new ArrayList<>(i);
            for (int j = 1; j <= i; j++) {
                if (j == i || j == 1)
                    temp.add(1);
                else
                    temp.add(res.get(i - 2).get(j - 2) + res.get(i - 2).get(j - 1));
            }
            res.add(temp);
        }
        return res;
    }
}
