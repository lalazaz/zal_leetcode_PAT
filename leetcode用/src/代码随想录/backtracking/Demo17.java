package 代码随想录.backtracking;
//17. 电话号码的字母组合

import java.util.ArrayList;
import java.util.List;

/**
 * @author zal
 * @date 2022/5/4 11:28
 */
public class Demo17 {
    static List<String> res = new ArrayList<>();

    public static void main(String[] args) {
//        System.out.println(letterCombinations("23"));
//        System.out.println(letterCombinations(""));
        System.out.println(letterCombinations("233"));
    }

    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0)
            return res;
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backTracking(digits, numString, 0);
        return res;
    }

    static StringBuilder temp = new StringBuilder();

    public static void backTracking(String digits, String[] numString, int num) {
        if (num == digits.length()) {
            res.add(temp.toString());
            return;
        }
        String str = numString[digits.charAt(num) - '0'];
        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            backTracking(digits, numString, num + 1);
            temp.deleteCharAt(temp.length() - 1);//删除末尾元素继续
        }
    }
}
