package test;
//@Date 2022/4/10 19:04

public class Demo01 {
    public static void main(String[] args) {
        //30
        //字符串中是否能定点插入字符串

        //StringBuilder可以
        String temp = "hello";
        StringBuilder sb = new StringBuilder(temp);
        System.out.println(sb.insert(0, "world"));
    }
}
