package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/28 22:50
 * 1066 图像过滤 (15 分)
 *
 * 2022/03/28 23:12:30
 * 部分正确
 * 	11	编程题	Java (javac)	400 ms
 *
 * 	。。改CPP吧
 *
 * 	2022/03/29 08:58:43
 * 答案正确
 * 	15	编程题	C++ (g++)	51 ms
 **/
public class Demo66 {
    public static void main(String[] args) throws IOException {
        int M,N,A,B;
        String X="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] split = line.split("\\s+");
        M = Integer.parseInt(split[0]);N = Integer.parseInt(split[1]);A = Integer.parseInt(split[2]);B= Integer.parseInt(split[3]);
        if (Integer.parseInt(split[4])<10) X ="00"+split[4];
            else if (Integer.parseInt(split[4])<100) X +="0"+split[4];
                else X = split[2];
        for (int i = 0; i < M; i++) {
            String temp = br.readLine();
            String[] split1 = temp.split("\\s+");
            for (int j = 0; j < N; j++) {
                if (Integer.parseInt(split1[j])<=B&&Integer.parseInt(split1[j])>=A){
                    if (j != N - 1) {
                        System.out.print(X + " ");
                    } else {
                        System.out.print(X + "");
                    }
                }else {
                    if (Integer.parseInt(split1[j])<10) {
                        if (j != N - 1) {
                            System.out.print("00" + split1[j] + " ");
                        } else {
                            System.out.print("00" + split1[j] + "");
                        }
                    } else if (Integer.parseInt(split1[j])<100) {
                        if (j != N - 1) {
                            System.out.print("0" + split1[j] + " ");
                        } else {
                            System.out.print("0" + split1[j] + "");
                        }
                    } else {
                        if (j != N - 1) {
                            System.out.print(split1[j] + " ");
                        } else {
                            System.out.print(split1[j] + "");
                        }
                    }
                }
            }
            System.out.println("");
        }
    }
}
