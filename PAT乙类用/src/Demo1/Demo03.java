package Demo1;

import java.util.Scanner;

public class Demo03 {
    //1003 我要通过！
    //2022/02/16 09:06:43
    //部分正确
    //16
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //收到第一个数字n
        //System.out.println("输入你要判断的字符个数：");
        String n = scanner.nextLine();
        int i = Integer.parseInt(n);
        int i2 = i;
        int i3 = i;
        //使用循环接受 剩余的字符串
        //用数组接受
        String[] nums = new String[i];

        //System.out.println("请输入：");

            //创建结果数组
            //没用，可以直接打出来
            //String[] result = new String[i];

        while (i-- != 0) {
            String line = scanner.nextLine();
            nums[i] = line;
        }
        scanner.close();
/*      System.out.println("反向：");
        for (Object o :nums) {
            System.out.print(o);
        }*/
        //System.out.println("\n");
        for (int j = 0; j < i2 / 2; j++) {
            String temp = "";
            temp = nums[j];
            nums[j] = nums[i2 - j - 1];
            nums[i2 - j - 1] = temp;
        }
/*        System.out.println("正向：");
        for (Object o :nums) {
            System.out.print(o+" ");
        }*/
            //-----------------------至此有了含有正向的字符串数组

        //经行判断是否符符合样式
        //遍历接受数组中的字符串，
        for (int k = 0; k < i3; k++) {
            //得到第k个字符串的长度
            int len = nums[k].length();
            //使用toCharArray()把第k个字符串变为 字符数组
            char[] chars = nums[k].toCharArray();
            int p = 0;
            int a=0,b=0,c=0;
            //对字符数组经行遍历，计算P之前的A个数a，PT之间A的个数b，T之后A的个数c
            //统计P之前A的个数
            while (chars[p]!='P'){
                if (chars[p]=='A'){
                    a++;
                    p++;
                }else break;
            }
            //统计P与T之间A的个数
            while (chars[++p]!='T'){
                if (chars[p]=='A'){
                    b++;
                }else break;
            }
            //统计T之后A的个数
            while (++p<chars.length){
                if (chars[p]=='A'){
                    c++;
                }else break;
            }
            //判断
            if (b!=0&&(a == c||a*b == c)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }

    }
}
