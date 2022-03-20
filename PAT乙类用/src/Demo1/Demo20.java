package Demo1;
//提交PAT把上面这个东西去掉
import java.util.Scanner;

//2022/02/24 16:52:20	部分正确  15	编程题	Java (javac)	150 ms
//   这道题用Java写会超时      使用BufferedRead代替Scanner不超时了
//2022/02/24 17:33:24	答案正确	25	编程题	Java (javac)	149 ms
//上面代码在test库的Demo21_test02.java中
public class Demo20 {
    //1020 月饼 (25 分)
    //1.接收第一行的种类数N与市场最大需求D
    //2.接收第二行的N中月饼的含有量  —— 放入整形数组中   yuebin[]
    //3.接受第三行的对应月饼总售价   ——  放入另一个整型数组中 price[]
    //4.循环开始出售月饼
    // 计算单价最多的月饼——卖掉
    //  然后次多的..直到市场需求D为0
    //5.算出最大收益，打印

    public static void main(String[] args) {
        //1.接收第一行的种类数N与市场最大需求D
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = scanner.nextInt();
        //2.接收第二行的N中月饼的含有量  —— 放入整形数组中   mooncakes[]
        double[] mooncakes = new double[N];
        for (int i = 0; i < N; i++) {
            mooncakes[i] = scanner.nextInt();
        }
        //3.接受第三行的对应月饼总售价   ——  放入另一个整型数组中 price[]
        double[] price = new double[N];
        for (int i = 0; i < N; i++) {
            price[i] = scanner.nextInt();
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
                    all_money += D * (price[i]/mooncakes[i]);
                    D = 0;
                }
                if (D == 0) {
                    break;
                }
            }
        }
        //5.算出最大收益，打印
        System.out.printf("%.2f",all_money);
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
