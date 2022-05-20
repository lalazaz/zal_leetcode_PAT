package 数据结构入门;
//20. 有效的括号

/**
 * @author zal
 * @date 2022/5/12 9:03
 */
public class Demo20 {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replaceAll("\\(\\)", "").replaceAll("\\[]", "")
                    .replaceAll("\\{}", "");
            if (s.equals(""))
                return true;
        }
        return false;
    }
}
