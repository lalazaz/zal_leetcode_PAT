package 代码随想录.backtracking;
//131. 分割回文串

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/5 20:11
 */
public class Demo131 {
    public static void main(String[] args) {
        System.out.println(partition("aab"));
    }

    static List<List<String>> res = new ArrayList<>();
    static LinkedList<String> path = new LinkedList<>();

    public static List<List<String>> partition(String s) {
        backtracking(s, 0);
        return res;
    }

    public static void backtracking(String s, int startIndex) {
        //找到了这个字符串的一种分割法
        if (startIndex >= s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            if (isPalindrome(s, startIndex, i)) {
                //是回文字串
                path.addLast(s.substring(startIndex, i + 1));
            } else continue;
            backtracking(s, i + 1);
            path.removeLast();
        }
    }

    //字符串s中 l 和 r 之间的字符串是否为回文字符串
    public static boolean isPalindrome(String s, int start, int end) {
        if (end > s.length()) return false;
        for (int i = start, j = end; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}
