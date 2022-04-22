package m_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//测试BufferedReader与Scanner


//2022/02/24 17:33:24	答案正确	25	编程题	Java (javac)	149 ms

//BufferReader比Scanner快很多！

public class Demo21_test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1.接收第一行的种类数N与市场最大需求D
        String line = br.readLine();
        String[] split = line.split("\\s+");
        int N = Integer.parseInt(split[0]);
        int D = Integer.parseInt(split[1]);
        /*System.out.println(N);
        System.out.println(D);
        System.out.println("");*/
        //2.接收第二行的N中月饼的含有量  —— 放入数组中   mooncakes[]
        String line2 = br.readLine();
        double[] mooncakes = new double[N];
        String[] split1 = line2.split("\\s+");
        int m = 0;
        for (String o : split1) {
            mooncakes[m] = Double.parseDouble(o);
            m++;
            //System.out.println(o);
        }

        //3.接受第三行的对应月饼总售价   ——  放入另一个整型数组中 price[]
        String line3 = br.readLine();
        double[] price = new double[N];
        int j = 0;
        String[] split2 = line3.split("\\s+");
        for (String o : split2) {
            price[j] = Double.parseDouble(o);
            j++;
            //System.out.println(o);
        }
        //按照他们的单价来冒泡排序（从高到低)
        bubble(price, mooncakes);
        /*//测试他们的情况
        System.out.println("反转后");
        for (Object o : price) {
            System.out.print(o+" ");
        }
        System.out.println("");
        for (Object o : mooncakes) {
            System.out.print(o+" ");
        }*/


        //所卖的所有钱
        double all_money = 0.0;
        //4.循环开始出售月饼
        // 然后从高到低开始 卖掉   直到市场需求D为0
        for (int i = 0; i < mooncakes.length; i++) {
            if (D > 0) {
                if (D >= mooncakes[i]) {
                    D -= mooncakes[i];
                    //卖了  统计价格————单价乘数量
                    all_money += price[i];
                } else {
                    //此时我们的需求量少于排序中最多的月饼的所有量，按照我们的D来卖
                    all_money += D * (price[i] / mooncakes[i]);
                    D = 0;
                }
                if (D == 0) {
                    break;
                }
            }
        }
        //5.算出最大收益，打印
        System.out.printf("%.2f", all_money);
    }

    //这个冒泡排序是根据单价来确定的，所以传入两个数组，同时调正
    //他们的长度是一样的
    //第一个是售价，第二个是总量
    public static void bubble(double[] price, double[] num) {
        for (int i = 0; i < price.length - 1; i++) {
            for (int j = 0; j < price.length - 1 - i; j++) {
                if ((price[j] / num[j]) < (price[j + 1] / num[j + 1])) {
                    //两个数组与下一个换位置;
                    double temp1 = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = temp1;

                    double temp2 = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp2;
                }
            }
        }
    }
}
