package demo;

//@Date 2022/4/15 11:16
//392. 判断子序列
public class Demo392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbgdc"));
        System.out.println(isSubsequence("aaaaaa", "bbaaaa"));
        System.out.println(isSubsequence("aaaa", "bbaaaa"));
        System.out.println(isSubsequence("aaa", "bbaaaa"));


        System.out.println(isSubsequence("a", "b"));
        System.out.println(isSubsequence("a", "ba"));
        System.out.println(isSubsequence("bbbb", "bbbb"));
        System.out.println(isSubsequence("b", "ba"));


        System.out.println(isSubsequence("acb", "ahbgdc"));

    }

    public static boolean isSubsequence(String s, String t) {

        if (s.length()==1)return t.contains(s);
        if (s.length()>t.length())return false;
        char[] chars = s.toCharArray();
        int[] ints = new int[chars.length + 1];
        int i = 0;
        for (; i < chars.length; i++) {
            ints[i] = t.indexOf(chars[i]);
            if (ints[i]==-1)return false;
            t = t.substring(ints[i]+1);
        }
        return true;
    }
}
