package 剑指offer_01;
//剑指 Offer 05. 替换空格

/**
 * @author zal
 * @date 2022/4/21 11:45
 */
public class Demo05 {
    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }

/*    public static String replaceSpace(String s) {
        return s.replaceAll(" ","%20");
    }*/

    public static String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 32) {
                res.append(s.charAt(i));
            } else res.append("%20");
        }
        return res.toString();
    }
}
