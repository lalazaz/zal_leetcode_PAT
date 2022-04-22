package m_test;

import java.util.Arrays;

/**
 * @Date 2022/3/25 13:24
 * 测试数组的分割
 **/
public class Demo58_test {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        int[] a = new int[2];
        System.arraycopy(ints,3,a,0,2);
        System.out.println(Arrays.toString(a));
    }
}
