package easy;
//796. 旋转字符串

/**
 * @author zal
 * @date 2022/4/20 8:45
 */
public class Demo796 {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "abced"));
    }

    public static boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && ((goal + goal).contains(s));
    }
}
