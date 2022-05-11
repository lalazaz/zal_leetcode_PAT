package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Date 2022/3/21 12:53
 * 17. 电话号码的字母组合
 **/
public class Demo17 {
    public static void main(String[] args) {
        //通过
        //	12 ms	42 MB	Java	2022/03/21 14:25

        //写了好久，而且代码也不好看
        //但毕竟和pat模式不太一样，算是一次尝试吧，题目并不难，可以有更简洁的方法
    }
}
class Solution {
    public List<String> letterCombinations(String digits) {
        String[] strings = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        int length = digits.length();
        if (length == 0) {
            return list;
        } else if (length == 1) {
            int i = Integer.parseInt(digits);
            char[] chars = strings[i - 2].toCharArray();
            for (Character c : chars) {
                list.add(c+"");
                //System.out.println(c);
            }
            return list;
        } else {


            //下面是处理长度大于等于2小于等于4的

            for (int i = 0; i < strings[Integer.parseInt(digits.substring(0, 1)) - 2].length(); i++) {
                for (int j = 0; j < strings[Integer.parseInt(digits.substring(1, 2)) - 2].length(); j++) {

                    if (length == 3) {
                        for (int k = 0; k < strings[Integer.parseInt(digits.substring(2, 3)) - 2].length(); k++) {

                            String temp = ""+strings[Integer.parseInt(digits.substring(0, 1)) - 2].toCharArray()[i]
                                    +""+strings[Integer.parseInt(digits.substring(1, 2)) - 2].toCharArray()[j]
                                    +strings[Integer.parseInt(digits.substring(2, 3)) - 2].toCharArray()[k];
                            list.add(temp);
                          /*  sb.append(""+strings[Integer.parseInt(digits.substring(0, 1)) - 2].toCharArray()[i]).
                                    append(""+strings[Integer.parseInt(digits.substring(1, 2)) - 2].toCharArray()[j]).
                                    append(""+strings[Integer.parseInt(digits.substring(2, 3)) - 2].toCharArray()[k])
                            ;*/
                        }
                    } else if (length == 4) {
                        for (int k = 0; k < strings[Integer.parseInt(digits.substring(2, 3)) - 2].length(); k++) {
                            for (int l = 0; l < strings[Integer.parseInt(digits.substring(3, 4))-2].length(); l++) {
                                String temp = ""+strings[Integer.parseInt(digits.substring(0, 1)) - 2].toCharArray()[i]
                                        +strings[Integer.parseInt(digits.substring(1, 2)) - 2].toCharArray()[j]
                                        +strings[Integer.parseInt(digits.substring(2, 3)) - 2].toCharArray()[k]
                                        +strings[Integer.parseInt(digits.substring(3, 4)) - 2].toCharArray()[l];
                                list.add(temp);
                     /*           sb.append(""+strings[Integer.parseInt(digits.substring(0, 1)) - 2].toCharArray()[i]).
                                        append(""+strings[Integer.parseInt(digits.substring(1, 2)) - 2].toCharArray()[j]).
                                        append(""+strings[Integer.parseInt(digits.substring(2, 3)) - 2].toCharArray()[k]).
                                        append(""+strings[Integer.parseInt(digits.substring(3, 4)) - 2].toCharArray()[l])
                                ;*/
                            }
                        }
                    } else {
                        String temp = ""+strings[Integer.parseInt(digits.substring(0, 1)) - 2].toCharArray()[i]
                                +""+strings[Integer.parseInt(digits.substring(1, 2)) - 2].toCharArray()[j];
                        list.add(temp);
                    }
                }
            }

            //list.add(sb+"");list.remove("");
            return list;
        }
    }
}
