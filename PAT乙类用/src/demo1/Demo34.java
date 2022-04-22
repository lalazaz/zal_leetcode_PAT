package demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/12 13:08
 **/
//一个半小时，只写了一半实现不完全的两个分数加法，想的过于复杂，思路有问题

//1034 有理数四则运算 (20 分)
public class Demo34 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] split = line.split("\\s+");
        String num1 = split[0];
        String num2 = split[1];

/*        System.out.println(change(num1));
        System.out.println(change(num2));*/
        String change1 = change(num1);
        String change2 = change(num2);
        //进行加减乘除
        System.out.println(change1 + " + " + change2 + " = " + test(num1,num2));
        System.out.println(change1 + " - " + change2 + " = " + "结果");
        System.out.println(change1 + " * " + change2 + " = " + "结果");
        System.out.println(change1 + " / " + change2 + " = " + "结果");



        /*//测试方法
        String change = change("0/6");
        System.out.println(change);*/
    }

    //传入字符串假分数，变为真分数
    public static String change(String fake) {
        String real = "";
        String[] split = fake.split("/");
        String a = split[0];
        String b = split[1];
        if (Integer.parseInt(a) == 0) {
            return "0";
        }
        if (Integer.parseInt(a) < 0) {
            if (Math.abs(Integer.parseInt(a)) < Integer.parseInt(b)) {
                return fake;
            } else if (Math.abs(Integer.parseInt(a)) == Integer.parseInt(b)) {
                return "-1";
            } else {
                if (Math.abs(Integer.parseInt(a)) % Integer.parseInt(b) == 0) {
                    return "(-" + Math.abs(Integer.parseInt(a)) / Integer.parseInt(b) + ")";
                }
                return "(-" + Math.abs(Integer.parseInt(a)) / Integer.parseInt(b) + " " + Math.abs(Integer.parseInt(a)) % Integer.parseInt(b) + "/" + Integer.parseInt(b) + ")";
            }
        }
        if (Integer.parseInt(a) > 0) {
            if (Integer.parseInt(a) < Integer.parseInt(b)) {
                return fake;
            } else if (Integer.parseInt(a) == Integer.parseInt(b)) {
                return "1";
            } else {
                if (Integer.parseInt(a) % Integer.parseInt(b) == 0) {
                    return Integer.parseInt(a) / Integer.parseInt(b) + "";
                }
                return Integer.parseInt(a) / Integer.parseInt(b) + " " + Integer.parseInt(a) % Integer.parseInt(b) + "/" + Integer.parseInt(b);
            }
        }
        return "";
    }

    //传入两个字符串，或是分数，或是整数，或是整数与分数，返回他们的和

    public static String fenshu_jia(String num1, String num2) {
        //判断两个数字状态的标签
        int flag = 0;
        if (num1.contains("/") && num2.contains("/")) {
            flag = 2;
            //拿到他们的分母
            String[] split1 = num1.split("/");
            String num1_fenmu = split1[1];
            String[] split2 = num2.split("/");
            String num2_fenmu = split2[1];
            //求最小公倍数，然后返回相加的结果
            int m = Integer.parseInt(num1_fenmu);
            int n = Integer.parseInt(num2_fenmu);
            int fenmu_gongbeishu = 0;
            for (fenmu_gongbeishu = Math.min(m, n); fenmu_gongbeishu < m * n; fenmu_gongbeishu++) {
                if (fenmu_gongbeishu % m == 0 && fenmu_gongbeishu % n == 0) {
                    break;
                }
            }
            //得到相加的分子
            int fenzi = fenmu_gongbeishu / Integer.parseInt(num1_fenmu) * Integer.parseInt(split1[0]) +
                    fenmu_gongbeishu / Integer.parseInt(num2_fenmu) * Integer.parseInt(split2[0]);

            return fenzi + "/" + fenmu_gongbeishu;

        } else if (num2.contains("/") && (!num1.contains("/")) || num1.contains("/") && (!num2.contains("/"))) {
            flag = 1;
            return "";
        }
        return "";
    }

    public static String test(String num1, String num2){
        //拿到他们的分母
        String[] split1 = num1.split("/");
        String num1_fenmu = split1[1];
        String[] split2 = num2.split("/");
        String num2_fenmu = split2[1];
        //求最小公倍数，然后返回相加的结果
        int m = Integer.parseInt(num1_fenmu);
        int n = Integer.parseInt(num2_fenmu);
        int fenmu_gongbeishu = 0;
        for (fenmu_gongbeishu = Math.min(m, n); fenmu_gongbeishu < m * n; fenmu_gongbeishu++) {
            if (fenmu_gongbeishu % m == 0 && fenmu_gongbeishu % n == 0) {
                break;
            }
        }
        //得到相加的分子
        int fenzi = fenmu_gongbeishu / Integer.parseInt(num1_fenmu) * Integer.parseInt(split1[0]) +
                fenmu_gongbeishu / Integer.parseInt(num2_fenmu) * Integer.parseInt(split2[0]);
        String temp = fenzi + "/" + fenmu_gongbeishu;
        return change(temp);
    }
}