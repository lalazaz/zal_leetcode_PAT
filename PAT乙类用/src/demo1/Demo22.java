package demo1;

import java.util.Scanner;

//2022/02/28 19:11:01	答案正确	 20	编程题	Java (javac)	116 ms
//1022 D进制的A+B (20 分)
public class Demo22 {
    public static void main(String[] args) {
        //1.接受A，B，D
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int D = scanner.nextInt();
        //2.使用Integer.toString自动转换进制
        System.out.println(Integer.toString(A+B,D));
    }
}





//1.接受A、B，D
//2.输出A+B的D进制
    /*public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int D = scanner.nextInt();
        int num = A + B;
        //结果
        int res = 0;
        int i = 0;
        //先求最大的权重，再求次之，以此类推
        int x1 = 0;
        for (int j = 0; j < m_pow(num,D); j++) {
            //?
        }
    }
    //返回num1相对X的权重，例如1024对于2的权重是10
    public static int m_pow(int num1,int x){
        int i = 0;
        while (true){
            if (num1 >= Math.pow(x,i)){
                i++;
            }else break;
        }
        return i-1;
    }*/