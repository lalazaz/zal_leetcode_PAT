package demo;

//@Date 2022/4/12 19:20
//20. 有效的括号
public class Demo20 {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
        System.out.println(isValid("[{}]"));
        System.out.println(isValid("([])"));
        System.out.println(isValid("([])"));
        System.out.println(isValid("{[()]}"));
        System.out.println(isValid("([])"));
        System.out.println(isValid("(([]){})"));
        System.out.println(isValid("([[][]{({}({}))}])"));
    }

    public static boolean isValid(String s) {

        boolean flag = false;
        int len = s.length() / 2;
        for (int i = 0; i < len; i++) {
            s = s.replaceAll("\\(\\)", "")
                    .replaceAll("\\{}", "")
                    .replaceAll("\\[]", "");
        }
        flag = s.equals("");
        return flag;
    }
}
