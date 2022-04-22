package m_test;

/**
 * @Date 2022/3/12 14:06
 **/
public class Demo34_test {
    //测试字符串中有-  转化为整形
    public static void main(String[] args) {
        String a = "-3241";
        System.out.println(a);
        int b = Integer.parseInt(a);
        System.out.println(b);
    }
}
