package 代码随想录.greedy;
//763. 划分字母区间

import java.util.ArrayList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/11 21:47
 */
public class Demo763 {
    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }


    //用hash表统计最后出现的下标
    public static List<Integer> partitionLabels(String s) {
        int[] hash = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            hash[chars[i] - 'a'] = i;
        }
        List<Integer> res = new ArrayList<>();
        int right = 0, last = 0;
        for (int i = 0; i < s.length(); i++) {
            right = Math.max(right, hash[chars[i] - 'a']);
            if (i == right)
                if (res.size() == 0) {
                    res.add(i + 1);
                    last = i + 1;
                } else {
                    res.add(i + 1 - last);
                    last = i + 1;
                }
        }
        return res;
    }

    //用lastIndexOf查找最后字符出现的位置
/*    public static List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        int right = 0, sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            right = Math.max(right, s.lastIndexOf(t));
            if (i == right)
                if (res.size() == 0) {
                    res.add(i + 1);
                    sum = i + 1;
                } else {
                    res.add(i + 1 - sum);
                    sum = i + 1;
                }
        }
        return res;
    }*/
}
