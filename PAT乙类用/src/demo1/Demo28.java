package demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Date 2022/3/3 21:53
 **/

//2022/03/04 09:19:05	部分正确    15	编程题	Java (javac)	200 ms
//1028 人口普查 (20 分)

public class Demo28 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //1.接收第一行的人数N
        int N = Integer.parseInt(br.readLine());
        //2.用map接收且过滤无效的人    并且测试一下   得到有效的人数M
        int M = 0;
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        //定义年龄最大、小的人的数组
        int[] oldest = new int[3];
        oldest[0] = 2014;
        oldest[1] = 9;
        oldest[2] = 6;
        int[] youngest = new int[3];
        youngest[0] = 1814;
        youngest[1] = 9;
        youngest[2] = 6;
        while (N-- != 0) {
            String line = br.readLine();
            String[] split = line.split("\\s+");
            //得到这个人的出生然后是判断在1814/9/16———2014/9/16之间
            String[] split1 = split[1].split("/");
            //把年月日转为整形
            int[] born_day = new int[3];
            int i = 0;
            for (String s : split1) {
                born_day[i] = Integer.parseInt(s);
                i++;
            }


            if (born_day[0] < 1814 || (born_day[0] == 1814 && born_day[1] < 9) || (born_day[0] == 1814 && born_day[1] == 9 && born_day[2] < 6)) {
                //看作一个时间轴，左边的人
            } else if (born_day[0] > 2014 || (born_day[0] == 2014 && born_day[1] > 9) || (born_day[0] == 2014 && born_day[1] == 9 && born_day[2] > 6)) {
                //右边的人
            } else {
                //正常的人   加入map
                M++;
                stringStringHashMap.put(split[0], split[1]);
                //3.找到最年长的人，年月日越小越大 ，年幼的人相同

                if (born_day[0] < oldest[0] || (born_day[0] == oldest[0] && born_day[1] < oldest[1]) ||
                        (born_day[0] == oldest[0] && born_day[1] == oldest[1] && born_day[2] < oldest[2])) {
                    oldest[0] = born_day[0];
                    oldest[1] = born_day[1];
                    oldest[2] = born_day[2];
                }
                if (born_day[0] > youngest[0] || (born_day[0] == youngest[0] && born_day[1] > youngest[1]) ||
                        (born_day[0] == youngest[0] && born_day[1] == youngest[1] && born_day[2] > youngest[2])) {
                    youngest[0] = born_day[0];
                    youngest[1] = born_day[1];
                    youngest[2] = born_day[2];
                }

            }
        }
        br.close();

        //反向拿出，得到名字
        String oldman = "";
        String youngman = "";
        Iterator<Map.Entry<String, String>> iterator = stringStringHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            //注意单个数字是0开头，取出来

            //value取出来  ，数字判断
            String[] split = next.getValue().split("/");

            if (Integer.parseInt(split[0]) == (oldest[0]) && Integer.parseInt(split[1]) == (oldest[1]) && Integer.parseInt(split[2]) == (oldest[2])) {
                oldman = next.getKey();
            }
            if (Integer.parseInt(split[0]) == (youngest[0]) && Integer.parseInt(split[1]) == (youngest[1]) && Integer.parseInt(split[2]) == (youngest[2])) {
                youngman = next.getKey();
            }
        }
        System.out.print(M + " ");
        System.out.print(oldman+" ");
        System.out.print(youngman);
    }
}