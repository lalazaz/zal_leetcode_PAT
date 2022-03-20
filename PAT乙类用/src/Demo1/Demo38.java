package Demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/13 17:48
 * 1038 统计同成绩学生 (20 分)
 * 2022/03/13 18:07:15	 部分正确  14	编程题	Java (javac)	250 ms
 * 最后一个点超时了，但在牛客过了
 **/
public class Demo38 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(br.readLine());
        String line2 = br.readLine();
        String line3 = br.readLine();
        br.close();
        String[] split = line2.split("\\s+");
        int[] nums = new int[N];
        for (int i = 0; i < split.length; i++) {
            nums[i] = Integer.parseInt(split[i]);
        }
        String[] split1 = line3.split("\\s+");
        int M = Integer.parseInt(split1[0]);
        int[] my_nums = new int[M];
        int[] res = new int[M];
        for (int i = 1; i < split1.length; i++) {
            my_nums[i-1] = Integer.parseInt(split1[i]);
        }

        for (int i = 0; i < my_nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (my_nums[i] == nums[j]){
                    res[i]++;
                }
            }
        }
        int k = 0;
        for (; k < res.length-1; k++) {
            System.out.print(res[k]+" ");
        }
        System.out.println(res[k]);
    }
}
