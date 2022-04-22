package m_test;

/**
 * @Date 2022/3/4 13:28
 **/
public class Demo29_test {

    //字符串去重测试
    //但是顺序会乱
    public static void main(String[] args) {

        /**
         * 正则
         */
        /*StringBuffer sb = new StringBuffer("aadddbb");
        String rs = sb.reverse().toString().replaceAll("(.)(?=.*\\1)", "");
        StringBuffer out = new StringBuffer(rs);
        System.out.println(out);*/


        /**
         * StringBuilder
         */
        String str = "adddddbccd";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            //如果没有重复，出现的字符都等于第一次出现的下标
            if (str.indexOf(str.charAt(i)) == i) {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
