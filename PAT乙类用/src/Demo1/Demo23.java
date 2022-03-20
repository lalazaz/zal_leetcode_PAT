package Demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2022/03/01 17:54:29	答案正确	  20	编程题	Java (javac)	85 ms
//1023 组个最小数 (20 分)
public class Demo23 {
    public static void main(String[] args) throws IOException {
        //1.接受10个空格分开的数字存为数组 ints[10]
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] split = line.split("\\s+");
        int i = 0;
        int[] ints = new int[10];
        for (String s : split) {
            ints[i++] = Integer.parseInt(s);
        }

        String s = my_fun(ints);
        //此时的s既是最终结果的含有0开头的可能
        //修改思路：找到最左边的非零项，拿到他的位置然后顺序打印
        char[] chars = s.toCharArray();
        int j = 0;
        for (; j < chars.length; j++) {
            if (chars[j] != '0'){
                //那么这个j就是不为0的最左边的位置
                break;
            }
        }
        System.out.print(chars[j]);
        //剩下的
        for (int k = 0; k < chars.length; k++) {
            if (k != j){
                System.out.print(chars[k]);
            }
        }
    }

    //传入一个10长度的整形数组，返回一个1023类型的数字字符串
    public static String my_fun(int[] my_int){
        String res = "";
        for (int i = 0; i < my_int.length; i++) {
            int temp = my_int[i];
            while (temp != 0){
                res += ""+i;
                temp--;
            }
        }
        return res;
    }












    public static int[] bubble(int[] ints2) {
        for (int i = 0; i < ints2.length - 1; i++) {
            for (int j = 0; j < ints2.length - 1 - i; j++) {
                if (ints2[j] > ints2[j + 1]) {
                    int temp = ints2[j];
                    ints2[j] = ints2[j + 1];
                    ints2[j + 1] = temp;
                }
            }
        }
        return ints2;
    }
}
