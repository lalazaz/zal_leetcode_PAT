package Demo1;

import java.util.Scanner;

public class Demo08 {
    //1008 数组元素循环右移问题 (20 分)
    //不允许使用另外数组
    public static void main(String[] args) {
        //1.接受输入文本
        Scanner scanner = new Scanner(System.in);
            //1.1第一行的N和M（移动位置）
        String line = scanner.nextLine();
        String[] split = line.split("\\s+");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);
            //1.2第二行的N个整数——用my_ints[]接受
        int[] my_ints = new int[N];
        String line2 = scanner.nextLine();
        String[] split1 = line2.split("\\s+");
        for (int i = 0; i < N; i++) {
            my_ints[i] = Integer.parseInt(split1[i]);
        }
        /*System.out.println("N是"+N);
        System.out.println("M是"+M);
        System.out.println("接受数组为：");
        for (int i :my_ints) {
            System.out.print(i+"  ");
        }*/
        //2.对my_ints中数组每一个元素向右移动M位

    }
}
