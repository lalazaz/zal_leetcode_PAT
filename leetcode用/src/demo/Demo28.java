package demo;//@Date 2022/4/10 16:00
//28. 实现 strStr()

public class Demo28 {
    public static void main(String[] args) {
        System.out.println(strStr("jflfjdlkgjkdfsgsaa", "aaa"));
    }

    //寻找haystack中第一次出现needle的位置
    public static int strStr(String haystack, String needle) {
        //return haystack.indexOf(needle);
        if (needle.equals(""))return 0;
        if (haystack.length() < needle.length())return -1;
        for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
            if (haystack.substring(i,i+needle.length()).equals(needle)) return i;
        }
        return -1;
    }
}
