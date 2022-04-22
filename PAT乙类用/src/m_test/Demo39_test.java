package m_test;

/**
 * @Date 2022/3/13 18:47
 **/
public class Demo39_test {
    //stringBuilder用法
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("abcd");

        String test = "abcdea";
        //String replace = test.replace("a", "aaaa");
        //System.out.println(replace);
        Character a = 'a';
        System.out.println(test.contains(a.toString()));
        String s = test.replaceFirst("a", "b");
        //String replace1 = test.replace("a", "b");
        System.out.println(s);
    }
}
