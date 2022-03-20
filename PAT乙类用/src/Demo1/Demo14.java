package Demo1;

import java.util.Scanner;

public class Demo14 {

    //1014 福尔摩斯的约会 (20 分)
    //前面两字符串中第 1 对相同的大写英文字母（大小写有区分）是第 4 个字母 D，代表星期四；
    //           第 2 对相同的字符是 E ，那是第 5 个英文字母，代表一天里的第 14 个钟头(24进制)
    //后面两字符串第 1 对相同的英文字母 s 出现在第 4 个位置（从 0 开始计数）上，代表第 4 分钟
    public static void main(String[] args) {
        //1.接受四行字符串
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[4];
        for (int i = 0; i < 4; i++) {
            strings[i] = scanner.nextLine();
        }
        scanner.close();
        /*for (String s : strings) {
            System.out.println(s);
        }*/
        //2.对第一二行经行分割，装入String[]中
        //2.1循环（长度较小的长度结束）对比两数组，满足先为大写字母，且相等
        char[] chars0 = strings[0].toCharArray();
        char[] chars1 = strings[1].toCharArray();
        int L0 = chars0.length;
        int L1 = chars1.length;
        int min = Math.min(L0, L1);
        int i = 0;
        for (; i < min; i++) {
            //首先判断第一、二行i这个位置 都是不是大写字母
            if ((chars0[i] >= 65 && chars0[i] <= 71) && (chars1[i] >= 65 && chars1[i] <= 71)) {
                //再判断他们是否相等
                if (chars0[i] == chars1[i]) {
                    //System.out.println(chars0[i] +"  "+chars1[i]);
                    break;
                }
            }
        }
        //2.1得到该字母，判断其与A字符的相对位置，输出对应星期字母大写————强制转整即可
        int week = ((int) chars0[i] - (int) 'A');
        switch (week) {
            case 0:
                System.out.print("MON" + " ");
                break;
            case 1:
                System.out.print("TUE" + " ");
                break;
            case 2:
                System.out.print("WED" + " ");
                break;
            case 3:
                System.out.print("THU" + " ");
                break;
            case 4:
                System.out.print("FRI" + " ");
                break;
            case 5:
                System.out.print("SAT" + " ");
                break;
            case 6:
                System.out.print("SUN" + " ");
                break;
        }
        //3.接着上面的i再获得一个相同的   字符（不是大写字母）————但是不对，是否也是大写字母？
        //往后走一步
            i++;
        for (; i < min; i++) {

            if ((chars0[i] >= 65 && chars0[i] <= 78) && (chars1[i] >= 65 && chars1[i] <= 78)) {
                //再判断他们是否相等
                if (chars0[i] == chars1[i]) {
                    //System.out.println(chars0[i] +"  "+chars1[i]);
                    break;
                }
            }
        }
        //此时的i即为我们找到的第二相同的字符的位置，也就是钟头
        //经行判断是否为英文字母
        int x = 0;
        //System.out.println(chars0[i]);
        if ((int)chars0[i]>65){
            //代表多久
            x = (int)chars0[i] - 65 + 10;
            System.out.print(x+":");
        }else {
            x = chars0[i] - 48;
            System.out.print(x+":");
        }
        //4.再判断后两段的字符串，相同位置的英文字母，其位置即为分钟
        char[] chars2 = strings[2].toCharArray();
        char[] chars3 = strings[3].toCharArray();
        int L2 = chars2.length;
        int L3 = chars3.length;
        int min2 = Math.min(L2, L3);
        int m = 0;
        for (; m < min2; m++) {
            //首先判断第三、四行m这个位置 都是不是字母
            if ((chars2[m] >= 65 && chars2[m] <= 90||chars2[m] >= 97 && chars2[m] <= 122)
                    && (chars3[m] >= 65 && chars3[m] <= 90||chars3[m] >= 97 && chars3[m] <= 122)) {
                //再判断他们是否相等
                if (chars2[m] == chars3[m]) {
//                    System.out.println(chars2[m] +"  "+chars3[m]);
//                    System.out.println(m);
                    if (m<10){
                        System.out.print('0');
                        System.out.print(m);
                    }else {
                        System.out.print(m);
                    }
                    break;
                }
            }
        }
    }
}

