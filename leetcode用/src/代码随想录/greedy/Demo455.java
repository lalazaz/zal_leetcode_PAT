package 代码随想录.greedy;
//455. 分发饼干

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author zal
 * @date 2022/5/9 17:49
 */
public class Demo455 {
    public static void main(String[] args) {

    }

    //饼干先喂给胃口小的
    public static int findContentChildren(int[] g, int[] s) {
        int count = 0;
        int start = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = 0; i < s.length && start < g.length; i++) {
            if (s[i] >= g[start]) {
                count++;
                start++;
            }
        }
        return count;
    }
}
