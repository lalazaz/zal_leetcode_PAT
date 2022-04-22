package demo1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//1005 继续(3n+1)猜想 (25 分)
//提交时间	2022/02/18 10:46:50   答案正确
//	25	编程题	Java (javac)	119 ms


//输入的问题，是直接黏贴文本 而并非输入一行换行再输入
public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        int[] my_int = new int[n];
        int[] my_int2 = new int[n];
/*            //1.得到第 1 行给出一个正整数 n
            int n = new Scanner(System.in).nextInt();
            //2.得到第 2 行给出 n 个互不相同的待验证的正整数
            int[] my_int = new int[n];
            int[] my_int2 = new int[n];
            String line = new Scanner(System.in).nextLine();*/



        //2.1 转为 list
        // 2.2 数组里面string 转为 int 类型   名字叫做  my_int[]
        String[] strings = line.split("\\s+");
        for (int i = 0; i < n; i++) {
            my_int[i] = Integer.parseInt(strings[i]);
        }
        for (int i = 0; i < n; i++) {
            my_int2[i] = my_int[i];
        }

/*        for (int i :my_int) {
            System.out.print(i+" ");
        }*/

        //3.循环数组里面每一个元素  将其中卡拉兹得到的过程数放入一个新的数组  all[]内
        ArrayList<Integer> all = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            while (true){
                //经行砍一半操作
                if (my_int[i] == 1){
                    break;
                }else {
                    //先判断奇偶，偶数不变，奇数(3n+1)
                    if (my_int[i] % 2 !=0){
                        my_int[i] = 3*my_int[i]+1;
                    }
                    int temp2 = 0;
                    my_int[i] /= 2;
                    temp2 = my_int[i];
                    all.add(temp2);
                }
            }
        }
        //System.out.println(all.toString());
        //4.对比两个数组  若all[]内含有my_int[]元素，则此元素为过程元素，若不含有则为关键元素——前面加+" "打印出来
        //遍历my_int[]中元素

        //用一个arraylist接受结果，排序
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            //在all里面对比
            //k表示二者对比达到的地方， 如果k是all的长度，则说明my_int[i]这个元素在all里面没有，则是关键数
            int k = 0;
            for (int j : all) {
                k++;
                if (my_int2[i] == j){
                    break;
                }
            }
            if (k == all.size()){
                //System.out.println(my_int2[i]);
                ints.add(my_int2[i]);
            }
        }
        ints.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 -o1;
            }
        });
        String result = "";
        for (int res :ints) {
            result +=  res+" ";
        }
        //把最后一个空格删掉
        result = result.substring(0, result.length() -1);
        System.out.println(result);
    }
}
