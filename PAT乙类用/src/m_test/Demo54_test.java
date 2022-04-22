package m_test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Date 2022/3/23 14:07
 **/
public class Demo54_test {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
        Matcher matcher = pattern.matcher("-1");
        System.out.println(matcher.matches());
    }
}
