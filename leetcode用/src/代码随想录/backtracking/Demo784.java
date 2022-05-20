package 代码随想录.backtracking;
//784. 字母大小写全排列

import java.util.ArrayList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/1 11:38
 */
public class Demo784 {
    public static void main(String[] args) {
        System.out.println(letterCasePermutation("a1b2"));
    }

    static List<String> res;
    static int dis = 'A' - 'a';

    public static List<String> letterCasePermutation(String s) {
        res = new ArrayList<>();
        backTracking(s.toCharArray(), 0);
        return res;
    }

    //dfs
    public static void backTracking(char[] cs, int i) {
        String s = String.valueOf(cs);
        res.add(s);
        for (int j = i; j < cs.length; j++) {
            if (cs[j] <= '9' && cs[j] >= '0') ;
            else {
                if (cs[j] >= 'a' && cs[j] <= 'z') {
                    cs[j] = (char) (cs[j] + dis);
                    backTracking(cs, j + 1);
                    cs[j] = (char) (cs[j] - dis);
                } else {
                    cs[j] = (char) (cs[j] - dis);
                    backTracking(cs, j + 1);
                    cs[j] = (char) (cs[j] + dis);
                }
            }
        }
    }
}
