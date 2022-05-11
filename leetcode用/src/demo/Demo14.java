package demo;

//@Date 2022/4/12 21:42
//14. 最长公共前缀
public class Demo14 {
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        String[] strings1 = {"dog","racecar","car"};
        String[] strings2 = {"carfdja","racecar","car"};
        String[] strings3 = {"","racecar","car"};
        String[] strings4 = {"flower","flower","flower","flower"};
        System.out.println(longestCommonPrefix(strings));
        System.out.println(longestCommonPrefix(strings1));
        System.out.println(longestCommonPrefix(strings2));
        System.out.println(longestCommonPrefix(strings3));
        System.out.println(longestCommonPrefix(strings4));
    }

    public static String longestCommonPrefix(String[] strs) {
        String res = "";
        for (int i = 0; i < strs[0].length(); i++) {
            res = strs[0].substring(0, i + 1);
            int j = 0;
            for (; j < strs.length; j++) {
                if (strs[j].indexOf(res) != 0) {
                    res = strs[0].substring(0,i);
                    break;
                }
            }
            if (j!=strs.length)break;
        }
        return res;
    }
}
