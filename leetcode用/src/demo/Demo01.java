package demo;

import java.util.Scanner;

public class Demo01 {
    /*    给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
        回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        例如，121 是回文，而 123 不是。
        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/palindrome-number
        。*/
    public static void main(String[] args) {
        String num = new Scanner(System.in).nextLine();
        char[] chars = num.toCharArray();
        int i = 0;
        for (; i < chars.length -1; i++) {
            if (chars[i] == chars[chars.length - i -1]){
                continue;
            }else {
                System.out.println("不是回文数");
                break;
            }
        }
        if (i == chars.length-1){
            System.out.println("是回文数");
        }
    }
}
