package medium;
//面试题 01.05. 一次编辑

/**
 * @author zal
 * @date 2022/5/13 10:29
 */
public class Demo01_05 {
    public static void main(String[] args) {
        System.out.println(oneEditAway("teacher", "bleacher"));
        System.out.println(oneEditAway("teacher", "leacher"));
        System.out.println(oneEditAway("a", "b"));
        System.out.println(oneEditAway("aa", "aaa"));
        System.out.println(oneEditAway("hah", "aaa"));
        System.out.println(oneEditAway("fisherman", "fishermen"));
    }

    public static boolean oneEditAway(String first, String second) {
        int l1 = first.length();
        int l2 = second.length();
        int cnt = 0;
        //令l2是长的字符串
        if (l2 < l1) return oneEditAway(second, first);
        if (l2 - l1 > 1) return false;
        if (l2 == l1 && first.equals(second)) return true;
        for (int i = 0, j = 0; i <= l1 - 1; ) {
            if (first.charAt(i) != second.charAt(j)) {
                if (l2 == l1)
                    i++;
                j++;
                cnt++;
                if (cnt > 1)
                    return false;
            } else {
                i++;
                j++;
            }
        }
        return true;
    }
}
