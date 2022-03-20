package Demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/13 12:04
 * 1037 在霍格沃茨找零钱 (20 分)
 * 2022/03/13 13:40:41	答案正确  20	编程题	Java (javac)	100 ms
 *                                 厄余代码
 **/
public class Demo37 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        br.close();
        String[] split = line.split("\\s+");
        String num1 = split[0];
        String num2 = split[1];

        //比较的问题,拆开来比..麻烦,放到方法里面去,有点混乱,还是放这里吧
        //这样的话位数可能有问题..?
        String[] split1 = num1.split("\\.");
        String[] split2 = num2.split("\\.");
        //true为num1大
        //false为num2大
        boolean flag = false;

        if (Integer.parseInt(split1[0]) > Integer.parseInt(split2[0])){
            flag = true;
        }else if (Integer.parseInt(split1[0]) == Integer.parseInt(split2[0])){
            if (Integer.parseInt(split1[1]) > Integer.parseInt(split2[1])){
                flag = true;
            }else if (Integer.parseInt(split1[1]) == Integer.parseInt(split2[1])){
                if (Integer.parseInt(split1[2]) > Integer.parseInt(split2[2]))
                flag = true;
            }
        }

        if (!flag){
            String[] jian = num1_big_num2_jian(num2, num1);
            int i = 0;
            for (; i < jian.length - 1; i++) {
                System.out.print(jian[i]+".");
            }
            System.out.println(jian[i]);
        }else{
            System.out.print("-");
            String[] jian = num1_big_num2_jian(num1, num2);
            int i = 0;
            for (; i < jian.length - 1; i++) {
                System.out.print(jian[i]+".");
            }
            System.out.println(jian[i]);
        }

/*
            if (Integer.parseInt(split1[0]) > Integer.parseInt(split2[0])){
                //第二个大,减去第一个,正数
                String[] jian = jian(num2, num1);
                int i = 0;
                for (; i < jian.length - 1; i++) {
                    System.out.print(jian[i]+".");
                }
                System.out.println(jian[i]);
            }else if (Integer.parseInt(split1[0]) == Integer.parseInt(split2[0])){
                if (Integer.parseInt(split1[1]) > Integer.parseInt(split2[1])){
                    //第二个大,减去第一个,正数
                    String[] jian = jian(num2, num1);
                    int i = 0;
                    for (; i < jian.length - 1; i++) {
                        System.out.print(jian[i]+".");
                    }
                    System.out.println(jian[i]);
                }else if (Integer.parseInt(split1[1]) == Integer.parseInt(split2[1])){
                    if (Integer.parseInt(split1[2]) == Integer.parseInt(split2[2])){
                        //第二个大,减去第一个,正数
                        String[] jian = jian(num2, num1);
                        int i = 0;
                        for (; i < jian.length - 1; i++) {
                            System.out.print(jian[i]+".");
                        }
                        System.out.println(jian[i]);
                    }
                }
            }else {
                //第一个大,减去第二个,负数
                System.out.print("-");
                String[] jian = jian(num1, num2);
                int i = 0;
                for (; i < jian.length - 1; i++) {
                    System.out.print(jian[i]+".");
                }
                System.out.println(jian[i]);
            }*/




/*        if (num2.compareTo(num1) > 0) {
            //第二个大,减去第一个,正数
            String[] jian = jian(num2, num1);
            int i = 0;
            for (; i < jian.length - 1; i++) {
                System.out.print(jian[i]+".");
            }
            System.out.println(jian[i]);

        }else{
            //第一个大,减去第二个,负数
            System.out.print("-");
            String[] jian = jian(num1, num2);
            int i = 0;
            for (; i < jian.length - 1; i++) {
                System.out.print(jian[i]+".");
            }
            System.out.println(jian[i]);
        }*/


        //测试下面的方法
        /*String jian = jian("14.1.28","10.16.27");
        System.out.println(jian);*/
    }

    //10.16.27格式的相减
    //十七个银西可(Sickle)兑一个加隆(Galleon)，二十九个纳特(Knut)兑一个西可
    public static String[] num1_big_num2_jian(String num1, String num2) {
        //num1  >  num2
        //进行从右到左的减
        String[] res = new String[3];

        String[] t_1 = num1.split("\\.");
        String[] t_2 = num2.split("\\.");
        int[] split1 = new int[t_1.length];
        int[] split2 = new int[t_2.length];
        for (int i = 0; i < split1.length; i++) {
            split1[i] = Integer.parseInt(t_1[i]);
        }
        for (int i = 0; i < split2.length; i++) {
            split2[i] = Integer.parseInt(t_2[i]);
        }


        //for (int i = split1.length; i > 0; i--) {
        if (split1[2] >= split2[2]) {
            res[2] = split1[2] - split2[2] + "";
        } else {
            //最右边的比你小,借位
            split1[1] = split1[1] - 1;
            res[2] = split1[2] + 29 - split2[2] + "";
        }

        if (split1[1] >= split2[1]) {
            res[1] = split1[1] - split2[1] + "";
        } else {
            //最右边的比你小,借位
            split1[0] = split1[0] - 1;
            res[1] = split1[1] + 17 - split2[1] + "";
        }

        res[0] = split1[0] - split2[0] + "";
        //}
        //格式还有问题?
        return res;
    }
}
