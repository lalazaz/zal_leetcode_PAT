package 代码随想录.backtracking;
//93. 复原 IP 地址

import java.util.ArrayList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/7 9:57
 */
public class Demo93 {
    public static void main(String[] args) {
        System.out.println(restoreIpAddresses("25525511135"));
    }

    static List<String> res = new ArrayList<>();

    public static List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) return res;//输入数字长度不对，直接返回空
        backtracking(s, 0, 0);
        return res;
    }

    //pointNum是添加逗号的数量，当为3说明已经判断了前面3个，再判断最后一个即可  startIndex是当前搜索的起始位置
    private static void backtracking(String s, int startIndex, int pointNum) {
        if (pointNum == 3) {//前面3个满足后，再判断最后的一段字符
            if (isValid(s, startIndex, s.length() - 1)) {
                res.add(s);
            }
        }
        for (int i = startIndex; i < s.length(); i++) {
            if (pointNum > 3) break;//剪枝
            if (isValid(s, startIndex, i)) {//这个startIndex到i即是我们不断判断的过程
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);
                pointNum++;
                backtracking(s, i + 2, pointNum);//因为考虑到加了小数点，所以回溯的起始位置是基于当前位置的下两个位置
                pointNum--;
                s = s.substring(0, i + 1) + s.substring(i + 2);
            } else break;
        }
    }

    //判断字符串左右闭区间所组成的数字是否合法
    private static boolean isValid(String s, int start, int end) {
        if (start > end) return false;
        if (s.charAt(start) == '0' && start != end) return false;//0开头的数字不合法
        int num = 0;
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') return false;//非数字不合法
            num = num * 10 + (s.charAt(i) - '0');
            if (num > 255) return false;
        }
        return true;
    }
}
