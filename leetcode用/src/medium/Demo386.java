package medium;
//386. 字典序排数

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zal
 * @date 2022/4/18 8:46
 */
public class Demo386 {
    public static void main(String[] args) {
        System.out.println(lexicalOrder(13));
        System.out.println(lexicalOrder(2));
    }

    public static List<Integer> lexicalOrder(int n) {
        String[] strings = new String[n];
        for (int i = 1; i <= n; i++) {
            strings[i-1] = i + "";
        }
        //不用这个？
        Arrays.sort(strings);
        int[] ints = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(strings[i]));
        }
        return list;
    }
}
