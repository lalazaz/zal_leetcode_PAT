package m_test;

public class Demo03_test {
    public static void main(String[] args) {
        //测试字符串转数组
        String s = "hello";
        char[] chars = s.toCharArray();

        for (Object o : chars) {
            System.out.println(o);
        }

    }
}
