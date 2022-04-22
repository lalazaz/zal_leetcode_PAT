package demo4;
//1109 擅长C (20 分)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author zal
 * @date 2022/4/17 13:02
 *
 * 2022/04/17 14:54:14
 * 部分正确
 * 	16	编程题	Java (javac)	247 ms
 *
 * 	中间两个点应该还有些情况没考虑到，但不打算搞了，费时间
 *
 * 	第二天回来修改还是格式有问题，就是后面可能多一个回车之类。以及测试点3不知道为什么超时了。。一样的代码昨天还能过的
 */
public class Demo1109 {
    public static void main(String[] args) throws IOException {
        ArrayList<char[][]> list = new ArrayList<>();
        char[][] test = new char[7][5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 7; j++) {
                char[] chars = br.readLine().toCharArray();
                test[j] = chars;
            }
            //此处list内的元素是指向test，而test改变内容会影响list，则需要使用clone
            char[][] temp = test.clone();
            list.add(temp);
        }
        //这个1就是A
        //print(list,1);

        String[] res = new String[7];
        boolean youxiao = false;

        int p = 0;
        char[] chars = br.readLine().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                youxiao = true;
                p++;
                //print(list,chars[i]-64);
                for (int j = 0; j < 7; j++) {
                        res[j] += Arrays.toString(list.get(chars[i] - 65)[j]) + " ";
                }

            } else {

                for (int j = 0; j < res.length; j++) {
                    if(res[j]!=null){
                        System.out.println(res[j].replaceAll("null", "")
                                .replaceAll("\\[", "")
                                .replaceAll("\\]", "")
                                .replaceAll(", ", "")
                                .substring(0,p*6-1));
                    }
                }
                p=0;
                if (i==chars.toString().trim().length())youxiao=false;
                if (i != chars.toString().trim().length()&& youxiao){
                    youxiao = false;
                    System.out.println("");
                }
                res = new String[7];
            }
        }
        if (p!=0){
            for (int j = 0; j < res.length; j++) {
                if (res[j]!=null){

                    System.out.println(res[j].replaceAll("null", "")
                            .replaceAll("\\[", "")
                            .replaceAll("\\]", "")
                            .replaceAll(", ", "")
                            .substring(0,p*6-1));
                }
            }
        }
    }
    //打印list中第i个数据
/*    public static void print(ArrayList<char[][]> list,int i){
        for (int j = 0; j < list.get(i).length; j++) {
            System.out.println(Arrays.toString(list.get(i-1)[j])
                    .replaceAll("\\[", "")
                    .replaceAll("]", "")
                    .replaceAll(", ", ""));
        }
    }*/
}
