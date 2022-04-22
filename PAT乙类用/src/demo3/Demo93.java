package demo3;
//@Date 2022/4/8 21:50
//1093 字符串A+B (20 分)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 2022/04/08 22:26:41
 * 答案正确
 * 	20	编程题	Java (javac)	369 ms
 */

public class Demo93 {
    public static void main(String[] args) throws IOException {
        /*System.out.println((char)32);
        int i = ' ';
        System.out.println(i);*/
        ArrayList<Integer> integers = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();String line2 = br.readLine();
        String line = line1+line2;
        //StringBuilder sb = new StringBuilder();
        char[] chars = line.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int j = chars[i];
            /*if (!sb.toString().contains("@"+j)){
                sb.append("@"+j);
            }*/
            if (!integers.contains(j)){
                integers.add(j);
            }
        }
        //System.out.println(integers.toString());
        String[] split = integers.toString().replace("[","").replace("]","").split(", ");
        for (int i = 0; i < split.length; i++) {
            System.out.print((char) Integer.parseInt(split[i]));
        }
        //System.out.println(integers.toString());
        //System.out.println(sb.toString());
        //String[] split = sb.toString().split("@");
        /*for (int i = 1; i < split.length; i++) {
            System.out.print((char) Integer.parseInt(split[i]));
        }*/
        /*Iterator<Integer> iterator = integers.stream().iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.print( (char)(int)next);
        }*/
        //System.out.println(sb);
    }
}
