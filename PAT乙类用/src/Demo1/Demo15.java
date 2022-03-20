package Demo1;

import java.util.Scanner;
//2022/02/23 10:39:43	部分正确   16	编程题	Java (javac)	400 ms
//有错误的原因是若输入10000001 100 99 则在去第二个分数的时候，由于采取字符串分割。会去到一个空格加一个9，则报错。
//解决方法： 使用scanner。nextInt来去读分数

//很多重复的代码,且分割字符串取出数字的时候没有考虑100

public class Demo15 {
    //1015 德才论 (25 分)

    //1.接受第一行三个数字分别为：人数N，最低分数线，优先录取线H
    //2.循环接受剩余N行，字符形式装入字符串数组strings[N]中
    //3.遍历该数组，分为四种人：
    //      圣人：德才均超过优先录取线H     且按照总分排序（总分相同按照德分排）
    //      君子：德过H，才过L不过H        且按照总分排序
    //      愚人：德、才均过L但不过H       且按照总分排序
    //      小人：德小于才               且按照总分排序
    public static void main(String[] args) {
        //合格的人数
        int num = 0;
        //ABCD人数
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        //1.接受第一行三个数字分别为：人数N，最低分数线L，优先录取线H
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] split = line.split("\\s+");
        int N = Integer.parseInt(split[0]);
        int L = Integer.parseInt(split[1]);
        int H = Integer.parseInt(split[2]);
        //2.循环接受剩余N行，字符形式装入字符串数组strings[N]中
        String[] strings = new String[N];
        for (int i = 0; i < N; i++) {
            String line1 = scanner.nextLine();
            strings[i] = line1;
        }
        //此时我们已经拿到了装有装有字符串每一行的数组
        //测试一下分割
        /*System.out.println(Integer.parseInt(strings[0].substring(9,11)));
          System.out.println(Integer.parseInt(strings[0].substring(12,14)));*/
        String[] my_StringA = new String[N];
        String[] my_StringB = new String[N];
        String[] my_StringC = new String[N];
        String[] my_StringD = new String[N];
        int j1 = -1;
        int j2 = -1;
        int j3 = -1;
        int j4 = -1;
        //3.遍历该数组， 如何拿出分数？————使用substring，得到后面两个分数，构造一个新的结果my_StringX[]数组,后面再排序
        for (int i = 0; i < strings.length; i++) {
            //     分为四种人：
            //      圣人：德才均超过优先录取线H     且按照总分排序（总分相同按照德分排）
            if (strings[i].length() == 15) {
                if (Integer.parseInt(strings[i].substring(9, 11)) >= H && Integer.parseInt(strings[i].substring(12, 14)) >= H
                        || Integer.parseInt(strings[i].substring(9, 11)) == 10 && Integer.parseInt(strings[i].substring(11, 12)) == 0 && Integer.parseInt(strings[i].substring(12, 14)) >= H
                        || Integer.parseInt(strings[i].substring(9, 11)) >= H && Integer.parseInt(strings[i].substring(14, 15)) == 0 && Integer.parseInt(strings[i].substring(12, 14)) == 10) {
                    my_StringA[++j1] = strings[i];
                    A++;
                    num++;
                }
                //      君子：德过H，才过L不过H        且按照总分排序
                else if (Integer.parseInt(strings[i].substring(9, 11)) >= H && Integer.parseInt(strings[i].substring(12, 14)) >= L &&
                        Integer.parseInt(strings[i].substring(12, 14)) <= H) {
                    my_StringB[++j2] = strings[i];
                    B++;
                    num++;
                }
                //      愚人：德、才均过L但不过H       且按照总分排序
                else if (Integer.parseInt(strings[i].substring(9, 11)) >= L && Integer.parseInt(strings[i].substring(12, 14)) >= L &&
                        Integer.parseInt(strings[i].substring(12, 14)) <= H && Integer.parseInt(strings[i].substring(9, 11)) <= H) {
                    my_StringC[++j3] = strings[i];
                    C++;
                    num++;
                }
                //      小人：德小于才               且按照总分排序
                else {
                    if (Integer.parseInt(strings[i].substring(9, 11)) >= L && Integer.parseInt(strings[i].substring(12, 14)) >= L
                            && Integer.parseInt(strings[i].substring(9, 11)) < Integer.parseInt(strings[i].substring(12, 14))) {
                        my_StringD[++j4] = strings[i];
                        D++;
                        num++;
                    }
                }
            } else if (strings[i].length() <= 14) {
                if (Integer.parseInt(strings[i].substring(9, 11)) >= H && Integer.parseInt(strings[i].substring(12, 14)) >= H) {
                    my_StringA[++j1] = strings[i];
                    A++;
                    num++;
                }
                //      君子：德过H，才过L不过H        且按照总分排序
                else if (Integer.parseInt(strings[i].substring(9, 11)) >= H && Integer.parseInt(strings[i].substring(12, 14)) >= L &&
                        Integer.parseInt(strings[i].substring(12, 14)) <= H) {
                    my_StringB[++j2] = strings[i];
                    B++;
                    num++;
                }
                //      愚人：德、才均过L但不过H       且按照总分排序
                else if (Integer.parseInt(strings[i].substring(9, 11)) >= L && Integer.parseInt(strings[i].substring(12, 14)) >= L &&
                        Integer.parseInt(strings[i].substring(12, 14)) <= H && Integer.parseInt(strings[i].substring(9, 11)) <= H) {
                    my_StringC[++j3] = strings[i];
                    C++;
                    num++;
                }
                //      小人：德小于才               且按照总分排序
                else {
                    if (Integer.parseInt(strings[i].substring(9, 11)) >= L && Integer.parseInt(strings[i].substring(12, 14)) >= L
                            && Integer.parseInt(strings[i].substring(9, 11)) < Integer.parseInt(strings[i].substring(12, 14))) {
                        my_StringD[++j4] = strings[i];
                        D++;
                        num++;
                    }
                }
            }
        }
        /*System.out.println("人数：" + num);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);*/


        //开始从A-D把四组人排序，高到低打印

        //A数组
        for (int i = 0; i < A - 1; i++) {
            for (int j = 0; j < A - 1; j++) {
                //先判断是否相等的特殊情况   相等则判断德分数
                if (Integer.parseInt(my_StringA[j].substring(9, 11)) + Integer.parseInt(my_StringA[j].substring(12, 14))
                        == Integer.parseInt(my_StringA[j + 1].substring(9, 11)) + Integer.parseInt(my_StringA[j + 1].substring(12, 14))) {
                    if (Integer.parseInt(my_StringA[j].substring(9, 11)) > Integer.parseInt(my_StringA[j + 1].substring(9, 11))) {
                        String temp = my_StringA[j];
                        my_StringA[j] = my_StringA[j + 1];
                        my_StringA[j + 1] = temp;
                    }
                }
                //这里有特殊情况是100的，难搞
                if (Integer.parseInt(my_StringA[j].substring(9, 11)) == 10) {
                    //则使用100和下一个比而不是10
                    if (100 + Integer.parseInt(my_StringA[j].substring(12, 14))
                            > Integer.parseInt(my_StringA[j + 1].substring(9, 11)) + Integer.parseInt(my_StringA[j + 1].substring(12, 14))) {
                        String temp = my_StringA[j];
                        my_StringA[j] = my_StringA[j + 1];
                        my_StringA[j + 1] = temp;
                    } else if (Integer.parseInt(my_StringA[j].substring(12, 14)) == 10) {
                        if (Integer.parseInt(my_StringA[j + 1].substring(9, 11)) + 100
                                > Integer.parseInt(my_StringA[j + 1].substring(9, 11)) + Integer.parseInt(my_StringA[j + 1].substring(12, 14))) {
                            String temp = my_StringA[j];
                            my_StringA[j] = my_StringA[j + 1];
                            my_StringA[j + 1] = temp;
                        }
                    } else {
                        if (Integer.parseInt(my_StringA[j].substring(9, 11)) + Integer.parseInt(my_StringA[j].substring(12, 14))
                                > Integer.parseInt(my_StringA[j + 1].substring(9, 11)) + Integer.parseInt(my_StringA[j + 1].substring(12, 14))) {
                            String temp = my_StringA[j];
                            my_StringA[j] = my_StringA[j + 1];
                            my_StringA[j + 1] = temp;
                        }
                    }
                }
            }
        }

        //B数组
        for (int i = 0; i < B - 1; i++) {
            for (int j = 0; j < B - 1; j++) {
                //先判断是否相等的特殊情况   相等则判断德分数
                if (Integer.parseInt(my_StringB[j].substring(9, 11)) + Integer.parseInt(my_StringB[j].substring(12, 14))
                        == Integer.parseInt(my_StringB[j + 1].substring(9, 11)) + Integer.parseInt(my_StringB[j + 1].substring(12, 14))) {
                    if (Integer.parseInt(my_StringB[j].substring(9, 11)) > Integer.parseInt(my_StringB[j + 1].substring(9, 11))) {
                        String temp = my_StringB[j];
                        my_StringB[j] = my_StringB[j + 1];
                        my_StringB[j + 1] = temp;
                    }
                }
                //这里有特殊情况是100的，难搞
                if (Integer.parseInt(my_StringB[j].substring(9, 11)) == 10) {
                    //则使用100和下一个比而不是10
                    if (100 + Integer.parseInt(my_StringB[j].substring(12, 14))
                            > Integer.parseInt(my_StringB[j + 1].substring(9, 11)) + Integer.parseInt(my_StringB[j + 1].substring(12, 14))) {
                        String temp = my_StringB[j];
                        my_StringB[j] = my_StringB[j + 1];
                        my_StringB[j + 1] = temp;
                    } else if (Integer.parseInt(my_StringB[j].substring(12, 14)) == 10) {
                        if (Integer.parseInt(my_StringB[j + 1].substring(9, 11)) + 100
                                > Integer.parseInt(my_StringB[j + 1].substring(9, 11)) + Integer.parseInt(my_StringB[j + 1].substring(12, 14))) {
                            String temp = my_StringB[j];
                            my_StringB[j] = my_StringB[j + 1];
                            my_StringB[j + 1] = temp;
                        }
                    } else {
                        if (Integer.parseInt(my_StringB[j].substring(9, 11)) + Integer.parseInt(my_StringB[j].substring(12, 14))
                                > Integer.parseInt(my_StringB[j + 1].substring(9, 11)) + Integer.parseInt(my_StringB[j + 1].substring(12, 14))) {
                            String temp = my_StringB[j];
                            my_StringB[j] = my_StringB[j + 1];
                            my_StringB[j + 1] = temp;
                        }
                    }
                }
            }
        }

        //C数组
        for (int i = 0; i < C - 1; i++) {
            for (int j = 0; j < C - 1; j++) {
                //先判断是否相等的特殊情况   相等则判断德分数
                if (Integer.parseInt(my_StringC[j].substring(9, 11)) + Integer.parseInt(my_StringC[j].substring(12, 14))
                        == Integer.parseInt(my_StringC[j + 1].substring(9, 11)) + Integer.parseInt(my_StringC[j + 1].substring(12, 14))) {
                    if (Integer.parseInt(my_StringC[j].substring(9, 11)) > Integer.parseInt(my_StringC[j + 1].substring(9, 11))) {
                        String temp = my_StringC[j];
                        my_StringC[j] = my_StringC[j + 1];
                        my_StringC[j + 1] = temp;
                    }
                }
                //这里有特殊情况是100的，难搞
                if (Integer.parseInt(my_StringC[j].substring(9, 11)) == 10) {
                    //则使用100和下一个比而不是10
                    if (100 + Integer.parseInt(my_StringC[j].substring(12, 14))
                            > Integer.parseInt(my_StringC[j + 1].substring(9, 11)) + Integer.parseInt(my_StringC[j + 1].substring(12, 14))) {
                        String temp = my_StringC[j];
                        my_StringC[j] = my_StringC[j + 1];
                        my_StringC[j + 1] = temp;
                    } else if (Integer.parseInt(my_StringC[j].substring(12, 14)) == 10) {
                        if (Integer.parseInt(my_StringC[j + 1].substring(9, 11)) + 100
                                > Integer.parseInt(my_StringC[j + 1].substring(9, 11)) + Integer.parseInt(my_StringC[j + 1].substring(12, 14))) {
                            String temp = my_StringC[j];
                            my_StringC[j] = my_StringC[j + 1];
                            my_StringC[j + 1] = temp;
                        }
                    } else {
                        if (Integer.parseInt(my_StringC[j].substring(9, 11)) + Integer.parseInt(my_StringC[j].substring(12, 14))
                                > Integer.parseInt(my_StringC[j + 1].substring(9, 11)) + Integer.parseInt(my_StringC[j + 1].substring(12, 14))) {
                            String temp = my_StringC[j];
                            my_StringC[j] = my_StringC[j + 1];
                            my_StringC[j + 1] = temp;
                        }
                    }
                }
            }
        }

        //D数组
        for (int i = 0; i < D - 1; i++) {
            for (int j = 0; j < D - 1; j++) {
                //先判断是否相等的特殊情况   相等则判断德分数
                if (Integer.parseInt(my_StringD[j].substring(9, 11)) + Integer.parseInt(my_StringD[j].substring(12, 14))
                        == Integer.parseInt(my_StringD[j + 1].substring(9, 11)) + Integer.parseInt(my_StringD[j + 1].substring(12, 14))) {
                    if (Integer.parseInt(my_StringD[j].substring(9, 11)) > Integer.parseInt(my_StringD[j + 1].substring(9, 11))) {
                        String temp = my_StringD[j];
                        my_StringD[j] = my_StringD[j + 1];
                        my_StringD[j + 1] = temp;
                    }
                }
                //这里有特殊情况是100的，难搞
                if (Integer.parseInt(my_StringD[j].substring(9, 11)) == 10) {
                    //则使用100和下一个比而不是10
                    if (100 + Integer.parseInt(my_StringD[j].substring(12, 14))
                            > Integer.parseInt(my_StringD[j + 1].substring(9, 11)) + Integer.parseInt(my_StringD[j + 1].substring(12, 14))) {
                        String temp = my_StringD[j];
                        my_StringD[j] = my_StringD[j + 1];
                        my_StringD[j + 1] = temp;
                    } else if (Integer.parseInt(my_StringD[j].substring(12, 14)) == 10) {
                        if (Integer.parseInt(my_StringD[j + 1].substring(9, 11)) + 100
                                > Integer.parseInt(my_StringD[j + 1].substring(9, 11)) + Integer.parseInt(my_StringD[j + 1].substring(12, 14))) {
                            String temp = my_StringD[j];
                            my_StringD[j] = my_StringD[j + 1];
                            my_StringD[j + 1] = temp;
                        }
                    } else {
                        if (Integer.parseInt(my_StringD[j].substring(9, 11)) + Integer.parseInt(my_StringD[j].substring(12, 14))
                                > Integer.parseInt(my_StringD[j + 1].substring(9, 11)) + Integer.parseInt(my_StringD[j + 1].substring(12, 14))) {
                            String temp = my_StringD[j];
                            my_StringD[j] = my_StringD[j + 1];
                            my_StringD[j + 1] = temp;
                        }
                    }
                }
            }
        }


        System.out.println(A+B+C+D);
        for (int i = 0; i < A; i++) {
            System.out.println(my_StringA[A - i - 1]);
        }
        for (int i = 0; i < B; i++) {
            System.out.println(my_StringB[B - i - 1]);
        }
        for (int i = 0; i < C; i++) {
            System.out.println(my_StringC[C - i - 1]);
        }
        for (int i = 0; i < D; i++) {
            System.out.println(my_StringD[D - i - 1]);
        }
    }
}

