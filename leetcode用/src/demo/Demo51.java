package demo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Date 2022/4/14 14:02
//51. N 皇后

/**
 * 乱起八糟，要命..
 */
public class Demo51 {
    public static void main(String[] args) {

        solveNQueens(4);
    }
    public static List<List<String>>  solveNQueens(int n) {
        List<List<String>>  my = new ArrayList<>();
        check(0);
        List<String> temp = new ArrayList<>();

        System.out.println(res);


        for (int i = 0; i < res.size(); i++) {
            String l = res.get(i)
                    .replace("[","")
                    .replace("]", "");
            //System.out.println(l);
            res.set(i, l);
            String[] split = res.get(i).split(", ");

            for (int j = 0; j < split.length; j++) {
                String tep = "";
                for (int k = 0; k < split.length; k++) {
                    if (k == Integer.parseInt(split[j]))tep+="Q";
                    else tep+=".";
                }
                temp.add(tep);
            }
            //System.out.println(my.toString());
            my.add(temp);
        }

        System.out.println(my.toString());
        //System.out.println(res.toString());

        return null;
    }


    //定义一个max表示共有多少个皇后
    static int max = 4;
    static int count = 0;
    //定义数组array, 保存皇后放置位置的结果,比如 arr = {0 , 4, 7, 5, 2, 6, 1, 3}
    static int[] array = new int[max];
    static int judgeCount = 0;
    static List<String> res = new ArrayList<>();


    //编写一个方法，放置第n个皇后
    //特别注意： check 是 每一次递归时，进入到check中都有  for(int i = 0; i < max; i++)，因此会有回溯
    private static void check(int n) {
        if (n == max) {
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
            //先把当前这个皇后 n , 放到该行的第1列
            array[n] = i;
            //判断当放置第n个皇后到i列时，是否冲突
            if (judge(n)) { // 不冲突
                //接着放n+1个皇后,即开始递归
                check(n + 1); //回溯
            }
            //如果冲突，就继续执行 array[n] = i; 即将第n个皇后，放置在本行得 后移的一个位置
        }
    }

    /**
     * 检查放置第n个皇后的状态，判断是否冲突
     *
     * @param n 放置的位置
     * @return 冲突否？
     */
    private static boolean judge(int n) {
        judgeCount++;
        for (int i = 0; i < n; i++) {
            //不能同一列，不能同一斜线。因为行不断递增，则无需判断
            if (array[i] == array[n] || (Math.abs(n - i) == Math.abs((array[n] - array[i])))) {
                return false;
            }
        }
        return true;
    }

    //编写一个方法，将该皇后的位置打印出来
    private static int[] print() {
        count++;
        /*for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();*/
        res.add(Arrays.toString(array));
        //System.out.println(Arrays.toString(array));
        return array;
    }
}