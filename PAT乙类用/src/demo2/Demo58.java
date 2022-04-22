package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Date 2022/3/25 13:13
 * 1058 选择题 (20 分)
 * 2022/03/25 14:35:55 部分正确  16	编程题	Java (javac)	300 ms
 * 测试点3超时，而且用了这么久..
 *
 * 哈哈，改不了，改了两个循环还是超时，尽管如此，优化的过程还是有意思
 **/
public class Demo58 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line.split("\\s+")[0]), M = Integer.parseInt(line.split("\\s+")[1]);
        int[] scores = new int[M];
        int[] mistakes = new int[M];
        String[] answer = new String[M];
        for (int i = 0; i < M; i++) {
            String temp = br.readLine();
            String[] split = temp.split("\\s+");
            scores[i] = Integer.parseInt(split[0]);
            //ans[i] = temp.substring(temp.length()- Integer.parseInt(split[2])-1,temp.length());
            //答案越多，空格越多，需要考虑长度，则使用数组的切割
            String[] temp_answer = new String[Integer.parseInt(split[2])];
            System.arraycopy(split, 3, temp_answer, 0, Integer.parseInt(split[2]));
            answer[i] = Arrays.toString(temp_answer);
        }
        //String[] student_ans = new String[M];
        //System.out.println(Arrays.toString(answer));
        boolean flag = true;
        for (int i = 0; i < N; i++) {
            int score = 0;
            String temp = br.readLine();
            String[] student_ans = temp.split("\\) \\(");
            student_ans[0] = student_ans[0].replaceFirst("\\(","");
            student_ans[M-1] = student_ans[M-1].replaceFirst("\\)","");

            for (int j = 0; j < M; j++) {
                //匹配答案
                //System.out.println(student_ans[j]);
                /*System.out.println(student_ans[j].toString().substring(2, student_ans[j].length()).replaceAll(" ",""));
                System.out.println("=========");
                System.out.println((answer[j].replace("[","").replace("]","").replace(" ","").replaceAll(",","")));*/
                if (student_ans[j].toString().substring(2, student_ans[j].length()).replaceAll(" ","").equals
                        ((answer[j].replace("[","").replace("]","").replace(" ","").replaceAll(",","")))){
                    score += scores[j];
                }else {
                    //错了统计个数
                    mistakes[j] += 1;
                    //没到这来说明没错，可以减少后面循环
                    flag  = false;
                }
            }
            System.out.println(score);
        }
        br.close();
        //遍历错误的题目个数  M个   如果全部为0打印Too simple  ，如果有相同的，按照题目顺序打印

        //System.out.println(Arrays.toString(mistakes));
        /*int t = 0;
        for (; t < M; t++) {
            if (!(mistakes[t]==0)) break;
        }*/
        if (flag){
            System.out.println("Too simple");
        }else {
            int max = mistakes[0];
            int max_index = 0;
            String other = "";
            for (int i = 0; i < M; i++) {
                if (max == mistakes[i]) other+=" "+(i+1);
                //找到第一个最大的数字，然后打印其他和最大的相同的下标
                if (max < mistakes[i]){
                    max = mistakes[i];
                    max_index = i;
                }
            }

            System.out.println(max +" "+ (max_index+1) + other.substring(2));
        }

    }
}
